/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.Scanner;
/**
 *
 * @author romul
 */
public class Arena {
    
    public Arena(){
        
    }
    public void bootUpTreinadores(Treinador t1, Treinador t2){
        Pokedex dataBase=new Pokedex();
        dataBase.bootUpPokedex();
        Scanner input=new Scanner(System.in);
        System.out.print("Nome do Treinador 1: ");
        t1.setNome(input.next());
        System.out.print("Nome do Treinador 2: ");
        t2.setNome(input.next());
        System.out.println("==============================");
        this.bootUpBanco(t1, dataBase);
        this.bootUpBanco(t2, dataBase);
        dataBase=null;
        System.out.println("Treinador " + t1.getNome());
        System.out.println("==============================");
        t1.printBanco();
        System.out.println("==============================");
        System.out.println("Treinador " + t2.getNome());
        System.out.println("==============================");
        t2.printBanco();
        System.out.println("==============================");
    }
    public void bootUpBanco(Treinador tr, Pokedex pk){
        tr.setPokemon(0, pk.getPokemon((int)(Math.random()*387)%pk.getSize()));
        tr.setPokemon(1, pk.getPokemon((int)(Math.random()*846)%pk.getSize()));
        tr.setPokemon(2, pk.getPokemon((int)(Math.random()*177)%pk.getSize()));
        tr.setPokemon(3, pk.getPokemon((int)(Math.random()*985)%pk.getSize()));
        tr.setPokemon(4, pk.getPokemon((int)(Math.random()*762)%pk.getSize()));
        tr.setPokemon(5, pk.getPokemon((int)(Math.random()*163)%pk.getSize()));
        for(int i=0; i<6; i++){
            tr.getPokemon(i).bootUpNormalMove();
            tr.getPokemon(i).chooseFirstMoves();
            tr.getPokemon(i).chooseLastMoves();
        }
    }
    public Pokemon luta(Pokemon pk1, Pokemon pk2){
        while((pk1.getHp()>0)&&(pk2.getHp()>0)){
            System.out.println(pk1.getNome() + " hp: " + pk1.getHp());
            System.out.println(pk2.getNome() + " hp: " + pk2.getHp());
            if(pk1.getVelocidade()>=pk2.getVelocidade()){
                pk1.atacar(pk2);
                if(pk1.getHp()<=0)
                    return pk2;
                else if(pk2.getHp()<=0)
                    return pk1;
                pk2.atacar(pk1);
                if(pk1.getHp()<=0)
                    return pk2;
                else if(pk2.getHp()<=0)
                    return pk1;
            }
            else{
                pk2.atacar(pk1);
                if(pk1.getHp()<=0)
                    return pk2;
                else if(pk2.getHp()<=0)
                    return pk1;
                pk1.atacar(pk2);
                if(pk1.getHp()<=0)
                    return pk2;
                else if(pk2.getHp()<=0)
                    return pk1;
            }
        }
        return null;
    }
    public Treinador partida(Treinador t1, Treinador t2){
        Pokemon pk1, pk2,winner;
        while(t1.pokemonsAptos()>0&&t2.pokemonsAptos()>0){
            pk1=t1.escolher();
            pk2=t2.escolher();
            winner=this.luta(pk1, pk2);
            System.out.println(winner.getNome() + " venceu!");
        }
        if(t1.pokemonsAptos()<=0)
            return t2;
        else
            return t1;
    }
}
