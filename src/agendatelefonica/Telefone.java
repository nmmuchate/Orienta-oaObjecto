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
    private String número;
    private String nome;
    public Telefone(String número,String nome){
        this.número = número;
        this.nome = nome;
    }
    public String getTelefone(){
        return número + " " + nome;
        
    }
    
    
    
    
}
