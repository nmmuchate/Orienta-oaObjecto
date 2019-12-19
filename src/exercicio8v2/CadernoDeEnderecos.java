
package exercicio8v2;

import java.util.ArrayList;

/**
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
 * 8.  Escreva uma classe chamada CadernoDeEnderecos que represente os dados de
 *   uma pessoa, como nome, telefone, email, data de aniversário e endereço.
 *      Que campos (variáveis de instância) e métodos essa classe deve ter? 
 *  Faça uma outra classe para
 *   usar/testar a
 *   classe CadernoDeEnderecos.
 */
public class CadernoDeEnderecos {
    
    private ArrayList<Pessoa> enderecos = new ArrayList<>();

    public CadernoDeEnderecos() {
    }
    
    public CadernoDeEnderecos (ArrayList<Pessoa> enderecos) {
        this.enderecos = enderecos;
    }

    public ArrayList<Pessoa> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Pessoa> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        for (Pessoa pessoa : enderecos) {
            
            sb.append(pessoa.toString());
            sb.append("\n\n");
            
        }
        
        return sb.toString();

    }
    
    
    
    
}
