//Pedir 10 numeros y dar la suma de los mismos
package pkg10numeros;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
     int dato, suma=0, contador=0, entrada;
     
     dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de datos: "));
     
     while (dato>contador){
         entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
         suma += entrada;
         contador++;
     }
        JOptionPane.showMessageDialog(null, "La suma es "+suma);
    }
    
}
