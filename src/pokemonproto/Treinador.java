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
 *
 * @author romul
 */
public class Treinador {
    private String nome;
    private Pokemon[] banco;
    
    public Treinador(){
        this.banco=new Pokemon[6];
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String s){
        this.nome=s;
    }
    public Pokemon getPokemon(int i){
        return this.banco[i];
    }
    public void setPokemon(int i, Pokemon pk){
        this.banco[i]=pk;
    }
    public void printBanco(){
        for(int i=0; i<6; i++){
            System.out.println(this.banco[i].getNome() + " - " + this.banco[i].getTipo());
            for(int j=0; j<4; j++){
                System.out.println(" - " + this.banco[i].getMove(j).getNome());
            }
            System.out.println("");
        }
    }
    public int pokemonsAptos(){
        int count=0;
        for(int i=0; i<6; i++){
            if(this.getPokemon(i).getHp()>0)
                count++;
        }
        return count;
    }
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
