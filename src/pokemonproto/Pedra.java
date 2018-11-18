/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.ArrayList;
/**
 *
 * @author romul
 */
public class Pedra extends Pokemon{
    private ArrayList<Ataque> rockMove;
    
    public Pedra(){
        this.rockMove=new ArrayList<>();
        this.setTipo("Pedra");
        this.fraquezas.add("Agua");
        this.fraquezas.add("Planta");
        this.fraquezas.add("Lutador");
        this.fraquezas.add("Rasteiro");
        this.resistencias.add("Venenoso");
        this.resistencias.add("Fogo");
        this.resistencias.add("Normal");
        this.resistencias.add("Voador");
        
    }
    public Ataque getRockMove(int i){
        return this.rockMove.get(i);
    }
    public void chooseLastMoves(){
        this.bootUpRockMove();
        this.setMove(this.getRockMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getRockMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.rockMove.clear();
    }
    public void bootUpRockMove(){
        Ataque aux;
        aux=new Ataque("Ancient Power", "Pedra", 2, 60, 1.0);
        this.rockMove.add(aux);
        aux=new Ataque("Power Gem", "Pedra", 2, 80, 1.0);
        this.rockMove.add(aux);
        aux=new Ataque("Rock Blast", "Pedra", 1, 25, 0.9);
        this.rockMove.add(aux);
        aux=new Ataque("Rock Throw", "Pedra", 1, 50, 0.9);
        this.rockMove.add(aux);
        aux=new Ataque("Rock Wrecker", "Pedra", 1, 150, 1.0);
        this.rockMove.add(aux);
        aux=new Ataque("Splintered Stormshards", "Pedra", 1, 190, 100);
        this.rockMove.add(aux);
        aux=new Ataque("Rock Tomb", "Pedra", 1, 60, 0.95);
        this.rockMove.add(aux);
        aux=new Ataque("Smack Down", "Pedra", 1, 50, 1.0);
        this.rockMove.add(aux);
        aux=new Ataque("Stone Edge", "Pedra", 1, 100, 0.8);
        this.rockMove.add(aux);
    }
}
