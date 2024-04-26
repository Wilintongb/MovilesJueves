package calculadora;

import javax.swing.*;

public class OperacinesBasicas {
    //Creamos la variables que vamos a necesitar
    int numero1;
    int numero2;
    double resultado;

    //Luego se realiza el constructor de la clase operaciones basicas

    public OperacinesBasicas(){
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
    }
    //Creamos los metodos que seran utilizados(suma, resta, multiplicacion, division)
    public void suma(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    public void resta(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        resultado = numero1 - numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    public void multiplicacion(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        resultado = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    public void division(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        resultado = numero1 / numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}
