
package modelo;

public class Doador implements Registo {

    public static int DOADORES_ID = 0;
    
    private int id;
    private String nome;
    private String morada;
    private int contacto;
    
    public Doador(final String nome, final String morada, final int contacto) {
        id = DOADORES_ID++;
        this.nome = nome;
        this.morada = morada;
        this.contacto = contacto;
    }
    
    public void reeditarDoador(final String nome, final String morada, final int contacto) {
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
    
}
