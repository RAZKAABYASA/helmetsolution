/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.TblStock;
import pojo.helmetsolution4Util;

/**
 *
 * @author faras sakha
 */
public class DAOuserTest {
    
    public DAOuserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("///START TESTING///");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("///END TESTING///");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /*testRetrieveTblStock memiliki fungsi yaitu untuk mengetest apakah method
    ini berhasil menampilkan seluruh produk helmet dari database table secara benar,
    Langkah pertama untuk ini adalah mengubah result menjadi array. Setelah itu mencari 
    panjang array tersebut. Jika Array tidak kosong, maka test ini berhasil dijalankan.*/
    @Test
    public void testRetrieveTblStock() {
        System.out.println("Method Testing List Product");
        DAOuser instance = new DAOuser();
        List<TblStock> result = instance.retrieveTblStock();
        System.out.println("The Total of Products are :" + result.toArray().length);
        assertFalse(result.isEmpty());
        
    }
    

    /*testDeleteStock memiliki fungsi*/
    @Test
    public void testDeleteStock() {
        System.out.println("Method Testing Delete Stock");
        Integer idS = 7;
        DAOuser instance = new DAOuser();
        
        Transaction trans = null;
        Session session = helmetsolution4Util.getSessionFactory().openSession();
        trans = session.beginTransaction();
        
        instance.deleteStock(idS);
        trans.commit();
        TblStock delstk = (TblStock) session.get(TblStock.class, idS);
        
        assertNull(delstk);
        
    }

    /*testEditStock memiliki fungsi*/
    @Test
    public void testEditStock() {
        System.out.println("Method Testing Edit Stock");
        
        DAOuser instance = new DAOuser();
        Transaction trans = null;
        Session session = helmetsolution4Util.getSessionFactory().openSession();
        
        Integer id = 3;
        TblStock stk = new TblStock();
        stk.setIdBarang(id);
        stk.setNamaHelm("Helm Bogo Retro");
        stk.setJenisHelm("Bogo");
        stk.setStockHelm("7");
        
        trans = session.beginTransaction();
        instance.editStock(stk);
        trans.commit();
        
        TblStock newstk = (TblStock) session.get(TblStock.class, id);
        
        String expResult = "7";
        String result = newstk.getStockHelm();
        assertEquals(expResult, result);
        
    }
    
}
