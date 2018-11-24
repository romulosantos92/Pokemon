/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
/**
 * Classe representando um treinador.
 * 
 * @author Rômulo Santos
 * 
 * @version 2.3
 * 
 * @since 1.0
 */
public class Treinador {
    /**
     * Representa o nome do treinador.
     */
    private String nome;
    /**
     * Vetor de 6 posições representando os pokemons do treinador.
     */
    private Pokemon[] banco;
    /**
     * Construtor da classe.
     */
    public Treinador(){
        this.banco=new Pokemon[6];
    }
    /**
     * Retorna o nome do treinador.
     * 
     * @return String - Nome do treinador.
     */
    public String getNome(){
        return this.nome;
    }
    /**Altera o nome do treinador.
     * 
     * @param s String - Novo nome.
     */
    public void setNome(String s){
        this.nome=s;
    }
    /**
     * Retorna um dos pokemons do banco.
     * 
     * @param i int - indice do banco.
     * @return Pokemon - Pokemon selecionado.
     */
    public Pokemon getPokemon(int i){
        return this.banco[i];
    }
    /**
     * Altera os pokemons no banco.
     * 
     * @param i int - Indice do banco.
     * @param pk Pokemon - Pokemon a ser inserido.
     */
    public void setPokemon(int i, Pokemon pk){
        this.banco[i]=pk;
    }
    /**
     * Imprime o banco de um treinador.
     */
    public void printBanco(){
        for(int i=0; i<6; i++){
            System.out.println(this.banco[i].getNome() + " - " + this.banco[i].getTipo());
            for(int j=0; j<4; j++){
                System.out.println(" - " + this.banco[i].getMove(j).getNome());
            }
            System.out.println("");
        }
    }
    /**
     * Verifica quantos pokemons deste treinador ainda estão aptos a lutar.
     * 
     * @return int - numero de pokemons aptos.
     */
    public int pokemonsAptos(){
        int count=0;
        for(int i=0; i<6; i++){
            if(this.getPokemon(i).getHp()>0)
                count++;
        }
        return count;
    }
    /**
     * Escolhe um pokemon para lutar.
     * 
     * @return Pokemon - Pokemon selecionado.
     */
    public Pokemon escolher(){
        int ans=0;
        Scanner input=new Scanner(System.in);
        for(int i=0; i<6; i++){
            if(this.getPokemon(i).getHp()<=0)
                System.out.println(i+1 + " - " + this.getPokemon(i).getNome() + " - Derrotado");
            else
                System.out.println(i+1 + " - " + this.getPokemon(i).getNome() + " - Hp: " + this.getPokemon(i).getHp());
        }
        boolean choice=false;
        do{
            System.out.println("==============================");
            System.out.println("Treinador " + this.getNome() + " : Escolha um pokemon:");
            try{
                ans=input.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Entrada invalida");
                System.out.println("===============================");
                ans=0;
                continue;
            }
            try{
                if(this.getPokemon(ans-1).getHp()<=0){
                    System.out.println("Impossivel escolher - Este pokemon ja foi derrotado");
                    System.out.println("==============================");
                }
                else{
                    System.out.println("Escolheu " + this.getPokemon(ans-1).getNome());
                    System.out.println("==============================");
                    choice=true;
                    return this.getPokemon(ans-1);
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Indice invalido");
                System.out.println("===============================");
                ans=0;
            }
        }while(choice==false);
        return null;
    }
}
