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
public class AnimalIT {
    
    public AnimalIT() {
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
     * Test of reeditarAnimal method, of class Animal.
     */
    @Test
    public void testReeditarAnimal() throws Exception {
        System.out.println("reeditarAnimal");
        Animal instance = new Animal(new Dados(), "Cao", "Caniche", "Bobi", 2, true, false);
        instance.reeditarAnimal("Cao", "Caniche", "Bobi", 2, true, false);
        // TODO review the generated test code and remove the default call to fail.
        //assertEquals();
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoAnimal method, of class Animal.
     */
    @Test
    public void testGetTipoAnimal() {
        System.out.println("getTipoAnimal");
        Animal instance = null;
        String expResult = "";
        String result = instance.getTipoAnimal();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRaca method, of class Animal.
     */
    @Test
    public void testGetRaca() {
        System.out.println("getRaca");
        Animal instance = null;
        String expResult = "";
        String result = instance.getRaca();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdade method, of class Animal.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        Animal instance = null;
        int expResult = 0;
        int result = instance.getIdade();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isVacinado method, of class Animal.
     */
    @Test
    public void testIsVacinado() throws Exception {
        System.out.println("isVacinado");
        
        boolean vacinado = true;
        
        Animal instance = new Animal(new Dados(), "Cao", "Caniche", "Bobi", 2, vacinado, false);
        boolean expResult = vacinado;
        boolean result = instance.isVacinado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isAdotado method, of class Animal.
     */
    @Test
    public void testIsAdotado() throws Exception {
        System.out.println("isAdotado");
        
        boolean adotado = true;
        
        Animal instance = new Animal(new Dados(), "Cao", "Caniche", "Bobi", 2, false, adotado);
        boolean expResult = adotado;
        boolean result = instance.isAdotado();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Animal.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Animal instance = null;
        int expResult = 0;
        int result = instance.getId();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Animal.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Animal instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Animal.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Animal instance = null;
        String expResult = "";
        String result = instance.getNome();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Animal.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Animal instance = null;
        String expResult = "";
        String result = instance.toString();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
