/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon2;

/**
 *
 * @author romul
 */
public class Pokemon {
    private String nome;
    private int id;
    private double altura;
    private double peso;
    private int ataque;
    private int defesa;
    private int ataqueSp;
    private int defesaSp;
    private int velocidade;
    
    public Pokemon(String nome, int id, double altura, double peso, int atk, int def, int atkSp, int defSp, int vel){
        this.setNome(nome);
        this.setId(id);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setAtaque(atk);
        this.setAtaqueSp(atkSp);
        this.setDefesa(def);
        this.setDefesaSp(defSp);
        this.setVelocidade(vel);
        this.setAtaqueSp(ataqueSp);
    }
    public Pokemon(){
        
    }
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
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
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
}
