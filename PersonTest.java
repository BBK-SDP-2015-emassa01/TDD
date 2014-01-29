/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Esha
 */
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getInitials method, of class Person.
     */
    @Test
    public void testGetInitials() {
        System.out.println("getInitials");
        String fullName = "Esha Massand";
        Person instance = new Person();
        String expResult = "EM";
        String result = instance.getInitials(fullName);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testDoubleSpaceGetInitials() {
        System.out.println("getInitials");
        String fullName = "Esha  Massand";
        Person instance = new Person();
        String expResult = "EM";
        String result = instance.getInitials(fullName);
        assertEquals(expResult, result);

    }
    
}
