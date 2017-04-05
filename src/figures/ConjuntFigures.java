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
public class ConjuntFigures {
    private int id, n;
    private Figura it[];
    
    public void ConjuntFigures(int identificador, Figura fig[], int n){
        int i;
        this.id=identificador;
        for(i=1; i<n+1; i++){
            this.it[i]=fig[i];
        }
    }
    
    public void mostrarInfoFigures(){
        
    }
    
    public double areaMaximaFigures(){
        double max=0;
        int i;
        for(i=1; i<n+1; i++){
            if(it[i].calculaArea()>max){
                max=it[i].calculaArea();
            }
        }
        return max;
    }
    
    
}
