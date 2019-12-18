/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.util.*;

/**
 *
 * @author Vagabundo
 */
public class Agenda {
    
       Vector <Telefone> dad = new Vector<>();
       
        Scanner sc = new Scanner(System.in);
    
    public void registar(){
        
        Telefone contactos = new Telefone();
        
        System.out.println("Insira o Contacto!");
            int num = sc.nextInt();
        
        do{
                if(num > 0 && repeticao(num) ==  false){
                    
                    contactos = new Telefone();
                    contactos.setNúmero(num);
                    System.out.println("");
                    System.out.println("insira o nome: ");
                    contactos.setNome(sc.next());
                    System.out.println("");
                    
                    dad.addElement(contactos);
                    
                    System.out.println("Registo completo!");
                }
        }while(num > 0);
    }
    
    public boolean repeticao(int numero){
        
        Telefone t;
        
        boolean hasNumber = false;
        
        for (int i = 0; i < dad.size(); i++) {
            t = dad.get(i);
            if(dad.get(i).getNúmero() == numero)
                hasNumber = true;
        }
        return hasNumber;
    }
    
    /*public void procurar(){
        Telefone l;
        
        sout
        
        for (int i = 0; i < dad.size(); i++) {
            l = dad.get(i);
            if(dad.get(i).getNome().equalsIgnoreCase()) 
        }
    }*/
    
    public static void main(String[] args) {
        
        Agenda a = new Agenda();
        a.registar();
        /*System.out.println("Insira o numero de contactos que deseja gravar");
        int a=sc.nextInt();
        
        for (int i = 0; i < a; i++) {
            contactos.setNome(sc.next());
            contactos.setNúmero(sc.nextInt());
            
            dad.add(contactos);
        }
        
        System.out.println(dad);*/
    }
     
}
