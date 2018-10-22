/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import enums.ETipo;
import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {
    
    static Pokedex pokedex = new Pokedex();

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        menu(ler);
    }
/**
 * Este método mostra o Menu com opções iniciais
 * @param ler 
 */
    private static void menu(Scanner ler) {
        int fim = 0;

        while(fim != 6){
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar Pokemon");
            System.out.println("2 - Remover Pokemon");
            System.out.println("3 - Alterar Pokemon");
            System.out.println("4 - Listar Pokemon");
            System.out.println("5 - Listar todos os Pokemon");
            System.out.println("6 - Sair");

            fim = ler.nextInt();
            
            switch(fim){
                case 1:
                    cadastrar(ler);
                    break;                    
                case 2:
                    remover(ler);
                    break;
                case 3:
                    alterar(ler);
                    break;
                case 4:
                    listar(ler);
                    break;
                case 5:
                    listarTodos();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        System.exit(0);
    }
/**
 * Este método cadastra um Pokemon na Pokedex
 * @param ler 
 */
    private static void cadastrar(Scanner ler) {
        Pokemon pokemon = new Pokemon();
        int opcao = 0;  
        System.out.println("Digite o nome do Pokemon:");
        String nome = ler.next();
        pokemon.setNome(nome);
        while((opcao != 1) || (opcao != 2) || (opcao != 3)
             || (opcao != 4) || (opcao != 5) || (opcao != 6)){            
            System.out.println("Escolha um dos tipos abaixo: ");
            System.out.println("1 - Fogo");
            System.out.println("2 - Água");
            System.out.println("3 - Elétrico");
            System.out.println("4 - Grama");
            System.out.println("5 - Pisiquico");
            opcao = ler.nextInt();
            switch(opcao){
                case 1:
                    pokemon.setTipo(ETipo.FOGO);
                    break;
                case 2:
                    pokemon.setTipo(ETipo.AGUA);
                    break;
                case 3:
                    pokemon.setTipo(ETipo.ELETRICO);
                    break;
                case 4:
                    pokemon.setTipo(ETipo.GRAMA);
                    break;
                case 5:
                    pokemon.setTipo(ETipo.PSIQUICO);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            break;
        }
        int numero;
        System.out.println("Informe o número do Pokemon:");
        numero = ler.nextInt();
        pokemon.setNumero(numero);
        pokedex.adicionaPokemon(pokemon);
        System.out.println("Pokemon cadastrado com sucesso");
        
    }
/**
 * Este método remove um Pokemon da Pokedex
 * @param ler 
 */
    private static void remover(Scanner ler) {
        Pokemon pokemon;
        String nome;
        System.out.println("Informe o nome do Pokemon a ser removido:");
        nome = ler.next();
        pokemon = pokedex.buscaPokemon(nome);
        if(pokemon != null){
            pokedex.removePokemon(nome);
            System.out.println("Pokemon removido com sucesso");
        }else{
            System.out.println("Pokemon informado não está cadastrado");
        }
    }
/**
 * Este método altera um Pokemon cadastrado na Pokedex
 * @param ler 
 */
    private static void alterar(Scanner ler) {
        System.out.println("Informe o nome do Pokemon que será alterado:");
        String nome;
        nome = ler.next();
        Pokemon pokemon = pokedex.buscaPokemon(nome);
        if(pokemon != null){
            int opcao = 0;  
            System.out.println("Digite o nome do Pokemon:");
            nome = ler.next();
            pokemon.setNome(nome);
            while((opcao != 1) || (opcao != 2) || (opcao != 3)
                 || (opcao != 4) || (opcao != 5) || (opcao != 6)){            
                System.out.println("Escolha um dos tipos abaixo: ");
                System.out.println("1 - Fogo");
                System.out.println("2 - Água");
                System.out.println("3 - Elétrico");
                System.out.println("4 - Grama");
                System.out.println("5 - Pisiquico");
                opcao = ler.nextInt();
                switch(opcao){
                    case 1:
                        pokemon.setTipo(ETipo.FOGO);
                        break;
                    case 2:
                        pokemon.setTipo(ETipo.AGUA);
                        break;
                    case 3:
                        pokemon.setTipo(ETipo.ELETRICO);
                        break;
                    case 4:
                        pokemon.setTipo(ETipo.GRAMA);
                        break;
                    case 5:
                        pokemon.setTipo(ETipo.PSIQUICO);
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
                break;
            }
            int numero;
            System.out.println("Informe o número do Pokemon:");
            numero = ler.nextInt();
            pokemon.setNumero(numero);
            pokedex.alteraPokemon(pokemon);
            System.out.println("Pokemon alterado com sucesso");
        }else{
            System.out.println("\"" + nome + "\"" + " não está cadastrado");
        }

    }
/**
 * Este método mostra os dados de um Pokemon cadastrado na Pokedex
 * @param ler 
 */
    private static void listar(Scanner ler) {
        int opcao = 0;
        Pokemon pokemon;
        while((opcao != 1) || (opcao != 2)){
            System.out.println("Escolha uma opçao:\n");
            System.out.println("1 - Listar por nome");
            System.out.println("2 - Listar por número");
            opcao = ler.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Informe o nome");
                    String nome = ler.next();
                    pokemon = pokedex.buscaPokemon(nome);
                    if(pokemon != null){
                        System.out.println(pokemon.toString());
                    }else{
                        System.out.println(nome + " não está cadastrado!");
                    }
                    break;
                case 2:
                    System.out.println("Informe o numero");
                    int numero = ler.nextInt();
                    pokemon = pokedex.buscaPokemon(numero);
                    if(pokemon != null){
                        System.out.println(pokemon.toString());
                    }else{
                        System.out.println(numero + " não está cadastrado!");
                    }
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
            break;
        }
        
        
    }
/**
 * Este método mostra os dados de todos os Pokemon cadastrados na Pokedex
 */
    private static void listarTodos() {
        System.out.println(pokedex.toString());
    }
    
}