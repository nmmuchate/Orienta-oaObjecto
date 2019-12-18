
package hassanexercicios;

/**
 *
 * @author Hassan
 */
public class canetaa {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    protected boolean tampada;
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
    protected void tampar () {
     this.tampada=true;   
    }
    protected void destampar (){
      this.tampada=false; 
    }
}
