package modelo;

import modelo.Dados;
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
    public void testAdicionaAnimal() throws Exception {
        
        System.out.println("adicionaAnimal");
        
        Dados instance = new Dados();
        Animal a = new Animal(instance, "gato", "fru fru", "terrier", 1, false, true);
        

        instance.adicionaAnimal(a);
        assertEquals(instance.getAnimalComId(0), a);
    }

    /**
     * Test of adicionaDoador method, of class Dados.
     */
    @Test
    public void testAdicionaDoador() throws Exception {
        
        System.out.println("adicionaDoador");
        
        Dados instance = new Dados();
        Doador d = new Doador(instance, "joao", "rua abc", 244111333);
        
        instance.adicionaDoador(d);
        assertEquals(instance.getDoadorComId(0), d);
    }

    /**
     * Test of adicionaAdotante method, of class Dados.
     */
    @Test
    public void testAdicionaAdotante() throws Exception {
        
        System.out.println("adicionaAdotante");
        
        Dados instance = new Dados();
        Adotante a = new Adotante(instance, "joao", "rua abc", 244111333);;
        
        instance.adicionaAdotante(a);
        assertEquals(instance.getAdotanteComId(0), a);
    }

    /**
     * Test of getAnimalComId method, of class Dados.
     */
    @Test
    public void testGetAnimalComId() throws Exception {
        System.out.println("getAnimalComId");
        
        Dados instance = new Dados();
        
        Animal esperado = new Animal(instance, "cao", "bobi", "pastor alemao", 2, true, true);
        instance.adicionaAnimal(esperado);
        
        int id = esperado.getId();
        Animal resultado = instance.getAnimalComId(id);
        
        assertEquals(esperado, resultado);
    }

    /**
     * Test of getDoadorComId method, of class Dados.
     */
    @Test
    public void testGetDoadorComId() throws Exception {
        System.out.println("getDoadorComId");
        
        Dados instance = new Dados();
        Doador esperado = new Doador(instance, "tiago", "rua qualquer", 233444111);
        int id = esperado.getId();
        
        instance.adicionaDoador(esperado);
        
        Doador resultado = instance.getDoadorComId(id);
        assertEquals(esperado, resultado);
    }

    /**
     * Test of getAdotanteComId method, of class Dados.
     */
    @Test
    public void testGetAdotanteComId() throws Exception {
        System.out.println("getAdotanteComId");
        
        Dados instance = new Dados();
        Adotante esperado = new Adotante(instance, "tiago", "rua qualquer", 233444111);
        
        int id = esperado.getId();
        instance.adicionaAdotante(esperado);
        
        Adotante resultado = instance.getAdotanteComId(id);
        assertEquals(esperado, resultado);
    }

    /**
     * Test of removerAnimalComId method, of class Dados.
     */
    @Test
    public void testRemoverAnimalComId() throws Exception {
        System.out.println("removerAnimalComId");
        
        Dados instance = new Dados();
        
        boolean esperado = true;
        Animal a = new Animal(instance, "cao", "bobi", "pastor alemao", 2, true, true);
        instance.adicionaAnimal(a);
        boolean resultado = instance.removerAnimalComId(a.getId());
        
        assertEquals(esperado, resultado);
    }

    /**
     * Test of removerDoadorComId method, of class Dados.
     */
    @Test
    public void testRemoverDoadorComId() throws Exception {
        System.out.println("removerDoadorComId");
        
        Dados instance = new Dados();
        
        boolean esperado = true;
        Doador d = new Doador(instance, "tiago", "rua", 233400111);
        instance.adicionaDoador(d);
        boolean resultado = instance.removerDoadorComId(d.getId());
        
        assertEquals(esperado, resultado);
    }

    /**
     * Test of removerAdotanteComId method, of class Dados.
     */
    @Test
    public void testRemoverAdotanteComId() throws Exception {
        System.out.println("removerAdotanteComId");
        
        int id = 1;
        Dados instance = new Dados();
        
        boolean esperado = true;
        Adotante a = new Adotante(instance, "tiago", "rua", 233400111);
        instance.adicionaAdotante(a);
        boolean resultado = instance.removerAdotanteComId(a.getId());
        
        assertEquals(esperado, resultado);
    }
    
}
