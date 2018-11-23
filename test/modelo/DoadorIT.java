/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joao
 */
public class DoadorIT {
    
    public DoadorIT() {
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
     * Test of reeditarDoador method, of class Doador.
     */
    @Test
    public void testReeditarDoador() throws Exception {
        System.out.println("reeditarDoador");
        String nome = "";
        String morada = "";
        int contacto = 0;
        Doador instance = new Doador(new Dados(), "Joao", "Rua", 912345678);
        instance.reeditarDoador(nome, morada, contacto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMorada method, of class Doador.
     */
    @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        Doador instance = null;
        String expResult = "";
        String result = instance.getMorada();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContacto method, of class Doador.
     */
    @Test
    public void testGetContacto() {
        System.out.println("getContacto");
        Doador instance = null;
        int expResult = 0;
        int result = instance.getContacto();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Doador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Doador instance = null;
        int expResult = 0;
        int result = instance.getId();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Doador.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Doador instance = null;
        //instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Doador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Doador instance = null;
        String expResult = "";
        String result = instance.getNome();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Doador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Doador instance = null;
        String expResult = "";
        String result = instance.toString();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
