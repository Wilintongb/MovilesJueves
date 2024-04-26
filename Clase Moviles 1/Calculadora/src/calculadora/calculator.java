package calculadora;

import javax.swing.*;
public class calculator {

    static int option;
    static String menu ;
    public static void main(String[]args){



        OperacinesBasicas object = new OperacinesBasicas();

        do {
            menu = JOptionPane.showInputDialog("MENU PRINCIPAL\n" + "1. SUMA\n" + "2. RESTA\n" + "3. MULTIPLICACION\n" + "4. DIVISION\n" + "5. SALIR");
            option = Integer.parseInt(menu);

            switch (option){

                case 1:
                    object.suma();
                    break;

                case 2:
                    object.resta();
                    break;
                case 3:
                    object.multiplicacion();
                    break;
                case 4:
                    object.division();
                    break;
                case 5:
                    break;
            }


        }while (option != 5);


    }
}
