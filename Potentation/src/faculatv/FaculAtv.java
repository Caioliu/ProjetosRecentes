/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculatv;

import javax.swing.JOptionPane;

/**
 *
 * @author caioa
 */
public class FaculAtv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"------------------\n  Potentation  \n------------------");  
    int base = Integer.parseInt(JOptionPane.showInputDialog("Base:  X²"));
    int expoente = Integer.parseInt(JOptionPane.showInputDialog("Expoente:  2ˣ"));
    int resultado = 0;
    int aux = base;
    for (int cont = 1; cont < expoente; ++cont) {
      resultado = aux * base;
      aux = resultado;
    }
    JOptionPane.showMessageDialog(null,resultado);
    
  }

}
    


