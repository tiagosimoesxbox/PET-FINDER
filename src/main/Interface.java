
package main;

import dados.Dados;
import modelo.estados.Estado;
import java.io.*;
import java.util.*;
import modelo.*;

public class Interface {
    
    private Estado estadoAtual;
    private Dados dados;
    private final static String nomeBD = "base_de_dados";
    
    public Interface() {
        estadoAtual = null;
        dados = carregaDados();
    }
    
    public void iniciar() {
        
        Scanner sc = new Scanner(System.in); 
        
        while (true) {
        
            System.out.println("\n\n--------------- PET FINDER ---------------");
            System.out.println("\nSelecionar opção pretendida:\n");
            System.out.println("1) Gerir animais");
            System.out.println("2) Gerir adotantes");
            System.out.println("3) Gerir doadores");
            System.out.println("4) Terminar programa");
            System.out.print("> ");

            try {
                int opcao = Integer.valueOf(sc.nextLine());
                switch (opcao) {
                    case 1:
                        gerirAnimais(sc);
                        break;
                    case 2:
                        gerirAdotante(sc);
                        break;
                    case 3:
                        gerirDoadores(sc);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("[ERRO] Parâmetro inválido.");
                        System.out.println("[INFO] Inserir valor numérico entre 1 e 4");
                        break;
                }
            } 
            catch (NumberFormatException e) {
                System.out.println("[ERRO] Parâmetro inválido");
                System.out.println("[INFO] Inserir valor numérico entre 1 e 4");
            }
        
        } // fim do while
        
    }
    
    public void registarAnimal() {
        
    }
    public void registarDoador() {
        
    }
    public void registarAdotante() {
        
    }
    
    public void eliminarRegistoAnimal() {
        
    }
    public void eliminarRegistoDoador() {
        
    }
    public void eliminarRegistoAdotante() {
        
    }
    
    public void editarRegistoAnimal() {
        
    }
    public void editarRegistoDoador() {
        
    }
    public void editarRegistoAdotante() {
        
    }
    
    public void listarRegistosAnimais() {
        
    }
    public void listarRegistosDoadores() {
        
    }
    public void listarRegistosAdotantes() {
        
    }
    
    // boolean => inserir (true) ou editar (false)
    public void formularioAnimal(boolean inserir) {
        
    }
    public void formularioDoador(boolean inserir) {
        
    }
    public void formularioAdotante(boolean inserir) {
        
    }
    
    /*
    devolve uma lista com os animais que têm o nome NOME
    */
    public ArrayList<Animal> getPesquisaFiltradaAnimais(String nome) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ArrayList<Doador> getPesquisaFiltradaDoador(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ArrayList<Adotante> getPesquisaFiltradaAdotante(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void guardaDados() {
        
        try {
            ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(nomeBD));
            fout.writeUnshared(dados);
            fout.flush();
            fout.close();
        }
        catch (IOException e) {
            System.err.println("[ERRO] Impossivel guardar o ficheiro" + e);
        }
        
    }
    public Dados carregaDados() {
        
        Dados d = new Dados();
        boolean excepcao = false;
        
        try {
            
            System.out.println("[INFO] A carregar os dados anteriores ...");
            
            ObjectInputStream fin = new ObjectInputStream(new FileInputStream(nomeBD));
            d = (Dados)fin.readObject();
            
            System.out.println("[SUCESSO] OS dados anteriores carregados com sucesso!");
        }
        catch (IOException | ClassNotFoundException e) {
            excepcao = true;
        }
        
        if (excepcao) {
            try {
                System.out.println("[AVISO] Não existem dados anteriores. Criada nova base de dados ...");
                FileOutputStream fout = new FileOutputStream(nomeBD);
                fout.close();
            }
            catch (IOException ex) {
                System.err.println("[ERRO] Problema no sistema. Recorrer ao técnico, erro = " + ex);
                System.exit(1);
            }
        }
        
        return d;
    }

    private void gerirAnimais(Scanner sc) {
        
        while (true) {
        
            System.out.println("\n\n--------------- PET FINDER ---------------");
            System.out.println("\nANIMAIS:");
            System.out.println("\nSelecionar opção pretendida:\n");
            System.out.println("1) Registar novo animal");
            System.out.println("2) Eliminar registo");
            System.out.println("3) Editar registo");
            System.out.println("4) Listar todos os registos");
            System.out.println("5) Voltar ao menu principal");
            System.out.print("> ");

            try {
                int opcao = Integer.valueOf(sc.nextLine());
                switch (opcao) {
                    case 1:
                        registarAnimal();
                        break;
                    case 2:
                        eliminarRegistoAnimal();
                        break;
                    case 3:
                        editarRegistoAnimal();
                        break;
                    case 4:
                        listarRegistosAnimais();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("[ERRO] Parâmetro inválido.");
                        System.out.println("[INFO] Inserir valor numérico entre 1 e 5");
                        break;
                }
            } 
            catch (NumberFormatException e) {
                System.out.println("[ERRO] Parâmetro inválido");
                System.out.println("[INFO] Inserir valor numérico entre 1 e 5");
            }
        
        } // fim do while
    }

    private void gerirAdotante(Scanner sc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void gerirDoadores(Scanner sc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
