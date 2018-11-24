/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonproto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Classe Base dos Pokemons, representando também os pokemons do tipo normal.
 * 
 * @author Rômulo Santos
 * 
 * @version 2.3
 * 
 * @since 1.0
 */
public class Pokemon {
    /**
     * Representa o nome do pokemon.
     */
    private String nome;
    /**
     * Representa o id do pokemon.
     */
    private int id;
    /**
     * Representa o tipo do pokemon.
     */
    private String tipo;
    /**
     * Representa o peso do pokemon.
     */
    private double peso;
    /**
     * Representa a altura do pokemon.
     */
    private double altura;
    /**
     * Representa o atributo de ataque do pokemon.
     */
    private int ataque;
    /**
     * Representa o atributo de defesa do pokemon.
     */
    private int defesa;
    /**
     * Representa o atributo de ataque especial do pokemon.
     */
    private int ataqueSp;
    /**
     * Representa o atributo de defesa especial do pokemon.
     */
    private int defesaSp;
    /**
     * Representa o atributo de velocidade do pokemon.
     */
    private int velocidade;
    /**
     * Representa o hp do pokemon.
     */
    private int hp;
    /**
     * Vetor de 4 posições contendo os ataques deste pokemon.
     */
    private Ataque[] moveset;
    /**
     * ArrayList contendo os ataques do tipo normal.
     */
    private ArrayList<Ataque> normalMove;
    /**
     * ArrayList contendo as fraquezas do tipo.
     */
    protected ArrayList<String> fraquezas;
    /**
     * Arraylist contendo as resistencias do tipo.
     */
    protected ArrayList<String> resistencias;
    /**
     * ArrayList contendo os tipos inefetivos contra este tipo.
     */
    protected ArrayList<String> inefetivo;
    /**
     * Construtor da classe
     */
    public Pokemon(){
        this.hp=100;
        this.moveset=new Ataque[4];
        this.normalMove=new ArrayList<>();
        this.fraquezas=new ArrayList<>();
        this.resistencias=new ArrayList<>();
        this.inefetivo=new ArrayList<>();
        this.tipo="Normal";
    }
    /**
     * Retorna o nome do pokemon.
     * @return String - Nome do pokemon.
     */
    public String getNome(){
        return this.nome;
    }
    /**
     * Altera o nome de um pokemon.
     * @param nome String - Novo nome.
     */
    public void setNome(String nome){
        this.nome=nome;
    }
    /**
     * Retorna o id de um pokemon.
     * @return String - Id do pokemon.
     */
    public int getId(){
        return this.id;
    }
    /**
     * Altera o id de um pokemon.
     * @param id int - Novo id.
     */
    public void setId(int id){
        this.id=id;
    }
    /**
     * Retorna o tipo do pokemon.
     * @return String - Tipo do pokemon.
     */
    public String getTipo(){
        return this.tipo;
    }
    /**
     * Altera o tipo de um pokemon.
     * @param tipo String - Novo tipo.
     */
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    /**
     * Retorna o peso de um pokemon.
     * @return double - Peso do pokemon.
     */
    public double getPeso(){
        return this.peso;
    }
    /**
     * Altera o peso do pokemon.
     * @param peso double - Novo peso.
     */
    public void setPeso(double peso){
        this.peso=peso;
    }
    /**
     * Retorna a altura de um pokemon.
     * @return double - Altura do pokemon.
     */
    public double getAltura(){
        return this.altura;
    }
    /**
     * Altera a altura de um pokemon. 
     * @param altura double - Nova altura.
     */
    public void setAltura(double altura){
        this.altura=altura;
    }
    /**
     * Retorna o atributo de ataque de um pokemon.
     * @return int - Atributo de ataque do pokemon.
     */
    public int getAtaque(){
        return this.ataque;
    }
    /**
     * Altera atributo de ataque do pokemon.
     * @param ataque int - Novo Ataque.
     */
    public void setAtaque(int ataque){
        this.ataque=ataque;
    }
    /**
     * Retorna atributo de defesa do pokemon.
     * @return int - Atributo de defesa do pokemon.
     */
    public int getDefesa(){
        return this.defesa;
    }
    /**
     * Altera atributo de defesa do pokemon.
     * @param defesa int - Nova defesa.
     */
    public void setDefesa(int defesa){
        this.defesa=defesa;
    }
    /**
     * Retorna atributo de ataque especial.
     * @return int - Atributo de ataque especial do pokemon.
     */
    public int getAtaqueSp(){
        return this.ataqueSp;
    }
    /**
     * Altera o atributo de ataque especial do pokemon.
     * @param ataqueSp int - Novo ataque especial.
     */
    public void setAtaqueSp(int ataqueSp){
        this.ataqueSp=ataqueSp;
    }
    /**
     * Retorna o atributo de defesa especial do pokemon.
     * @return int - Atributo de defesa especial do pokemon.
     */
    public int getDefesaSp(){
        return this.defesaSp;
    }
    /**
     * Altera o atributo de defesa especial do pokemon.
     * @param defesaSp int - Nova defesa especial.
     */
    public void setDefesaSp(int defesaSp){
        this.defesaSp=defesaSp;
    }
    /**
     * Retorna o atributo de velocidade do pokemon.
     * @return int - Atributo de velocidade do pokemon.
     */
    public int getVelocidade(){
        return this.velocidade;
    }
    /**
     * Altera o atributo de velocidade do pokemon.
     * @param velocidade int - Nova velocidade.
     */
    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }
    /**
     * Retorna o hp do pokemon.
     * @return int - Hp do pokemon.
     */
    public int getHp(){
        return this.hp;
    }
    /**
     * Altera o hp do pokemon.
     * @param v int - Novo hp.
     */
    public void setHp(int v){
        this.hp=v;
    }
    /**
     * Retorna um dos ataques do pokemon.
     * @param i int - Indice do vetor.
     * @return Ataque - Um dos ataques.
     */
    public Ataque getMove(int i){
        return this.moveset[i];
    }
    /**
     * Altera um dos ataques do pokemon.
     * @param move Ataque - Ataque a ser adicionado.
     * @param i int - Indice do vetor.
     */
    public void setMove(Ataque move, int i){
        this.moveset[i]=move;
    }
    /**
     * Retorna um dos ataques do tipo normal.
     * @param i int - Indice do ArrayList.
     * @return Ataque - Ataque do tipo normal.
     */
    public Ataque getNormalMove(int i){
        return this.normalMove.get(i);
    }
    /**
     * Imprime informações do pokemon.
     */
    public void print(){
        System.out.println("==============================");
        System.out.println("Nome:   " + this.getNome());
        System.out.println("No. ID: " + this.getId());
        System.out.println("Peso:   " + this.getPeso());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("ATK:    " + this.getAtaque());
        System.out.println("DEF:    " + this.getDefesa());
        System.out.println("ATK SP  " + this.getAtaqueSp());
        System.out.println("DEF SP  " + this.getDefesaSp());
        System.out.println("VEL     " + this.getVelocidade());
        System.out.println("");
    }
    /**
     * Verifica se um tipo é fraqueza do pokemon.
     * @param s String - Tipo a ser verificado.
     * @return boolean - Verdadeiro se for fraqueza.
     */
    public boolean ehFraqueza(String s){
        for(int i=0; i<this.fraquezas.size();i++){
            if(s.equals(this.fraquezas.get(i)))
                return true;
        }
        return false;
    }
    /**
     * Verifica se um tipo é resistência do pokemon.
     * @param s String - Tipo a ser verificado.
     * @return boolean - Verdadeiro se for resistência.
     */
    public boolean ehResistencia(String s){
        for(int i=0; i<this.resistencias.size();i++){
            if(s.equals(this.resistencias.get(i)))
                return true;
        }
        return false;
    }
    /**
     * Verifica se um tipo é inefetivo contra este pokemon.
     * @param s String - Tipo a ser verificado.
     * @return boolean - Verdadeiro se for inefetivo.
     */
    public boolean ehInefetivo(String s){
        for(int i=0; i<this.inefetivo.size();i++){
            if(s.equals(this.inefetivo.get(i)))
                return true;
        }
        return false;
    }
    /**
     * Preenche o vetor de ataques do pokemon.
     */
    public void chooseFirstMoves(){
        this.bootUpNormalMove();
        int i;
        i=(int)(Math.random()*973)%10;
        this.setMove(this.getNormalMove(i), 0);
        this.normalMove.remove(i);
        i=(int)(Math.random()*584)%9;
        this.setMove(this.getNormalMove(i), 1);
        this.normalMove.remove(i);
        i=(int)(Math.random()*362)%8;
        this.setMove(this.getNormalMove(i), 2);
        this.normalMove.remove(i);
        i=(int)(Math.random()*871)%7;
        this.setMove(this.getNormalMove(i), 3);
        this.normalMove.remove(i);
        this.normalMove.clear();
    }
    /**
     * Preenche os dois ultimos ataques do pokemon.
     * A ser implementada nas classes derivadas.
     */
    public void chooseLastMoves(){
        
    }
    /**
     * Imprime os ataques deste pokemon.
     */
    public void printMoveset(){
        for(int i=0; i<4; i++)
            System.out.println(this.getMove(i).getNome());
    }
    /**
     * Inicializa o ArrayList de ataques do tipo normal.
     */
    public void bootUpNormalMove(){
        Ataque aux;
        aux=new Ataque("Cut", 50, 0.9);
        this.normalMove.add(aux);
        aux=new Ataque("Headbutt", 70, 1.0);
        this.normalMove.add(aux);
        aux=new Ataque("Hyper Beam", 1, 150, 0.6);
        this.normalMove.add(aux);
        aux=new Ataque("Hyper Fang", 80, 0.8);
        this.normalMove.add(aux);
        aux=new Ataque("Pound", 40, 0.9);
        this.normalMove.add(aux);
        aux=new Ataque("Scratch", 40, 0.9);
        this.normalMove.add(aux);
        aux=new Ataque("Slam", 80, 0.7);
        this.normalMove.add(aux);
        aux=new Ataque("Slash", 70, 0.7);
        this.normalMove.add(aux);
        aux=new Ataque("Stomp", 65, 0.8);
        this.normalMove.add(aux);
        aux=new Ataque("Strength", 80, 0.8);
        this.normalMove.add(aux);
    }
    /**
     * Ataca um pokemon.
     * @param pk Pokemon - Pokemon a ser atacado.
     */
    public void atacar(Pokemon pk){
        int ans=-1, dmg, res, rnd;
        Ataque atk;
        
        for(int i=0; i<4; i++){
            System.out.println("==============================");
            System.out.println(i+1 + "-" +this.getMove(i).getNome());
            System.out.println("  - TIPO: " + this.getMove(i).getTipo());
            System.out.println("  - CAT : " + this.getMove(i).getCategoria());
            System.out.println("  - DMG : " + this.getMove(i).getDano());
            System.out.println("  - ACC : " + this.getMove(i).getAcuracia());
        }
        System.out.println("==============================");
        do{                                                                     //<<<=============TO SOLVE LATER
            Scanner input=new Scanner(System.in);
            System.out.println(this.getNome() + " - Selecione um ataque:");
            try{
                ans=input.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Entrada invalida");
                input.close();
                input=null;
                continue;
            }
            if((int)ans>4||(int)ans<0){
                System.out.println("Entrada invalida");
            }
        }while(ans>4||ans<0);
        
        System.out.println("Selecionou " + this.getMove(ans-1).getNome());
        atk=this.getMove(ans-1);
        rnd=((int)(Math.random()*5736))%100;
        if(rnd<atk.getAcuracia()*100){
            if(atk.getCategoria().equals("Fisico"))
                dmg=(10*this.getAtaque()+atk.dano);
            else
                dmg=(10*this.getAtaqueSp()+atk.dano);
            res=pk.defender(atk, dmg);
            System.out.println(this.getNome() + " causou " + res + " de dano em " + pk.getNome());
            pk.setHp(pk.getHp()-res);
            System.out.println("==============================");
        }
        else{
            System.out.println("Rnd - " + rnd + "/ACC - " + (atk.getAcuracia()*100)+1);
            System.out.println(this.getNome() + " errou!");
        }
    }
    /**
     * Defender um ataque.
     * @param atk Ataque - Ataque a ser defendido.
     * @param dmg int - Dano a ser defendido.
     * @return int - Dano total a ser recebido.
     */
    public int defender(Ataque atk, int dmg){
        
        if(atk.getCategoria().equals("Fisico"))
            dmg-=(this.getDefesa()*10);
        else
            dmg-=(this.getDefesaSp()*10);
        if(this.ehFraqueza(atk.getTipo())){
            System.out.println("Super Efetivo!");
            dmg=dmg*2;
        }
        else if(this.ehResistencia(atk.getTipo())){
            System.out.println("Nao Eh Muito Efetivo...");
            dmg=dmg/2;
        }
        else if(this.ehInefetivo(atk.getTipo())){
            System.out.println("Eh Inefetivo");
            return 0;
        }
        return dmg;
    }
}
