
package dados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Adotante;
import modelo.Animal;
import modelo.Doador;

public class Dados implements Serializable {
    
    private ArrayList<Animal> animais;
    private ArrayList<Doador> doadores;
    private ArrayList<Adotante> adotantes;
    
    public Dados() {
        animais = new ArrayList<>();
        doadores = new ArrayList<>();
        adotantes = new ArrayList<>();
    }
    
    public ArrayList<Animal> getAnimais() {
        return animais;
    }
    public ArrayList<Doador> getDoadores() {
        return doadores;
    }
    public ArrayList<Adotante> getAdotantes() {
        return adotantes;
    }
    
    public void adicionaAnimal(Animal a) {
        animais.add(a);
    }
    public void adicionaDoador(Doador d) {
        doadores.add(d);
    }
    public void adicionaAdotante(Adotante a) {
        adotantes.add(a);
    }
    
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
    
    // REEDITAR e REMOVER
    public void removerAnimalComId(int id) {
        for (Animal a: animais) {
            if (a.getId() == id) {
                animais.remove(a);
                return;
            }
        }
    }

    public void removerDoadorComId(int id) {
        for (Doador a: doadores) {
            if (a.getId() == id) {
                doadores.remove(a);
                return;
            }
        }
    }

    public void removerAdotanteComId(int id) {
        for (Adotante a: adotantes) {
            if (a.getId() == id) {
                adotantes.remove(a);
                return;
            }
        }
    }
    
    
}
