/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import View.*;

/**
 *
 * @author romul
 */
public class Main {
    public static Treinador t1;
    public static Treinador t2;

    public static void main(String[] args){
        StartScreen start=new StartScreen();
        start.setVisible(true);
        Arena arena=new Arena();
        Pokedex pokelist=new Pokedex();
        pokelist.bootUpPokedex();
        arena.bootUpBanco(t1, pokelist);
        arena.bootUpBanco(t2, pokelist);
        InfoScreen info=new InfoScreen();
        info.setVisible(true);
        
        
        
        /*Arena arena=new Arena();
        Treinador t1=new Treinador();
        Treinador t2=new Treinador();
        Treinador win;
        arena.bootUpTreinadores(t1, t2);
        win=arena.partida(t1, t2);
        System.out.println(win.getNome() + " venceu!");
*/
    }
}
