/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import modelo.Adotante;
import modelo.Animal;
import modelo.Doador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tiago
 */
public class DadosIT {
    
    
    public DadosIT() {
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
     * Test of getAnimais method, of class Dados.
     */
    @Test
    public void testGetAnimais() {
        System.out.println("getAnimais");
        Dados dados = new Dados();
        ArrayList<Animal> expResult = new ArrayList<>();
        ArrayList<Animal> result = dados.getAnimais();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDoadores method, of class Dados.
     */
    @Test
    public void testGetDoadores() {
        System.out.println("getDoadores");
        Dados instance = new Dados();
        ArrayList<Doador> expResult = new ArrayList<>();
        ArrayList<Doador> result = instance.getDoadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAdotantes method, of class Dados.
     */
    @Test
    public void testGetAdotantes() {
        System.out.println("getAdotantes");
        Dados instance = new Dados();
        ArrayList<Adotante> expResult = new ArrayList<>();
        ArrayList<Adotante> result = instance.getAdotantes();
        assertEquals(expResult, result);
    }

    /**
     * Test of adicionaAnimal method, of class Dados.
     */
    @Test
    public void testAdicionaAnimal() {
        System.out.println("adicionaAnimal");
        Animal a = null;
        Dados instance = new Dados();
        instance.adicionaAnimal(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of adicionaDoador method, of class Dados.
     */
    @Test
    public void testAdicionaDoador() {
        System.out.println("adicionaDoador");
        Doador d = null;
        Dados instance = new Dados();
        instance.adicionaDoador(d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of adicionaAdotante method, of class Dados.
     */
    @Test
    public void testAdicionaAdotante() {
        System.out.println("adicionaAdotante");
        Adotante a = null;
        Dados instance = new Dados();
        instance.adicionaAdotante(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAnimalComId method, of class Dados.
     */
    @Test
    public void testGetAnimalComId() {
        System.out.println("getAnimalComId");
        
        Dados instance = new Dados();
        int id = 0;
        Animal esperado = new Animal("cao", "bobi", "pastor alemao", 2, true, true);
        instance.adicionaAnimal(esperado);
        
        Animal resultado = instance.getAnimalComId(id);
        assertEquals(esperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDoadorComId method, of class Dados.
     */
    @Test
    public void testGetDoadorComId() {
        System.out.println("getDoadorComId");
        
        Dados instance = new Dados();
        int id = 1;
        
        Doador esperado = new Doador("tiago", "rua qualquer", 233444111);
        instance.adicionaDoador(esperado);
        
        Doador resultado = instance.getDoadorComId(id);
        assertEquals(esperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAdotanteComId method, of class Dados.
     */
    @Test
    public void testGetAdotanteComId() {
        System.out.println("getAdotanteComId");
        
        Dados instance = new Dados();
        int id = 0;
        Adotante esperado = new Adotante("tiago", "rua qualquer", 233444111);
        instance.adicionaAdotante(esperado);
        
        Adotante resultado = instance.getAdotanteComId(id);
        assertEquals(esperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removerAnimalComId method, of class Dados.
     */
    @Test
    public void testRemoverAnimalComId() {
        System.out.println("removerAnimalComId");
        
        int id = 1;
        Dados instance = new Dados();
        
        boolean esperado = true;
        instance.adicionaAnimal(new Animal("cao", "bobi", "pastor alemao", 2, true, true));
        boolean resultado = instance.removerAnimalComId(id);
        
        assertEquals(esperado, resultado);
    }

    /**
     * Test of removerDoadorComId method, of class Dados.
     */
    @Test
    public void testRemoverDoadorComId() {
        System.out.println("removerDoadorComId");
        
        int id = 0;
        Dados instance = new Dados();
        
        boolean esperado = true;
        instance.adicionaDoador(new Doador("tiago", "rua", 233400111));
        boolean resultado = instance.removerDoadorComId(id);
        
        assertEquals(esperado, resultado);
    }

    /**
     * Test of removerAdotanteComId method, of class Dados.
     */
    @Test
    public void testRemoverAdotanteComId() {
        System.out.println("removerAdotanteComId");
        
        int id = 1;
        Dados instance = new Dados();
        
        boolean esperado = true;
        instance.adicionaAdotante(new Adotante("tiago", "rua", 233400111));
        boolean resultado = instance.removerAdotanteComId(id);
        
        assertEquals(esperado, resultado);
    }
    
}
