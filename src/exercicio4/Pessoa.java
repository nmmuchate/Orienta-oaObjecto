/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author Vagabundo
 */
public class Pessoa {
    private String nome;
    private int bi;
    private String email;
    private String numerodecelular;

    public Pessoa(String nome, int bi, String email, String numerodecelular) {
        this.nome = nome;
        this.bi = bi;
        this.email = email;
        this.numerodecelular = numerodecelular;
    }

    public Pessoa() {
    }
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the bi
     */
    public int getBi() {
        return bi;
    }

    /**
     * @param bi the bi to set
     */
    public void setBi(int bi) {
        this.bi = bi;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the numerodecelular
     */
    public String getNumerodecelular() {
        return numerodecelular;
    }

    /**
     * @param numerodecelular the numerodecelular to set
     */
    public void setNumerodecelular(String numerodecelular) {
        this.numerodecelular = numerodecelular;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", bi=" + bi + ", email=" + email + ", numerodecelular=" + numerodecelular + '}';
    }
    
    
}
