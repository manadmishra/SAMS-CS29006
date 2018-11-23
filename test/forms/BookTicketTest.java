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
public class BookTicketTest {
    
    public BookTicketTest() {
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
     * Test of newid method, of class BookTicket.
     */
    @Test
    public void testNewid() {
        System.out.println("newid");
        assertEquals(123, new BookTicket().newid(122));
        assertEquals(124, new BookTicket().newid(123));
        assertEquals(125, new BookTicket().newid(124));
        assertEquals(126, new BookTicket().newid(125));
        assertEquals(127, new BookTicket().newid(126));
    }

    /**
     * Test of showTableData method, of class BookTicket.
     */
    
}
