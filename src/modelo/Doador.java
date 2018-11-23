
package modelo;

import java.io.Serializable;

public class Doador implements Registo, Serializable{

    public static int DOADORES_ID = 0;
    static final long serialVersionUID = 1L;
    
    private int id;
    private String nome;
    private String morada;
    private int contacto;
    
    public Doador(Dados d, final String nome, final String morada, final int contacto) throws Exception{
        
        if(nome.length() < 1 || nome.length() > 30)
            throw new Exception("Nome inválido. Limite de caracteres entre 1 e 30.");
        if(morada.length() < 1 || morada.length() > 30)
            throw new Exception("Nome de animal inválido. Limite de caracteres entre 1 e 30.");
        if(contaDigitos(contacto) != 9)
            throw new Exception("Numero invalido telefone invalido (inserir 9 digitos).");
        
        id = d.getIdDoadoresEIncrementa();
        this.nome = nome;
        this.morada = morada;
        this.contacto = contacto;
    }
    
    private int contaDigitos(int num){
        
        int cont = 1;
        
        while(num / 10 != 0){
            num=num/10;
            cont++;
        }
        
        return cont;
    }
    
    public void reeditarDoador(final String nome, final String morada, final int contacto) {
        this.nome = nome;
        this.morada = morada;
        this.contacto = contacto;
    }

    public String getMorada() {
        return morada;
    }

    public int getContacto() {
        return contacto;
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
    
     @Override
    public String toString() {
        String str = id + "\t" + nome + "\t" + morada + "\t" + contacto;
        return str;
    }
    
}
