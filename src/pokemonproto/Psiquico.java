/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.ArrayList;
/**
 * Classe representando os Pokemons do tipo psíquico.
 * 
 * @author Rômulo Santos
 * 
 * @version 2.3
 * 
 * @since 1.0
 */
public class Psiquico extends Pokemon{
    /**
     * ArrayList contendo ataques do tipo psíquico, 
     * a partir dos quais os dois ultimos ataques serão selecionados.
     */
    private ArrayList<Ataque> psychicMove;
    /**
     * Construtor da classe.
     */
    public Psiquico(){
        this.psychicMove=new ArrayList<>();
        this.setTipo("Psiquico");
        this.fraquezas.add("Fantasma");
        this.fraquezas.add("Inseto");
        this.resistencias.add("Psiquico");
        this.resistencias.add("Lutador");
    }
    /**
     * Retorna um ataque do ArrayList de ataques do tipo psíquico.
     * 
     * @param i int - Indice do ArrayList de ataques do tipo psíquico.
     * @return Ataque - Ataque do ArrayList de ataques do tipo psíquico.
     */
    public Ataque getPsychicMove(int i){
        return this.psychicMove.get(i);
    }
    /**
     * Seleciona os 2 últimos ataques do Pokemon.
     */
    @Override
    public void chooseLastMoves(){
        this.bootUpWaterMove();
        this.setMove(this.getPsychicMove((int)(Math.random()*100)%10), 2);
        do{
            this.setMove(this.getPsychicMove((int)(Math.random()*100)%10), 3);
        }while(this.getMove(2).getNome().equals(this.getMove(3).getNome()));
        this.psychicMove.clear();
    }
    /**
     * Inicializa o ArrayList de ataques do tipo psíquico.
     */
    public void bootUpWaterMove(){
        Ataque aux;
        aux=new Ataque("Light That Burns the Sky", "Psiquico", 2, 200, 0.5);
        this.psychicMove.add(aux);
        aux=new Ataque("Myst Ball", "Psiquico", 2, 70, 0.8);
        this.psychicMove.add(aux);
        aux=new Ataque("Prismatic Laser", "Psiquico", 2, 160, 0.55);
        this.psychicMove.add(aux);
        aux=new Ataque("Psychic", "Psiquico", 2, 90, 0.8);
        this.psychicMove.add(aux);
        aux=new Ataque("PsyStrike", "Psiquico", 2, 100, 0.8);
        this.psychicMove.add(aux);
        aux=new Ataque("Zen Headbutt", "Psiquico", 1, 80, 0.9);
        this.psychicMove.add(aux);
        aux=new Ataque("Psycho Cut", "Psiquico", 1, 70, 0.9);
        this.psychicMove.add(aux);
        aux=new Ataque("Psychic Fangs", "Psiquico", 1, 85, 0.9);
        this.psychicMove.add(aux);
        aux=new Ataque("Heart Stamp", "Psiquico", 1, 60, 0.9);
        this.psychicMove.add(aux);
        aux=new Ataque("Confusion", "Psiquico", 1, 50, 0.9);
        this.psychicMove.add(aux);
    }
}
