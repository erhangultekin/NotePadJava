/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ozlem
 */
public class KelimeTest {
    
    public KelimeTest() {
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
     * Test of getKelime method, of class Kelime.
     */
    @Test
    public void testGetKelime() {
        System.out.println("getKelime");
        Kelime instance = null;
        String expResult = "";
        String result = instance.getKelime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKelime method, of class Kelime.
     */
    @Test
    public void testSetKelime() {
        System.out.println("setKelime");
        String kelime = "";
        Kelime instance = null;
        instance.setKelime(kelime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUzunluk method, of class Kelime.
     */
    @Test
    public void testGetUzunluk() {
        System.out.println("getUzunluk");
        Kelime instance = null;
        int expResult = 0;
        int result = instance.getUzunluk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUzunluk method, of class Kelime.
     */
    @Test
    public void testSetUzunluk() {
        System.out.println("setUzunluk");
        int uzunluk = 0;
        Kelime instance = null;
        instance.setUzunluk(uzunluk);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Kelime.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Kelime instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Kelime.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Kelime kelime2 = null;
        Kelime instance = null;
        boolean expResult = false;
        boolean result = instance.equals(kelime2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of singleTransposition method, of class Kelime.
     */
    @Test
    public void testSingleTransposition() {
        System.out.println("singleTransposition");
        Kelime kelime2 = null;
        Kelime instance = null;
        instance.singleTransposition(kelime2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
