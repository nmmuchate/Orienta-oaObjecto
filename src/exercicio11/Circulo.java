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
    private final double PI = 3.1415 ;
    
    
    
    
    
    public Circulo(){
        
    }

    public Circulo(double x, double y) {
        this.x = x;
        this.y = y;
        
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
    
    
   

    public static double circulo(double x, double y, double PI) {
        return x*x*y*PI;
    }
     @Override
    public String toString(){
        
        return "Circulo{" + "x=" + x + ", y=" + y+", PI="+PI+'}';
    }
}
