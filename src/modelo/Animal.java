
package modelo;

public class Animal implements Registo {
    
    public static int ANIMAIS_ID = 0;
    
    private int id;
    private int idade;
    
    private String nome;
    private String tipoAnimal;
    private String raca;
    
    private boolean vacinado;
    private boolean adotado;
    
    public Animal(final String nome, final String tipoAnimal, final String raca, final int idade, final boolean vacinado, final boolean adotado) {
        id = ANIMAIS_ID++;
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
}
