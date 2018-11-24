/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.ArrayList;
/**
 * Classe representando os Pokemons do tipo voador.
 * 
 * @author Rômulo Santos
 * 
 * @version 2.3
 * 
 * @since 1.0
 */
public class Voador extends Pokemon{
    /**
     * ArrayList contendo ataques do tipo voador, 
     * a partir dos quais os dois ultimos ataques serão selecionados.
     */
    private ArrayList<Ataque> flyingMove;
    /**
     * Construtor da classe.
     */
    public Voador(){
        this.flyingMove=new ArrayList<>();
        this.setTipo("Voador");
        this.fraquezas.add("Eletrico");
        this.fraquezas.add("Gelo");
        this.fraquezas.add("Pedra");
        this.resistencias.add("Planta");
        this.resistencias.add("Lutador");
        this.resistencias.add("Inseto");
        this.inefetivo.add("Rasteiro");
    }
    /**
     * Retorna um ataque do ArrayList de ataques do tipo voador.
     * 
     * @param i int - Indice do ArrayList de ataques do tipo voador.
     * @return Ataque - Ataque do ArrayList de ataques do tipo voador.
     */
    public Ataque getFlyingMove(int i){
        return this.flyingMove.get(i);
    }
    /**
     * Seleciona os 2 últimos ataques do Pokemon.
     */
    @Override
    public void chooseLastMoves(){
        this.bootUpFlyingMove();
        this.setMove(this.getFlyingMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getFlyingMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.flyingMove.clear();
    }
    /**
     * Inicializa o ArrayList de ataques do tipo voador.
     */
    public void bootUpFlyingMove(){
        Ataque aux;
        aux=new Ataque("Gust", "Voador", 2, 40, 1.0);
        this.flyingMove.add(aux);
        aux=new Ataque("Sky Attack", "Voador", 2, 140, 0.6);
        this.flyingMove.add(aux);
        aux=new Ataque("Oblivion Wing", "Voador", 2, 80, 0.8);
        this.flyingMove.add(aux);
        aux=new Ataque("Hurricane", "Voador", 2, 110, 0.7);
        this.flyingMove.add(aux);
        aux=new Ataque("Air slash", "Voador", 2, 75, 0.9);
        this.flyingMove.add(aux);
        aux=new Ataque("Aerial Ace", "Voador", 1, 60, 0.9);
        this.flyingMove.add(aux);
        aux=new Ataque("Air Cutter", "Voador", 1, 60, 0.9);
        this.flyingMove.add(aux);
        aux=new Ataque("Beak Blast", "Voador", 1, 100, 0.7);
        this.flyingMove.add(aux);
        aux=new Ataque("Drill Peck", "Voador", 1, 80, 0.8);
        this.flyingMove.add(aux);
        aux=new Ataque("Fly", "Voador", 1, 90, 0.8);
        this.flyingMove.add(aux);
    }
}
