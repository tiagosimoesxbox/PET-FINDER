
package dados;

import java.util.ArrayList;
import modelo.Adotante;
import modelo.Animal;
import modelo.Doador;

public class Dados {
    
    private ArrayList<Animal> animais;
    private ArrayList<Doador> doadores;
    private ArrayList<Adotante> adotantes;
    
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
    
    public void getAnimal(int pos) {
        animais.get(pos);
    }
    public void adicionaDoador(int pos) {
        doadores.get(pos);
    }
    public void adicionaAdotante(int pos) {
        adotantes.get(pos);
    }
    
    // REEDITAR e REMOVER
    
    
}
