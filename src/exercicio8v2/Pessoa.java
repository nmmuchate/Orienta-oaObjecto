
package exercicio8v2;

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
public class Pessoa {
    
    private String nome;
    private int telefone;
    private String email;
    private Date dataDeNascimento;
    private String endereco;

    public Pessoa(String nome, int telefone, String email, Date dataDeNascimento, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", dataDeNascimento=" + dataDeNascimento + ", endereco=" + endereco + '}';
    }

    
    
    
    
    
}
