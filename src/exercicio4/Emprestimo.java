/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Date;

/**
 *
 * @author Vagabundo
 */
public class Emprestimo {
    private Date datadeentrega;
    private Date datadeemprestimo;
    private Pessoa pessoa;
    private Livro livro;

    public Emprestimo() {
    }

    public Emprestimo(Date datadeentrega, Date datadeemprestimo, Pessoa pessoa, Livro livro) {
        this.datadeentrega = datadeentrega;
        this.datadeemprestimo = datadeemprestimo;
        this.pessoa = pessoa;
        this.livro = livro;
    }

    public Date getDatadeentrega() {
        return datadeentrega;
    }

    public void setDatadeentrega(Date datadeentrega) {
        this.datadeentrega = datadeentrega;
    }

    public Date getDatadeemprestimo() {
        return datadeemprestimo;
    }

    public void setDatadeemprestimo(Date datadeemprestimo) {
        this.datadeemprestimo = datadeemprestimo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "datadeentrega=" + datadeentrega + ", datadeemprestimo=" + datadeemprestimo + ", pessoa=" + pessoa + ", livro=" + livro + '}';
    }

    
    

    

    
    
    
    
}
