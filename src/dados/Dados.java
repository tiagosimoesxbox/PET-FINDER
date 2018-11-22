
package dados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Adotante;
import modelo.Animal;
import modelo.Doador;

public class Dados implements Serializable {
    
    private final ArrayList<Animal> animais;
    private final ArrayList<Doador> doadores;
    private final ArrayList<Adotante> adotantes;
    
    public int ADOTANTES_ID = 0;
    public int ANIMAIS_ID = 0;
    public int DOADORES_ID = 0;
    
    
    public int getIdAdotantesEIncrementa() {
        return ADOTANTES_ID++;
    }
    public int getIdAnimaisEIncrementa() {
        return ANIMAIS_ID++;
    }
    public int getIdDoadoresEIncrementa() {
        return DOADORES_ID++;
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
        
        while (it.hasNext()) {
            Animal a = (Animal) it.next();
            if (a.getId() == id)
                return a;
        }
        
        return null;
    }
    public Doador getDoadorComId(int id) {
        Iterator it = doadores.iterator();
        
        while (it.hasNext()) {
            Doador a = (Doador) it.next();
            if (a.getId() == id)
                return a;
        }
        
        return null;
    }
    public Adotante getAdotanteComId(int id) {
        Iterator it = adotantes.iterator();
        
        while (it.hasNext()) {
            Adotante a = (Adotante) it.next();
            if (a.getId() == id)
                return a;
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
