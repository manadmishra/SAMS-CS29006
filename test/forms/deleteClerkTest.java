/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

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
public class deleteClerkTest {
    
    public deleteClerkTest() {
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
     * Test of isvalid method, of class deleteClerk.
     */
    @Test
    public void testIsvalid() {
        System.out.println("isvalid");
        assertEquals(true, new deleteClerk().isvalid(0));
        assertEquals(true, new deleteClerk().isvalid(1));
        
        assertEquals(true, new deleteClerk().isvalid(2));
        assertEquals(true, new deleteClerk().isvalid(3));
        assertEquals(true, new deleteClerk().isvalid(4));
        
        
       
    }

    /**
     * Test of showTableData method, of class deleteClerk.
     */
   
}
