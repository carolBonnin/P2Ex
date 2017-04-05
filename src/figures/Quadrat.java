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
public class Quadrat extends Figura{
    private double costat;
    
    public void quadrat(String color, double x, double y, double costat){
        this.color=color;
        this.posicio[1]=x;
        this.posicio[2]=y;
        this.costat=costat;
    }
    
    public double getCostat(){
        return costat;
    }
    
    public double calculaArea(){
        return costat*costat;
    }
    
    public void dibuixa(){
        System.out.println("S'ha dibuixat un quadrat.\n");
    }
    
    public void mostraInfo(){
        System.out.println("Aquesta figura te:\n");
        System.out.println("  Color: ");
        System.out.println(color);
        System.out.println("\n  Posició: (");
        System.out.println(posicio[1]);
        System.out.println(",");
        System.out.println(posicio[2]);
        System.out.println(")\n  Costat: ");
        System.out.println(costat);
        System.out.println("\n  Àrea: ");
        System.out.println(area);
    }
}
