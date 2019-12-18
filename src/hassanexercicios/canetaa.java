
package hassanexercicios;

/**
 *
 * @author Hassan
 */
public class canetaa {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("uma caneta" + this.cor);
        System.out.println("carga: "+ this.carga);
        System.out.println("esta tampada?"+ this.tampada);
    }
    public void rabiscar () {
     if (this.tampada == true){
         System.out.println("ERRO! NAO POSSO RABISCAR");
     }  else{
         System.out.println("estou rabiscando");
     } 
    }
    public void tampar () {
     this.tampada=true;   
    }
    public void destampar (){
      this.tampada=false; 
    }
}
