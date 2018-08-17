/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video62;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

/**
 *
 * @author gleez
 */
public class Video62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fuente = JOptionPane.showInputDialog("Introduce Funete"); 
        boolean estalafuente = false; 
        
        String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); 
        
        for(String nombredelafuente: nombresDeFuentes){
            if(nombredelafuente.equals(fuente)){
                estalafuente=true;
            }
            
        }
            if(estalafuente){
                System.out.println("Fuente Instalada"); 
            
            }else{
                System.out.println("No esta instalada la fuente");
            }
    }
    
    
}
