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
public class Livro {
    private String nomedoautor;
    private byte edicao;
    private String titulo;
    public Livro(){
        
    }

    public Livro(String nomedoautor, byte edicao, String titulo) {
        this.nomedoautor = nomedoautor;
        this.edicao = edicao;
        this.titulo = titulo;
    }
    

    /**
     * @return the nomedoautor
     */
    public String getNomedoautor() {
        return nomedoautor;
    }

    /**
     * @param nomedoautor the nomedoautor to set
     */
    public void setNomedoautor(String nomedoautor) {
        this.nomedoautor = nomedoautor;
    }

    /**
     * @return the edicao
     */
    public byte getEdicao() {
        return edicao;
    }

    /**
     * @param edicao the edicao to set
     */
    public void setEdicao(byte edicao) {
        this.edicao = edicao;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" + "nomedoautor=" + nomedoautor + ", edicao=" + edicao + ", titulo=" + titulo + '}';
    }
    
    
    
    
    
}
