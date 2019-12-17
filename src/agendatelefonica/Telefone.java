/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

/**
 *
 * @author Vagabundo
 */
public class Telefone {
    private int número;
    private String nome;
    public Telefone(int número,String nome){
        this.número = número;
        this.nome = nome;
    }
    public Telefone(){
        
    }

    /**
     * @return the número
     */
    public int getNúmero() {
        return número;
    }

    /**
     * @param número the número to set
     */
    public void setNúmero(int número) {
        this.número = número;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Telefone{" + "nummero=" + número + ", nome=" + nome + '}';
    }
    
   
        
    }
    
    
    
    

