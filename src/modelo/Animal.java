
package modelo;

import java.io.Serializable;

public class Animal implements Registo, Serializable{
    
    public static int ANIMAIS_ID = 0;
    static final long serialVersionUID = 1L;
    
    private int id;
    private int idade;
    
    private String nome;
    private String tipoAnimal;
    private String raca;
    
    private boolean vacinado;
    private boolean adotado;
    
    public Animal(Dados d, final String nome, final String tipoAnimal, final String raca, final int idade, final boolean vacinado, final boolean adotado) throws Exception{
        if(tipoAnimal.length() < 1 || tipoAnimal.length() > 30)
            throw new Exception("Tipo de animal inválido. Limite de caracteres entre 1 e 30.");
        if(nome.length() < 1 || nome.length() > 30)
            throw new Exception("Nome de animal inválido. Limite de caracteres entre 1 e 30.");
        if(raca.length() < 1 || raca.length() > 30)
            throw new Exception("Raca do animal inválida. Limite de caracteres entre 1 e 30.");
        if(idade < 0 || idade > 20)
            throw new Exception("Idade inválida. Inserir idade de 0 a 20 anos.");
        
        id = d.getIdAnimaisEIncrementa();
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.raca = raca;
        this.idade = idade; 
        this.vacinado = vacinado;
        this.adotado = adotado;
    }
    
    public void reeditarAnimal(final String nome, final String tipoAnimal, final String raca, final int idade, final boolean vacinado, final boolean adotado) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.raca = raca;
        this.idade = idade; 
        this.vacinado = vacinado;
        this.adotado = adotado;
    }
    
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    
    public String getRaca() {
        return raca;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public boolean isVacinado() {
        return vacinado;
    }
    
    public boolean isAdotado() {
        return adotado;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(final int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        String str = id + "\t" + nome + "\t" + tipoAnimal + "\t"
                + raca + "\t" + idade + "\t";
        
        if(vacinado)
            str += "sim\t";
        else
            str += "nao\t";
        
        if(adotado)
            str += "sim\t";
        else
            str += "nao\t";
        
        return str;
    }
}
