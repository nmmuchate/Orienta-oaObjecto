/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.util.ArrayList;

/**
 *
 * @author Vagabundo
 */
abstract public class Contacto {
    protected String email;
    protected ArrayList<Telefone>telefone;
    public Contacto(){
        email = "";
        telefone = new ArrayList();
    }
    public Contacto(String email){
        this.email = email;
        telefone = new ArrayList();
       
    }
    public String getNome(){
        return email;
    }
    public void setNome(String nome){
        this.email = email;
    }
    public void setTelefone(Telefone tf){
        
        telefone.add(tf);
    }
    public String getDados(){
        String s = email + "\n";
        for(Telefone t:telefone){
            s+=t.getTelefone()+"\n";
            
        }
        return s;
    }
    
}
