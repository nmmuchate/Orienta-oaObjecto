/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

/**
 *
 * @author Vagabundo
 */
public class Circulo {
    private double x;
    private double y;
    private double PI;
    
    
    
    
    
    public Circulo(){
        
    }

    public Circulo(double x, double y, double PI) {
        this.x = x;
        this.y = y;
        this.PI = PI;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the PI
     */
    public double getPI() {
        return PI;
    }

    /**
     * @param PI the PI to set
     */
    public void setPI(double PI) {
        this.PI = PI;
    }
    
    
    public static double circulohorcha(double x,double y,double PI){
        
        return x*x*y*PI;
    }
    
}
