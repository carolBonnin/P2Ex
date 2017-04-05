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
public class Cercle extends Figura{
    private double radi;
    
    public void cercle(java.lang.String color, double x, double y, double radi){
        this.color=color;
        this.posicio[1]=x;
        this.posicio[2]=y;
        this.radi=radi;
    }
    
    public double getRadi(){
        return radi;
    }
    
    public double calculaArea(){
        return radi*radi*3.1416;
    }
    
    public void dibuixa(){
        System.out.println("S'ha dibuixat un cercle.\n");
    }
    
    public void mostraInfo(){
        System.out.println("Aquesta figura te:\n");
        System.out.println("  Color: ");
        System.out.println(color);
        System.out.println("\n  Posició: (");
        System.out.println(posicio[1]);
        System.out.println(",");
        System.out.println(posicio[2]);
        System.out.println(")\n  Radi: ");
        System.out.println(radi);
        System.out.println("\n  Àrea: ");
        System.out.println(area);
    }
}