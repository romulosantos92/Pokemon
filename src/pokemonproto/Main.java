/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

/**
 *
 * @author romul
 */
public class Main {
    public static void main(String[] args){
        Arena arena=new Arena();
        Treinador t1=new Treinador();
        Treinador t2=new Treinador();
        Treinador win;
        arena.bootUpTreinadores(t1, t2);
        win=arena.partida(t1, t2);
        System.out.println(win.getNome() + " venceu!");
    }
}
