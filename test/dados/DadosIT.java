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
        
        Animal a = new Animal("gato", "fru fru", "terrier", 1, false, true);
        
        Dados instance = new Dados();
        instance.adicionaAnimal(a);
    }

    /**
     * Test of adicionaDoador method, of class Dados.
     */
    @Test
    public void testAdicionaDoador() {
        
        System.out.println("adicionaDoador");
        
        Doador d = new Doador("joao", "rua abc", 244111333);
        
        Dados instance = new Dados();
        instance.adicionaDoador(d);
    }

    /**
     * Test of adicionaAdotante method, of class Dados.
     */
    @Test
    public void testAdicionaAdotante() {
        
        System.out.println("adicionaAdotante");
        
        Adotante a = new Adotante("joao", "rua abc", 244111333);;
        
        Dados instance = new Dados();
        instance.adicionaAdotante(a);
    }

    /**
     * Test of getAnimalComId method, of class Dados.
     */
    @Test
    public void testGetAnimalComId() {
        System.out.println("getAnimalComId");
        
        Dados instance = new Dados();
        
        Animal esperado = new Animal("cao", "bobi", "pastor alemao", 2, true, true);
        instance.adicionaAnimal(esperado);
        
        int id = esperado.getId();
        Animal resultado = instance.getAnimalComId(id);
        
        assertEquals(esperado, resultado);
    }

    /**
     * Test of getDoadorComId method, of class Dados.
     */
    @Test
    public void testGetDoadorComId() {
        System.out.println("getDoadorComId");
        
        Dados instance = new Dados();
        Doador esperado = new Doador("tiago", "rua qualquer", 233444111);
        int id = esperado.getId();
        
        instance.adicionaDoador(esperado);
        
        Doador resultado = instance.getDoadorComId(id);
        assertEquals(esperado, resultado);
    }

    /**
     * Test of getAdotanteComId method, of class Dados.
     */
    @Test
    public void testGetAdotanteComId() {
        System.out.println("getAdotanteComId");
        
        Dados instance = new Dados();
        Adotante esperado = new Adotante("tiago", "rua qualquer", 233444111);
        
        int id = esperado.getId();
        instance.adicionaAdotante(esperado);
        
        Adotante resultado = instance.getAdotanteComId(id);
        assertEquals(esperado, resultado);
    }

    /**
     * Test of removerAnimalComId method, of class Dados.
     */
    @Test
    public void testRemoverAnimalComId() {
        System.out.println("removerAnimalComId");
        
        Dados instance = new Dados();
        
        boolean esperado = true;
        Animal a = new Animal("cao", "bobi", "pastor alemao", 2, true, true);
        instance.adicionaAnimal(a);
        boolean resultado = instance.removerAnimalComId(a.getId());
        
        assertEquals(esperado, resultado);
    }

    /**
     * Test of removerDoadorComId method, of class Dados.
     */
    @Test
    public void testRemoverDoadorComId() {
        System.out.println("removerDoadorComId");
        
        Dados instance = new Dados();
        
        boolean esperado = true;
        Doador d = new Doador("tiago", "rua", 233400111);
        instance.adicionaDoador(d);
        boolean resultado = instance.removerDoadorComId(d.getId());
        
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
        Adotante a = new Adotante("tiago", "rua", 233400111);
        instance.adicionaAdotante(a);
        boolean resultado = instance.removerAdotanteComId(a.getId());
        
        assertEquals(esperado, resultado);
    }
    
}
