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
public class salesPersonLoginTest {

    public salesPersonLoginTest() {
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
     * Test of getpassword method, of class salesPersonLogin.
     */
    @Test
    public void testGetpassword() {
        System.out.println("getpassword");
        assertEquals("mishra", new salesPersonLogin().getpassword("Manad"));
        assertEquals("misdashra", new salesPersonLogin().getpassword("Manad"));
        assertEquals("mishrqwa", new salesPersonLogin().getpassword("Manad"));
        assertEquals("mise2hra", new salesPersonLogin().getpassword("Manad"));
        assertEquals("mishqwea", new salesPersonLogin().getpassword("Manad"));

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class salesPersonLogin.
     */
}
