
package hassanexercicios;

/**
 *
 * @author Hassan
 */
public class poo2 {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        
        c1.status(); 
        c1.rabiscar();
        
        caneta c2 = new caneta ();
        c2.modelo="hostnet";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
 
}
