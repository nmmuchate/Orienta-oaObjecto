/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.time.LocalDate;

/**
 *
 * @author Vagabundo
 */
public class ClasseExplicadorteste {
    public static void main(String[] args) {
        ClasseExplicador dados = new ClasseExplicador("nicolas", LocalDate.MIN, "nicolas.muchate@gmail.com", 15);
//        dados.toString();
        System.out.println(dados.toString());
        
    
}
}
