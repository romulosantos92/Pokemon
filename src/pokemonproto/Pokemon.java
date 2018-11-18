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
 *
 * @author romul
 */
public class Pokemon {
    private String nome;
    private int id;
    private String tipo;
    private double peso;
    private double altura;
    private int ataque;
    private int defesa;
    private int ataqueSp;
    private int defesaSp;
    private int velocidade;
    private int hp;
    private Ataque[] moveset;
    private ArrayList<Ataque> normalMove;
    protected ArrayList<String> fraquezas;
    protected ArrayList<String> resistencias;
    protected ArrayList<String> inefetivo;
    
    ///CTOR===============================================
    public Pokemon(){
        this.hp=100;
        this.moveset=new Ataque[4];
        this.normalMove=new ArrayList<>();
        this.fraquezas=new ArrayList<>();
        this.resistencias=new ArrayList<>();
        this.inefetivo=new ArrayList<>();
        this.tipo="Normal";
    }
    //GETS/SETS===========================================
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public int getAtaque(){
        return this.ataque;
    }
    public void setAtaque(int ataque){
        this.ataque=ataque;
    }
    public int getDefesa(){
        return this.defesa;
    }
    public void setDefesa(int defesa){
        this.defesa=defesa;
    }
    public int getAtaqueSp(){
        return this.ataqueSp;
    }
    public void setAtaqueSp(int ataqueSp){
        this.ataqueSp=ataqueSp;
    }
    public int getDefesaSp(){
        return this.defesaSp;
    }
    public void setDefesaSp(int defesaSp){
        this.defesaSp=defesaSp;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int v){
        this.hp=v;
    }
    public Ataque getMove(int i){
        return this.moveset[i];
    }
    public void setMove(Ataque move, int i){
        this.moveset[i]=move;
    }
    public Ataque getNormalMove(int i){
        return this.normalMove.get(i);
    }
    //OTHER===================================================
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
    public boolean ehFraqueza(String s){
        for(int i=0; i<this.fraquezas.size();i++){
            if(s.equals(this.fraquezas.get(i)))
                return true;
        }
        return false;
    }
    public boolean ehResistencia(String s){
        for(int i=0; i<this.resistencias.size();i++){
            if(s.equals(this.resistencias.get(i)))
                return true;
        }
        return false;
    }
    public boolean ehInefetivo(String s){
        for(int i=0; i<this.inefetivo.size();i++){
            if(s.equals(this.inefetivo.get(i)))
                return true;
        }
        return false;
    }
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
    public void chooseLastMoves(){
        
    }
    public void printMoveset(){
        for(int i=0; i<4; i++)
            System.out.println(this.getMove(i).getNome());
    }
    public void bootUpNormalMove(){
        Ataque aux;
        aux=new Ataque("Cut", 50, 0.95);
        this.normalMove.add(aux);
        aux=new Ataque("Headbutt", 70, 1.0);
        this.normalMove.add(aux);
        aux=new Ataque("Hyper Beam", 1, 150, 0.9);
        this.normalMove.add(aux);
        aux=new Ataque("Hyper Fang", 80, 0.9);
        this.normalMove.add(aux);
        aux=new Ataque("Pound", 40, 1.0);
        this.normalMove.add(aux);
        aux=new Ataque("Scratch", 40, 1.0);
        this.normalMove.add(aux);
        aux=new Ataque("Slam", 80, 0.75);
        this.normalMove.add(aux);
        aux=new Ataque("Slash", 70, 1.0);
        this.normalMove.add(aux);
        aux=new Ataque("Stomp", 65, 1.0);
        this.normalMove.add(aux);
        aux=new Ataque("Strength", 80, 100);
        this.normalMove.add(aux);
    }
    public void atacar(Pokemon pk){
        int ans=-1, dmg, res;
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
        if(atk.getCategoria().equals("Fisico"))
            dmg=(10*this.getAtaque()+atk.dano);
        else
            dmg=(10*this.getAtaqueSp()+atk.dano);
        res=pk.defender(atk, dmg);
        System.out.println(this.getNome() + " causou " + res + " de dano em " + pk.getNome());
        pk.setHp(pk.getHp()-res);
        System.out.println("==============================");
    }
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
