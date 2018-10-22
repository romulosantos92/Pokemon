/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopokedex;

/**
 *
 * @author leoni
 */
public class Pokemon {
    protected String nome;
    protected int num;
    private String rotas;
    protected int evolAtual;
    protected boolean evolFinal;
    protected String tipos;
    protected float altura;
    protected float peso;
    protected String genero;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getRotas() {
        return rotas;
    }

    public void setRotas(String rotas) {
        this.rotas = rotas;
    }

   

  
   

    public int getEvolAtual() {
        return evolAtual;
    }

    public void setEvolAtual(int evolAtual) {
        this.evolAtual = evolAtual;
    }

    public boolean isEvolFinal() {
        return evolFinal;
    }

    public void setEvolFinal(boolean evolFinal) {
        this.evolFinal = evolFinal;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
