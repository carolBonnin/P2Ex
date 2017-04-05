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
public class GestorFigures1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cercle c1, c2;
        Quadrat q1;
        ConjuntFigures cf1;
        Figura fig[] = null;
        c1 = new Cercle();
        c2 = new Cercle();
        q1 = new Quadrat();
        cf1 = new ConjuntFigures();
        fig[1] = new Figura();
        fig[2] = new Figura();
        fig[3] = new Figura();
        
        
        c1.cercle("vermell", 0.0, 1.0, 10.0);
        c2.cercle("verd", 1.0, 1.0, 7.5);
        q1.quadrat("blau", 0.0, 0.0, 5.5);
        
        fig[1] = q1;
        fig[2] = c1;
        fig[3] = c2;
        
        cf1.ConjuntFigures(1, fig, 3);
        
        cf1.mostrarInfoFigures();
        
        System.out.println(cf1.areaMaximaFigures());
        
    }
    
}
