/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author smiramor9.alumnes
 */
public class Figura {
    protected String color;
    protected double posicio[];
    protected double area;
    
    public void Figura(String color, double x, double y){
        this.color=color;
        this.posicio[1]=x;
        this.posicio[2]=y;
        this.area=0;
    }
    
    public double getPosicioDibuixX(){
        return posicio[1];
    }
    
    public double getPosicioDibuixY(){
        return posicio[2];
    }
    
    public void setPosicioDibuix(double x, double y){
        this.posicio[1]=x;
        this.posicio[2]=y;
    }
    
    public String getColorDibuix(){
        return color;
    }
    
    public void setColorDibuix(String color){
        this.color=color;
    }
    
    public double calculaArea(){
        return area;
    }
    
    public void mostraInfo(){
        System.out.println("Aquesta figura te:\n");
        System.out.println("  Color: ");
        System.out.println(color);
        System.out.println("\n  Posició: (");
        System.out.println(posicio[1]);
        System.out.println(",");
        System.out.println(posicio[2]);
        System.out.println(")\n  Àrea: ");
        System.out.println(area);
    }
}



