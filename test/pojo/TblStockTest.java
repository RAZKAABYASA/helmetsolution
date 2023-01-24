/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author faras sakha
 */
public class TblStockTest {
    
    public TblStockTest() {
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

    /**
     * Test of getAllRecords method, of class TblStock.
     */
    @Test
    public void testGetAllRecords() {
        System.out.println("getAllRecords");
        TblStock instance = new TblStock();
        List<TblStock> expResult = null;
        List<TblStock> result = instance.getAllRecords();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getById method, of class TblStock.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        TblStock instance = new TblStock();
        String expResult = "";
        String result = instance.getById();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of edit method, of class TblStock.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        TblStock instance = new TblStock();
        instance.edit();
       
    }

    /**
     * Test of delete method, of class TblStock.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        TblStock instance = new TblStock();
        instance.delete();
        
    }

    /**
     * Test of getIdBarang method, of class TblStock.
     */
    @Test
    public void testGetIdBarang() {
        System.out.println("getIdBarang");
        TblStock instance = new TblStock();
        Integer expResult = null;
        Integer result = instance.getIdBarang();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIdBarang method, of class TblStock.
     */
    @Test
    public void testSetIdBarang() {
        System.out.println("setIdBarang");
        Integer idBarang = null;
        TblStock instance = new TblStock();
        instance.setIdBarang(idBarang);
        
    }

    /**
     * Test of getNamaHelm method, of class TblStock.
     */
    @Test
    public void testGetNamaHelm() {
        System.out.println("getNamaHelm");
        TblStock instance = new TblStock();
        String expResult = "";
        String result = instance.getNamaHelm();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNamaHelm method, of class TblStock.
     */
    @Test
    public void testSetNamaHelm() {
        System.out.println("setNamaHelm");
        String namaHelm = "";
        TblStock instance = new TblStock();
        instance.setNamaHelm(namaHelm);
        
    }

    /**
     * Test of getJenisHelm method, of class TblStock.
     */
    @Test
    public void testGetJenisHelm() {
        System.out.println("getJenisHelm");
        TblStock instance = new TblStock();
        String expResult = "";
        String result = instance.getJenisHelm();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setJenisHelm method, of class TblStock.
     */
    @Test
    public void testSetJenisHelm() {
        System.out.println("setJenisHelm");
        String jenisHelm = "";
        TblStock instance = new TblStock();
        instance.setJenisHelm(jenisHelm);
        
    }

    /**
     * Test of getStockHelm method, of class TblStock.
     */
    @Test
    public void testGetStockHelm() {
        System.out.println("getStockHelm");
        TblStock instance = new TblStock();
        String expResult = "";
        String result = instance.getStockHelm();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStockHelm method, of class TblStock.
     */
    @Test
    public void testSetStockHelm() {
        System.out.println("setStockHelm");
        String stockHelm = "";
        TblStock instance = new TblStock();
        instance.setStockHelm(stockHelm);
        
    }
    
}
