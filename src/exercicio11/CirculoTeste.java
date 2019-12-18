
package exercicio11;

import java.util.Scanner;

/**
 *
 * @ author Vagabundo
 * 
 */
public class CirculoTeste {
    public static void main(String[] args) {
        
    
    
    Scanner ch = new Scanner(System.in);
    Circulo dados = new Circulo();
   
    
    dados.setX(ch.nextDouble());
    dados.setY(ch.nextDouble());
    dados.toString();
    
    }
    
}
