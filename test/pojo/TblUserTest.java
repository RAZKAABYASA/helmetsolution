/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

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
public class TblUserTest {
    
    public TblUserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save_user method, of class TblUser.
     */
    @Test
    public void testSave_user() {
        System.out.println("save_user");
        TblUser instance = new TblUser();
        instance.save_user();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login_user method, of class TblUser.
     */
    @Test
    public void testLogin_user() {
        System.out.println("login_user");
        TblUser instance = new TblUser();
        String expResult = "";
        String result = instance.login_user();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUser method, of class TblUser.
     */
    @Test
    public void testGetIdUser() {
        System.out.println("getIdUser");
        TblUser instance = new TblUser();
        Integer expResult = null;
        Integer result = instance.getIdUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUser method, of class TblUser.
     */
    @Test
    public void testSetIdUser() {
        System.out.println("setIdUser");
        Integer idUser = null;
        TblUser instance = new TblUser();
        instance.setIdUser(idUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class TblUser.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        TblUser instance = new TblUser();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class TblUser.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        TblUser instance = new TblUser();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class TblUser.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        TblUser instance = new TblUser();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class TblUser.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        TblUser instance = new TblUser();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
