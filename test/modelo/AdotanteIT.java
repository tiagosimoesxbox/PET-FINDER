/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jpval
 */
public class AdotanteIT {
    
    public AdotanteIT() {
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
     * Test of reeditarAdotante method, of class Adotante.
     */
    @Test
    public void testReeditarAdotante() {
        System.out.println("reeditarAdotante");
        String nome = "";
        String morada = "";
        int contacto = 0;
        Adotante instance = null;
        instance.reeditarAdotante(nome, morada, contacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Adotante.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Adotante instance;
        try {
            instance = new Adotante(new Dados(), "Joao Valerio", "Rua", 913224009);
            int expResult = instance.getId();
            int result = instance.getId();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
    }

    /**
     * Test of setId method, of class Adotante.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Adotante instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Adotante.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Adotante instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContacto method, of class Adotante.
     */
    @Test
    public void testGetContacto() {
        System.out.println("getContacto");
        Adotante instance = null;
        int expResult = 0;
        int result = instance.getContacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMorada method, of class Adotante.
     */
    @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        Adotante instance = null;
        String expResult = "";
        String result = instance.getMorada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
