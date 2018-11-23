
package main;

import modelo.Dados;
import java.util.*;
import java.io.*;
import modelo.*;

public class Interface {
    
    private Dados dados;
    private Scanner sc;
    private final static String NOME_BD = "base_de_dados.dat";
    
    /*
    No construtor são carregados os dados
    */
    public Interface() {
        carregaDados();
    }
    
    /*
    metodo que inicia a interface, o menu principal
    */
    public void iniciar() {
        
        sc = new Scanner(System.in); 
        
        while (true) {
        
            System.out.println("\n\n--------------- PET FINDER ---------------");
            System.out.println("\nSelecionar opção pretendida:\n");
            System.out.println("1) Gerir animais");
            System.out.println("2) Gerir adotantes");
            System.out.println("3) Gerir doadores");
            System.out.println("4) Terminar programa");
            System.out.print("> ");

            String input = sc.nextLine();
            try {
                int opcao = Integer.valueOf(input);
                switch (opcao) {
                    case 1:
                        gerirAnimais();
                        break;
                    case 2:
                        gerirAdotante();
                        break;
                    case 3:
                        gerirDoadores();
                        break;
                    case 4:
                        guardaDados();
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
    
    /*
    metodos de registo do novo animal, doador ou adotante
    */
    private void registarAnimal() {
        
        System.out.println("\n\nRegistar novo animal:\n");
        
        System.out.println("Tipo de animal:");
        System.out.print("> ");
        String tipoAnimal = sc.nextLine();
        
        System.out.println("Nome:");
        System.out.print("> ");
        String nome = sc.nextLine();
        
        System.out.println("Raça:");
        System.out.print("> ");
        String raca = sc.nextLine();

        System.out.println("Idade:");
        System.out.print("> ");
        String idade = sc.nextLine();
        
        System.out.println("Vacinado:");
        System.out.print("> ");
        String vacinado = sc.nextLine();
        
        System.out.println("Adotado:");
        System.out.print("> ");
        String adotado = sc.nextLine();
        
        try {
            
            int idade_int = Integer.valueOf(idade);
            
            if (nome.isEmpty())
                throw new Exception("Campo 'nome' invalido (inserir nome com 1 a 30 caracteres)");
            if (tipoAnimal.isEmpty())
                throw new Exception("Campo 'Tipo de Animal' invalido (inserir tipo de animal com 1 a 30 caracteres)");
            if (raca.isEmpty())
                throw new Exception("Campo 'raca' invalido (inserir raca com 1 a 30 caracteres)");
            
            if (vacinado == null || adotado == null)
                throw new Exception("Campos vazios");
            if (!vacinado.equalsIgnoreCase("SIM") && !vacinado.equalsIgnoreCase("NAO"))
                throw new Exception("Campo 'vacinado' invalido (inserir SIM ou NAO)");
            if (!adotado.equalsIgnoreCase("SIM") && !adotado.equalsIgnoreCase("NAO"))
                throw new Exception("Campo 'adotado' invalido (inserir SIM ou NAO)");
            
            boolean vacinado_boolean;
            boolean adotado_boolean;
            
            vacinado_boolean = vacinado.equalsIgnoreCase("SIM");
            adotado_boolean = adotado.equalsIgnoreCase("SIM");
            
            dados.adicionaAnimal(new Animal(dados, nome, tipoAnimal, raca, idade_int, vacinado_boolean, adotado_boolean));
            System.out.println("[SUCESSO] Animal registado com sucesso!");
        } 
        catch (Exception e) {
            if (e instanceof NumberFormatException)
                System.out.println("[ERRO] Parâmetros inválidos! (Campo 'idade' inserir valor inteiro de 0 a 20)");
            else
                System.out.println("[ERRO] Parâmetros inválidos! (" + e.getMessage() + ")");
        }
    }
    private void registarDoador() {
        
        System.out.println("Registar novo doador:\n");
        
        System.out.println("Nome:");
        System.out.print("> ");
        String nome = sc.nextLine();
        
        System.out.println("Morada:");
        System.out.print("> ");
        String morada = sc.nextLine();

        System.out.println("Contacto (9 dígitos):");
        System.out.print("> ");
        String contacto = sc.nextLine();
        
        try {
        
            if (nome.isEmpty())
                throw new Exception("Campo 'nome' invalido (inserir nome com 1 a 30 caracteres)");
            if (morada.isEmpty())
                throw new Exception("Campo 'morada' invalido (inserir morada com 1 a 30 caracteres)");
            if (contacto.isEmpty())
                throw new Exception("Campo 'contacto' invalido (inserir contacto com 1 a 30 caracteres)");
            
            int contacto_int = Integer.valueOf(contacto);
            dados.adicionaDoador(new Doador(dados, nome, morada, contacto_int));
            System.out.println("[SUCESSO] Doador registado com sucesso!");
        } 
        catch (Exception e) {
            if (e instanceof NumberFormatException)
                System.out.println("[ERRO] Parâmetros inválidos (inserir contacto com 9 digitos)");
            else
                System.out.println("[ERRO] Parâmetros inválidos (" + e.getMessage() + ")");
        }
    }
    private void registarAdotante() {
        
        System.out.println("Registar novo adotante:\n");
        
        System.out.println("Nome:");
        System.out.print("> ");
        String nome = sc.nextLine();
        
        System.out.println("Morada:");
        System.out.print("> ");
        String morada = sc.nextLine();

        System.out.println("Contacto (9 dígitos):");
        System.out.print("> ");
        String contacto = sc.nextLine();
        
        try {
        
            if (nome.isEmpty())
                throw new Exception("Campo 'nome' invalido (inserir nome com 1 a 30 caracteres)");
            if (morada.isEmpty())
                throw new Exception("Campo 'morada' invalido (inserir morada com 1 a 30 caracteres)");
            if (contacto.isEmpty())
                throw new Exception("Campo 'contacto' invalido (inserir contacto com 9 digitos)");
            
            int contacto_int = Integer.valueOf(contacto);
            
            dados.adicionaAdotante(new Adotante(dados, nome, morada, contacto_int));
            System.out.println("[SUCESSO] Adotante registado com sucesso!");
        } 
        catch (Exception e) {
            if (e instanceof NumberFormatException)
                System.out.println("[ERRO] Parâmetros inválidos (inserir contacto com 9 digitos)");
            else
                System.out.println("[ERRO] Parâmetros inválidos (" + e.getMessage() + ")");
        }
        
    }
    
     /*
    metodos de eliminacao de animal, doador ou adotante existentes
    */
    private void eliminarRegistoAnimal() {
        
        System.out.println("\n\nAnimais:");
        ArrayList<Animal> animais = dados.getAnimais();
        
        System.out.println("id\tNome\tAnimal\tRaca\tIdade\tVacinado\tAdotado");
        for (Animal a: animais)
            System.out.println(a);
        
        System.out.println("\nInserir id do animal a remover: ");
        System.out.println("-1) Voltar ao menu principal");
        System.out.print("> ");
        try {
            
            // a opcao é o id
            int opcao = Integer.valueOf(sc.nextLine());
            
            if (opcao >= 0 && opcao <= 1000) {
                if (!dados.removerAnimalComId(opcao))
                    throw new NumberFormatException();
                System.out.println("[SUCESSO] Registo com id = '" + opcao + "' removido.");
            }
            else if (opcao == -1)
                return;
            else
                throw new NumberFormatException(); // Ids negativos ou superiores a 1000 não são válidos
        } 
        catch(NumberFormatException e) {
            System.out.println("[ERRO] Parâmetro inválido (inserir id do registo ou -1 para voltar ao menu principal)");
        }
        
    }
    private void eliminarRegistoDoador() {
        
        System.out.println("\n\nDoadores:");
        ArrayList<Doador> doadores = dados.getDoadores();
        
        System.out.println("id\tnome\tmorada\tcontacto");
        for (Doador a: doadores)
            System.out.println(a);
        
        System.out.println("\nInserir id do doador a remover: ");
        System.out.println("-1) Voltar ao menu principal");
        System.out.print("> ");
        
        try {
            
            // a opcao é o id
            int opcao = Integer.valueOf(sc.nextLine());
            
            if (opcao >= 0 && opcao <= 1000) {
                if (!dados.removerDoadorComId(opcao))
                    throw new NumberFormatException();
                System.out.println("[SUCESSO] Registo com id = '" + opcao + "' removido.");
            }
            else if (opcao == -1)
                return;
            else
                throw new NumberFormatException(); // Ids negativos ou superiores a 1000 não são válidos
        } 
        catch(NumberFormatException e) {
            System.out.println("[ERRO] Parâmetro inválido (inserir id do registo ou -1 para voltar ao menu principal)");
        }
    }
    private void eliminarRegistoAdotante() {
        
        System.out.println("\n\nAdotantes:");
        ArrayList<Adotante> adotantes = dados.getAdotantes();
        
        System.out.println("id\tnome\tmorada\tcontacto");
        for (Adotante a: adotantes)
            System.out.println(a);
        
        System.out.println("\nInserir id do adotante a remover: ");
        System.out.println("-1) Voltar ao menu principal");
        System.out.print("> ");
        
        try {
            
            // a opcao é o id
            int opcao = Integer.valueOf(sc.nextLine());
            
            if (opcao >= 0 && opcao <= 1000) {
                if (!dados.removerAdotanteComId(opcao))
                    throw new NumberFormatException();
                System.out.println("[SUCESSO] Registo com id = '" + opcao + "' removido.");
            }
            else if (opcao == -1)
                return;
            else
                throw new NumberFormatException(); // Ids negativos ou superiores a 1000 não são válidos
        } 
        catch(NumberFormatException e) {
            System.out.println("[ERRO] Parâmetro inválido (inserir id do registo ou -1 para voltar ao menu principal)");
        }
        
    }
    
    /*
    metodos de edicao de animal, doador ou adotante existentes
    */
    private void editarRegistoAnimal() {
        
        System.out.println("\n\nAnimais:");
        ArrayList<Animal> animais = dados.getAnimais();
        
        System.out.println("id\tNome\tAnimal\tRaca\tIdade\tVacinado\tAdotado");
        for (Animal a: animais)
            System.out.println(a);
        
        System.out.println("\nInserir id do registo a editar");
        System.out.println("-1) Voltar ao menu principal");
        System.out.print("> ");
        
        int opcao = Integer.valueOf(sc.nextLine());
        
        try {
            if (opcao == -1)
                return;
            else if (opcao >= 0 && opcao <= 1000) {
                Animal existente = dados.getAnimalComId(opcao);

                if (existente == null) {
                    System.out.println("[ERRO] Parâmetros inválidos (animal com id = '" + opcao + "' nao existe)");
                    return;
                }

                System.out.println("\nEditar animal:\n");
                
                System.out.println("Tipo de animal:");
                System.out.print("> ");
                String tipoAnimal = sc.nextLine();

                System.out.println("Nome:");
                System.out.print("> ");
                String nome = sc.nextLine();

                System.out.println("Raça:");
                System.out.print("> ");
                String raca = sc.nextLine();

                System.out.println("Idade:");
                System.out.print("> ");
                String idade = sc.nextLine();

                System.out.println("Vacinado:");
                System.out.print("> ");
                String vacinado = sc.nextLine();

                System.out.println("Adotado:");
                System.out.print("> ");
                String adotado = sc.nextLine();

                try {

                    boolean vacinado_boolean = Boolean.valueOf(vacinado);
                    boolean adotado_boolean = Boolean.valueOf(adotado);
                    int idade_int = Integer.valueOf(idade);

                    existente.reeditarAnimal(nome, tipoAnimal, raca, idade_int, vacinado_boolean, adotado_boolean);
                    System.out.println("[SUCESSO] Animal editado com sucesso!");
                } 
                catch (NumberFormatException e) {
                    System.out.println("[ERRO] Parâmetros inválidos!");
                }
            }
            else
                throw new Exception();
        }
        catch(Exception e) {
            System.out.println("[ERRO] Parâmetros inválidos!");
        }
    }
    private void editarRegistoDoador() {
        
        System.out.println("\n\nDoadores:");
        ArrayList<Doador> doadores = dados.getDoadores();
        
        System.out.println("id\tnome\tmorada\tcontacto");
        for (Doador a: doadores)
            System.out.println(a);
        
        System.out.println("\nInserir id do registo a editar");
        System.out.println("-1) Voltar ao menu principal");
        System.out.print("> ");
        
        int opcao = Integer.valueOf(sc.nextLine());
        
        try {
            if (opcao == -1)
                return;
            else if (opcao >= 0 && opcao <= 1000) {
                Doador existente = dados.getDoadorComId(opcao);
                if (existente == null) {
                    System.out.println("[ERRO] Parâmetros inválidos (doador com id = '" + opcao + "' nao existe)");
                    return;
                }
                
                System.out.println("\nEditar doador:\n");

                System.out.println("Nome:");
                System.out.print("> ");
                String nome = sc.nextLine();

                System.out.println("Morada:");
                System.out.print("> ");
                String morada = sc.nextLine();

                System.out.println("Contacto (9 dígitos):");
                System.out.print("> ");
                String contacto = sc.nextLine();

                try {
                    int contacto_int = Integer.valueOf(contacto);

                    existente.reeditarDoador(nome, morada, contacto_int);
                    System.out.println("[SUCESSO] Doador editado com sucesso!");
                } 
                catch (NumberFormatException e) {
                    System.out.println("[ERRO] Parâmetros inválidos!");
                }
            }
        }
        catch(Exception e) {
                System.out.println("[ERRO] Parâmetros inválidos!");
        }
    }
    private void editarRegistoAdotante() {
        
        System.out.println("\n\nAdotantes:");
        ArrayList<Adotante> adotantes = dados.getAdotantes();
        
        System.out.println("id\tnome\tmorada\tcontacto");
        for (Adotante a: adotantes)
            System.out.println(a);
                
        System.out.println("\nInserir id do registo a editar");
        System.out.println("-1) Voltar ao menu principal");
        System.out.print("> ");
        
        int opcao = Integer.valueOf(sc.nextLine());
        
        try {
            if (opcao == -1)
                return;
            else if (opcao >= 0 && opcao <= 1000) {
                Adotante existente = dados.getAdotanteComId(opcao);
                if (existente == null) {
                    System.out.println("[ERRO] Parâmetros inválidos (adotante com id = '" + opcao + "' nao existe)");
                    return;
                }
                
                System.out.println("\nEditar adotante:\n");

                System.out.println("Nome:");
                System.out.print("> ");
                String nome = sc.nextLine();

                System.out.println("Morada:");
                System.out.print("> ");
                String morada = sc.nextLine();

                System.out.println("Contacto (9 dígitos):");
                System.out.print("> ");
                String contacto = sc.nextLine();

                try {
                    int contacto_int = Integer.valueOf(contacto);

                    existente.reeditarAdotante(nome, morada, contacto_int);
                    System.out.println("[SUCESSO] Adotante editado com sucesso!");
                } 
                catch (NumberFormatException e) {
                    System.out.println("[ERRO] Parâmetros inválidos!");
                }
            }
            else
                throw new Exception();
        }
        catch (Exception e) {
            System.out.println("[ERRO] Parâmetros inválidos!");
        }
        
    }
    
    /*
    metodos para listar animais, doadores ou adotantes existentes
    */
    private void listarRegistosAnimais() {
        
        System.out.println("\n\nAnimais:");
        ArrayList<Animal> animais = dados.getAnimais();
        
        System.out.println("id\tNome\tAnimal\tRaca\tIdade\tVacinado\tAdotado");
        for (Animal a: animais)
            System.out.println(a);
        
        while (true) {
            System.out.println("\n1) Pesquisar pelo nome");
            System.out.println("-1) Voltar ao menu principal");
            System.out.print("> ");

            try {
                StringTokenizer s = new StringTokenizer(sc.nextLine());
                int opcao = Integer.valueOf(s.nextToken());
                switch (opcao) {
                    case 1:
                        try {
                            String nome = s.nextToken();
                            ArrayList<Animal> animaisComNome = getPesquisaFiltradaAnimais(nome);
                            System.out.println("\nAnimais com o nome '" + nome + "':");
                            for (Animal a: animaisComNome)
                                System.out.println(a);
                        }
                        catch(NoSuchElementException e) {
                            System.out.println("[ERRO] Falta indicar o id");
                        }
                        break;
                    case -1:
                        return;
                    default:
                        throw new NumberFormatException();
                }
            }
            catch (Exception e) {
                System.out.println("[ERRO] Parâmetro inválido" +e);
            }
        }
    }
    private void listarRegistosDoadores() {
        
        System.out.println("\n\nDoadores:");
        ArrayList<Doador> doadores = dados.getDoadores();
        
        System.out.println("id\tnome\tmorada\tcontacto");
        for (Doador a: doadores)
            System.out.println(a);
        
        while (true) {
            System.out.println("\n1) Pesquisar pelo nome");
            System.out.println("-1) Voltar ao menu principal");
            System.out.print("> ");

            try {
                StringTokenizer s = new StringTokenizer(sc.nextLine());
                int opcao = Integer.valueOf(s.nextToken());
                switch (opcao) {
                    case 1:
                        try {
                            String nome = s.nextToken();
                            ArrayList<Doador> doadoresComNome = getPesquisaFiltradaDoadores(nome);
                            System.out.println("\nDoadores com o nome '" + nome + "'");
                            for (Doador a: doadoresComNome)
                                System.out.println(a);
                            }
                        catch(NoSuchElementException e) {
                            System.out.println("[ERRO] Falta indicar o id");
                        }
                        break;
                    case -1:
                        return;
                    default:
                        throw new NumberFormatException();
                }
            }
            catch (Exception e) {
                System.out.println("[ERRO] Parâmetro inválido");
            }
        }
        
    }
    private void listarRegistosAdotantes() {
        
        System.out.println("\n\nAdotantes:");
        ArrayList<Adotante> adotantes = dados.getAdotantes();
        
        System.out.println("id\tnome\tmorada\tcontacto");
        for (Adotante a: adotantes)
            System.out.println(a);
        
        while (true) {
            System.out.println("\n1) Pesquisar pelo nome");
            System.out.println("-1) Voltar ao menu principal");
            System.out.print("> ");

            try {
                StringTokenizer s = new StringTokenizer(sc.nextLine());
                int opcao = Integer.valueOf(s.nextToken());
                switch (opcao) {
                    case 1:
                        try {
                            String nome = s.nextToken();
                            ArrayList<Adotante> adotantesComNome = getPesquisaFiltradaAdotantes(nome);
                            System.out.println("\nAdotantes com o nome '" + nome + "'");
                            for (Adotante a: adotantesComNome)
                                System.out.println(a);
                            }
                        catch(NoSuchElementException e) {
                            System.out.println("[ERRO] Falta indicar o id");
                        }
                        break;
                    case -1:
                        return;
                    default:
                        throw new NumberFormatException();
                }
            }
            catch (Exception e) {
                System.out.println("[ERRO] Parâmetro inválido");
            }
        }
        
    }
    
    /*
    devolve uma lista com os animais que têm o nome 'NOME' (usado na pesquisa filtrada, efetuada pelos metodos 'listarRegistos*')
    */
    private ArrayList<Animal> getPesquisaFiltradaAnimais(String nome) {
       
        ArrayList<Animal> animais = dados.getAnimais();
        ArrayList<Animal> animais_com_nome = new ArrayList<>();
        
        Iterator it = animais.iterator();
        
        while (it.hasNext()) {
            
            Animal a = (Animal) it.next();
            if (a.getNome().equals(nome))
                animais_com_nome.add(a);
        }
        
        return animais_com_nome;
    }
    private ArrayList<Doador> getPesquisaFiltradaDoadores(String nome) {
        
        ArrayList<Doador> doadores = dados.getDoadores();
        ArrayList<Doador> doadores_com_nome = new ArrayList<>();
        
        Iterator it = doadores.iterator();
        
        while (it.hasNext()) {
            
            Doador a = (Doador) it.next();
            
            if (a.getNome().equals(nome))
                doadores_com_nome.add(a);
        }
        
        return doadores_com_nome;
        
    }
    private ArrayList<Adotante> getPesquisaFiltradaAdotantes(String nome) {
        
        
        ArrayList<Adotante> adotantes = dados.getAdotantes();
        ArrayList<Adotante> adotantes_com_nome = new ArrayList<>();
        
        Iterator it = adotantes.iterator();
        
        while (it.hasNext()) {
            
            Adotante a = (Adotante) it.next();
            
            if (a.getNome().equals(nome))
                adotantes_com_nome.add(a);
        }
        
        return adotantes_com_nome;
    }
    
    /*
    metodos que obtêm os dados ou guardam os dados
    */
    private void guardaDados() {
        
        try {
            ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(NOME_BD));
            fout.writeUnshared(dados);
            fout.flush();
            fout.close();
            
            System.out.println("[SUCESSO] Base de dados guardada");
        }
        catch (IOException e) {
            System.err.println("[ERRO] Impossivel guardar o ficheiro" + e);
        }
        
    }
    private void carregaDados() {

        boolean excepcao = false;
        
        try {
            
            System.out.println("[INFO] A carregar os dados anteriores ...");
            
            FileInputStream fin = new FileInputStream(NOME_BD);
            ObjectInputStream oin = new ObjectInputStream(fin);
            dados = (Dados)oin.readObject();
            
            oin.close();
            fin.close();
            System.out.println("[SUCESSO] Os dados anteriores carregados com sucesso!");
        }
        catch (IOException | ClassNotFoundException | ClassCastException e) {
            excepcao = true;
        }
        
        if (excepcao) {
            try {
                System.out.println("[AVISO] Não existem dados anteriores. Criada nova base de dados ...");
                FileOutputStream fout = new FileOutputStream(NOME_BD);
                dados = new Dados();
                fout.close();
            }
            catch (IOException ex) {
                System.err.println("[ERRO] Problema no sistema. Recorrer ao técnico, erro = " + ex);
                System.exit(1);
            }
        }
        
    }
    
    /*
    metodos de gestão de registos (os sub-menus - consultar o SRS - Requisito funcional FR2)
    */
    private void gerirAnimais() {
        
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
    private void gerirAdotante() {
        
        while (true) {
        
            System.out.println("\n\n--------------- PET FINDER ---------------");
            System.out.println("\nADOTANTE:");
            System.out.println("\nSelecionar opção pretendida:\n");
            System.out.println("1) Registar novo adotante");
            System.out.println("2) Eliminar registo");
            System.out.println("3) Editar registo");
            System.out.println("4) Listar todos os registos");
            System.out.println("5) Voltar ao menu principal");
            System.out.print("> ");

            try {
                int opcao = Integer.valueOf(sc.nextLine());
                switch (opcao) {
                    case 1:
                        registarAdotante();
                        break;
                    case 2:
                        eliminarRegistoAdotante();
                        break;
                    case 3:
                        editarRegistoAdotante();
                        break;
                    case 4:
                        listarRegistosAdotantes();
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
    private void gerirDoadores() {
        
        while (true) {
        
            System.out.println("\n\n--------------- PET FINDER ---------------");
            System.out.println("\nDOADORES:");
            System.out.println("\nSelecionar opção pretendida:\n");
            System.out.println("1) Registar novo doador");
            System.out.println("2) Eliminar registo");
            System.out.println("3) Editar registo");
            System.out.println("4) Listar todos os registos");
            System.out.println("5) Voltar ao menu principal");
            System.out.print("> ");

            try {
                int opcao = Integer.valueOf(sc.nextLine());
                switch (opcao) {
                    case 1:
                        registarDoador();
                        break;
                    case 2:
                        eliminarRegistoDoador();
                        break;
                    case 3:
                        editarRegistoDoador();
                        break;
                    case 4:
                        listarRegistosDoadores();
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
    
    
}
