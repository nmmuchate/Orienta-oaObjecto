
package exercicio8v2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author joseseie
 * @author Horcha Chambule
 * @author Fenias Manhenge
 * @author Jessica Mavie
 * @author Alfredo Francisco
 * @author Iben Enky
 * @author Nicolas Muchate
 * @author Micaela Freitas
 * @author Hassan Mutola
 * 
 */
public class Teste {
 
    public static void main(String[] args) {
        
        Pessoa jessica = new Pessoa("Jessica", 123456789, "jessica@gmail.com", new Date(), "Bairro Central");
        Pessoa alfredo = new Pessoa("alfredo", 123456789, "jessica@gmail.com", new Date(), "Bairro Central");
        Pessoa horcha = new Pessoa("horcha", 123456789, "jessica@gmail.com", new Date(), "Bairro Central");
        Pessoa seie = new Pessoa("seie", 123456789, "jessica@gmail.com", new Date(), "Bairro Central");
        Pessoa fenias = new Pessoa("fenias", 123456789, "jessica@gmail.com", new Date(), "Bairro Central");
        Pessoa iben = new Pessoa("iben", 123456789, "jessica@gmail.com", new Date(), "Bairro Central");
        Pessoa nicolas = new Pessoa("nicolas", 123456789, "jessica@gmail.com", new Date(), "Bairro Central");
        Pessoa micaela = new Pessoa("micaela", 123456789, "jessica@gmail.com", new Date(), "Bairro Central");
        Pessoa hassan = new Pessoa("hassan", 123456789, "jessica@gmail.com", new Date(), "Bairro Central");
        
        ArrayList<Pessoa> lista = new ArrayList<>();
        
        lista.add(jessica);
        lista.add(alfredo);
        lista.add(horcha);
        lista.add(seie);
        lista.add(fenias);
        lista.add(iben);
        lista.add(nicolas);
        lista.add(micaela);
        lista.add(hassan);
        
        CadernoDeEnderecos caderno = new CadernoDeEnderecos(lista);
        
        System.out.println("Total de contactos: " + caderno.getEnderecos().size());
        
        
        System.out.println("Totas os contactos: " + caderno.toString());
        
    }
    
}
