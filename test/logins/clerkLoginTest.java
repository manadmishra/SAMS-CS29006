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
public class clerkLoginTest {
    
    public clerkLoginTest() {
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
     * Test of getpassword method, of class clerkLogin.
     */
    @Test
    public void testGetpassword() {
        System.out.println("getpassword");
        assertEquals("Wayne", new clerkLogin().getpassword("Bruce"));
        assertEquals("121", new clerkLogin().getpassword("masndas"));
        assertEquals("Way12ne", new clerkLogin().getpassword("Bruce"));
        assertEquals("11321", new clerkLogin().getpassword("masndas"));
        assertEquals("Wa231yne", new clerkLogin().getpassword("Bruce"));
        assertEquals("121211", new clerkLogin().getpassword("masndas"));
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class clerkLogin.
     */
    
    
}
