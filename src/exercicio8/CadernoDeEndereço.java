/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

/**
 *
 * @author Vagabundo
 */
public class CadernoDeEndereço {
    private String nome;
    private int numerodetelefone;
    private String email;
    private String endereco;
    public CadernoDeEndereço(){
        
    }
    
public CadernoDeEndereço(String nome,int numerodetelefone,String email,String endereço){
    this.nome=nome;
    this.endereco= endereço;
    this.email=email;
    this.numerodetelefone=numerodetelefone;
    
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
     * @return the numerodetelefone
     */
    public int getNumerodetelefone() {
        return numerodetelefone;
    }

    /**
     * @param numerodetelefone the numerodetelefone to set
     */
    public void setNumerodetelefone(int numerodetelefone) {
        this.numerodetelefone = numerodetelefone;
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
     * @return the endereço
     */
    public String getEndereço() {
        return endereco;
    }

    /**
     * @param endereço the endereço to set
     */
    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    @Override
    public String toString() {
        return "CadernoDeEndere\u00e7o{" + "nome=" + nome + ", numerodetelefone=" + numerodetelefone + ", email=" + email + ", endere\u00e7o=" + endereco + '}';
    }
    
    
}
