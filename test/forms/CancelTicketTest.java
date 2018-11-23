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
public class CancelTicketTest {
    
    public CancelTicketTest() {
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
     * Test of isvalid method, of class CancelTicket.
     */
    @Test
    public void testIsvalid() {
        System.out.println("isvalid");
        assertEquals(true, new CancelTicket().isvalid(233123));
        assertEquals(true, new CancelTicket().isvalid(233124));
        assertEquals(true, new CancelTicket().isvalid(233125));
        assertEquals(true, new CancelTicket().isvalid(233126));
        assertEquals(true, new CancelTicket().isvalid(233127));
      
    }

}
