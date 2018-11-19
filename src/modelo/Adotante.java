
package modelo;

public class Adotante implements Registo {

    public static int ADOTANTES_ID = 0;
    
    private int id;
    private String nome;
    private String morada;
    private int contacto;
    
    public Adotante(final String nome, final String morada, final int contacto) {
        id = ADOTANTES_ID++;
        this.nome = nome;
        this.morada = morada;
        this.contacto = contacto;
    }
    
    public void reeditarAdotante(final String nome, final String morada, final int contacto) {
        this.nome = nome;
        this.morada = morada;
        this.contacto = contacto;
    }
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public int getContacto() {
        return contacto;
    }

    public String getMorada() {
        return morada;
    }
    
    
    
}
