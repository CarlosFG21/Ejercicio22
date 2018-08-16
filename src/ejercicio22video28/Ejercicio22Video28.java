/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22video28;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Ejercicio22Video28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        coche g = new coche();
        
        JOptionPane.showMessageDialog(null,"PROGRAMA CARACTERISTICAS AUTOMOVIL");
        
        System.out.println("CARACTERISTICAS AUTOMOVIL");
        
        System.out.println();
        
        System.out.println("EL AUTOMIL TIENE " + g.ancho + "CM DE ANCHO" );
        
        System.out.println("EL AUTOMIL TIENE  " + g.largo + "CM DE LARGO" );
        
        System.out.println("EL AUTOMIL TIENE " + g.motor + " CABALLOS DE FUERZA" );
        
        System.out.println("EL AUTOMIL TIENE " + g.peso + "KG DE PESO" );
        
        System.out.println("EL AUTOMIL TIENE " + g.ruedas + " RUEDAS" );
        
        
    }
    
}
