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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Telefone contactos = new Telefone();
        Vector dad = new Vector();
        System.out.println("Insira Os Contactos.");
        System.err.println("Mas tenha cuidado tem um limete de contactos");
        for (int i = 0; i < 10; i++) {
            contactos.setNome(sc.next());
            contactos.setNúmero(sc.nextInt());
            
            dad.add(contactos);
        }
        
        System.out.println(dad);
    }
     
}
