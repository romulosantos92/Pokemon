/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

/**
 * Classe representando os ataques dos pokemons.
 * 
 * @author Rômulo Santos
 * 
 * @version 2.3
 * 
 * @since 1.0
 */
public class Ataque {
    /**
     * Representa o nome do ataque.
     */
    protected String nome;
    /**
     * Representa o tipo do ataque.
     */
    protected String tipo;
    /**
     * Representa o dano do ataque.
     */
    protected int dano;
    /**
     * Representa a acurácia do ataque.
     */
    protected double acuracia;
    /**
     * Representa a categoria do ataque.
     */
    protected String categoria;
    /**
     * Construtor da classe
     * 
     * @param nome String - nome do ataque.
     * @param tipo String - tipo do ataque.
     * @param categoria int - categoria do ataque(1 = Fisico; else = Especial).
     * @param dano int - dano do ataque.
     * @param acuracia double - acuracia do ataque.
     */
    public Ataque(String nome, String tipo, int categoria, int dano, double acuracia){
        this.nome=nome;
        this.tipo=tipo;
        this.dano=dano;
        if(categoria==1)
            this.categoria="Fisico";
        else
            this.categoria="Especial";
        this.acuracia=acuracia;
        
    }
    /**
     * Construtor da classe
     * 
     * @param nome String - nome do ataque.
     * @param categoria int - categoria do ataque(1 = Fisico; else = Especial).
     * @param dano int - dano do ataque.
     * @param acuracia double - acuracia do ataque.
     */
    public Ataque(String nome, int categoria, int dano, double acuracia){
        this.nome=nome;
        this.tipo="Normal";
        this.dano=dano;
        this.categoria="Especial";
        this.acuracia=acuracia;
    }
    /**
     * Construtor da classe.
     * 
     * @param nome String - nome do ataque.
     * @param dano int - dano do ataque.
     * @param acuracia double - acuracia do ataque
     */
    public Ataque(String nome, int dano, double acuracia){
        this.nome=nome;
        this.tipo="Normal";
        this.dano=dano;
        this.categoria="Fisico";
        this.acuracia=acuracia;
    }
    /**
     * Retorna o nome do ataque.
     * 
     * @return String - Nome do ataque.
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Retorna o tipo do ataque.
     * 
     * @return String - Tipo do ataque.
     */
    public String getTipo(){
        return this.tipo;
    }
    /**
     * Retorna o dano do ataque.
     * 
     * @return int - Dano do ataque.
     */
    public int getDano(){
        return this.dano;
    }
    /**
     * Retorna a categoria do ataque.
     * 
     * @return String - categoria.
     */
    public String getCategoria(){
        return this.categoria;
    }
    /**
     * Retorna a acurácia do ataque.
     * 
     * @return double - Acurácia do ataque.
     */
    public double getAcuracia(){
        return this.acuracia;
    }
    /**
     * Imprimire informações do ataque.
     */
    public void print(){
        System.out.println("==============================");
        System.out.println("Nome:     " + this.getNome());
        System.out.println("Tipo:     " + this.getTipo());
        System.out.println("Categoria:" + this.getCategoria());
        System.out.println("Dano:     " + this.getDano());
        System.out.println("Acuracia: " + this.getAcuracia()*100 + "%");
        System.out.println("");
    }
}
