/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.ArrayList;
/**
 * Classe representando os Pokemons do tipo fantasma.
 * 
 * @author Rômulo Santos
 * 
 * @version 2.3
 * 
 * @since 1.0
 */
public class Fantasma extends Pokemon{
    /**
     * ArrayList contendo ataques do tipo fantasma, 
     * a partir dos quais os dois ultimos ataques serão selecionados.
     * 
     */
    private ArrayList<Ataque> ghostMove;
    /**
     * Construtor da classe.
     */
    public Fantasma(){
        this.ghostMove=new ArrayList<>();
        this.setTipo("Fantasma");
        this.fraquezas.add("Fantasma");
        this.resistencias.add("Venenoso");
        this.resistencias.add("Inseto");
        this.inefetivo.add("Normal");
        this.inefetivo.add("Lutador");
    }
    /**
     * Retorna um ataque do ArrayList de ataques do tipo fantasma.
     * 
     * @param i int - Indice do ArrayList de ataques do tipo fantasma.
     * @return Ataque - Ataque do ArrayList de ataques do tipo fantasma.
     */
    public Ataque getGhostMove(int i){
        return this.ghostMove.get(i);
    }
    /**
     * Seleciona os 2 últimos ataques do Pokemon.
     */
    @Override
    public void chooseLastMoves(){
        this.bootUpGhostMove();
        this.setMove(this.getGhostMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getGhostMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.ghostMove.clear();
    }
    /**
     * Inicializa o ArrayList de ataques do tipo fantasma.
     */
    public void bootUpGhostMove(){
        Ataque aux;
        aux=new Ataque("Hex", "Fantasma", 2, 65, 1.0);
        this.ghostMove.add(aux);
        aux=new Ataque("Moongeist Beam", "Fantasma", 2, 100, 1.0);
        this.ghostMove.add(aux);
        aux=new Ataque("Ominous Wind", "Fantasma", 2, 60, 1.0);
        this.ghostMove.add(aux);
        aux=new Ataque("Shadow Ball", "Fantasma", 2, 80, 1.0);
        this.ghostMove.add(aux);
        aux=new Ataque("Menacing Moonraze Maelsstrom", "Fantasma", 2, 200, 1.0);
        this.ghostMove.add(aux);
        aux=new Ataque("Astonish", "Fantasma", 1, 30, 1.0);
        this.ghostMove.add(aux);
        aux=new Ataque("Phantom Force", "Fantasma", 1, 90, 1.0);
        this.ghostMove.add(aux);
        aux=new Ataque("Shadow Punch", "Fantasma", 1, 60, 1.0);
        this.ghostMove.add(aux);
        aux=new Ataque("Soul Stealing 7 Star Strike", "Fantasma", 1, 195, 1.0);
        this.ghostMove.add(aux);
        aux=new Ataque("Shadow Claw", "Fantasma", 1, 70, 1.0);
        this.ghostMove.add(aux);
    }
}
