/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manad
 */
public class managerLoginTest {
    
    public managerLoginTest() {
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
     * Test of getpassword method, of class managerLogin.
     */
    @Test
    public void testGetpassword() {
        System.out.println("getpassword");
        assertEquals("pass", new managerLogin().getpassword("password"));
        assertEquals("pass", new managerLogin().getpassword("password"));
        assertEquals("pass", new managerLogin().getpassword("password"));
        assertEquals("pass", new managerLogin().getpassword("password"));
        assertEquals("pass", new managerLogin().getpassword("password"));
       
       
    }

    /**
     * Test of main method, of class managerLogin.
     */
   
    
}
