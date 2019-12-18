
package exercicio5;

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
 *  Faça um programa para representar a árvore genealógica de uma família. 
 *  Para tal, crie uma classe Pessoa que permita indicar, além de nome e 
 *  idade, o pai e a mãe. Tenha em mente que pai e mãe também 
 *  são do tipo Pessoa.
 * 
 */
public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
}
