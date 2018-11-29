
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Dados implements Serializable {
    
    private final ArrayList<Animal> animais;
    private final ArrayList<Doador> doadores;
    private final ArrayList<Adotante> adotantes;
    
    /*
    Anteriormente estes ids encontravam-se nas classes Animal, Adotante e Doador
    (Foi usada esta tecnica, porque as variaveis estáticas não são guardadas em ficheiros)
    */
    private int adotantes_id = 0;
    private int animais_id = 0;
    private int doadores_id = 0;
    /*
    Estes metodos são, APENAS, chamados no construtor das classes Animal, Adotante e Doador
    (Foi usada esta tecnica, porque as variaveis estáticas não são guardadas em ficheiros)
    (As classes Animal, Adotante e Doador, nos seus construtores, chamam estes metodos através de uma referência para esta classe "Dados")
    (Exemplo: new Animal(Dados, ...) => no construtor => idAnimal = Dados.getIdAnimaisEIncrementa(); É por essa razão que os métodos são protected)
    */
    protected int getIdAdotantesEIncrementa() {
        return adotantes_id++;
    }
    protected int getIdAnimaisEIncrementa() {
        return animais_id++;
    }
    protected int getIdDoadoresEIncrementa() {
        return doadores_id++;
    }
   
    
    /*
    inicia os arraylist para guardar os animais, adotantes e doadores
    */
    public Dados() {
        animais = new ArrayList<>();
        doadores = new ArrayList<>();
        adotantes = new ArrayList<>();
    }
    
    /*
    geters
    */
    public ArrayList<Animal> getAnimais() {
        return animais;
    }
    public ArrayList<Doador> getDoadores() {
        return doadores;
    }
    public ArrayList<Adotante> getAdotantes() {
        return adotantes;
    }
    
    /*
    adiciona o animal, doador ou adotante no respetivo arraylist
    */
    public void adicionaAnimal(Animal a) {
        animais.add(a);
    }
    public void adicionaDoador(Doador d) {
        doadores.add(d);
    }
    public void adicionaAdotante(Adotante a) {
        adotantes.add(a);
    }
    
    /*
    devolve o animal, doador ou adotante no consoante o respetivo id (devolve null se o id nao existir)
    */
    public Animal getAnimalComId(int id) {
        Iterator it = animais.iterator();
        Animal a;
        
        while (it.hasNext()) {
            a = (Animal) it.next();
            if (a.getId() == id){
                return a;
            }
        }
        
        return null;
    }
    
    public Doador getDoadorComId(int id) {
        Iterator it = doadores.iterator();
        Doador d;
        
        while (it.hasNext()) {
            d = (Doador) it.next();
            if (d.getId() == id){
                    return d;
            }
        }
        
        return null;
    }
    
    public Adotante getAdotanteComId(int id) {
        Iterator it = adotantes.iterator();
        Adotante a;
        
        while (it.hasNext()) {
            a = (Adotante) it.next();
            if (a.getId() == id){
                return a;
            }
        }
        
        return null;
    }
    
    /*
    remove o animal, doador ou adotante consoante o id (devolve true se o id existir, caso contrario devolve false)
    */
    public boolean removerAnimalComId(int id) {
        for (Animal a: animais) {
            if (a.getId() == id) {
                animais.remove(a);
                return true;
            }
        }
        return false;
    }
    
    public boolean removerDoadorComId(int id) {
        for (Doador a: doadores) {
            if (a.getId() == id) {
                doadores.remove(a);
                return true;
            }
        }
        return false;
    }
    
    public boolean removerAdotanteComId(int id) {
        for (Adotante a: adotantes) {
            if (a.getId() == id) {
                adotantes.remove(a);
                return true;
            }
        }
        return false;
    }
    
    
}
