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
public class ClasseExplicador {
    private String nome;
    private LocalDate datadenascimento;
    private String email;
    private int codigodevisita;

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
     * @return the datadenascimento
     */
    public LocalDate getDatadenascimento() {
        return datadenascimento;
    }

    /**
     * @param datadenascimento the datadenascimento to set
     */
    public void setDatadenascimento(LocalDate datadenascimento) {
        this.datadenascimento = datadenascimento;
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
     * @return the codigodevisita
     */
    public int getCodigodevisita() {
        return codigodevisita;
    }

    /**
     * @param codigodevisita the codigodevisita to set
     */
    public void setCodigodevisita(int codigodevisita) {
        this.codigodevisita = codigodevisita;
    }
    
}
