/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generace;

/**
 *
 * @author Venda
 */
public class Generace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cislo = 0 ;
        
        cislo = (int) (1000*Math.random()) ;
        
        if (cislo <= 500){
        
            System.out.println("Dosáhli jste číslo,které je menší nebo rovno 500.");
       
        }else{
        
            System.out.println("Dosáhli jste číslo,které je větší než 500.");
        
        }
        
        System.out.println("Dosáhli jste číslo " + cislo);
        
    }
    
}
