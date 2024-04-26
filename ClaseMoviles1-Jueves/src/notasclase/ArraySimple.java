package notasclase;

import java.util.Scanner;

public class ArraySimple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Este tipo de array es estatico, porque no podemos agregar nuevos elementos.
        //Lo que si puedo hacer es modificar los elementos existentes.

        int[] edades = {35, 45, 23, 38, 46};

        //System.out.println(edades.length);

        // index =      0    1   2   3   4


        System.out.println(edades[0]);
        System.out.println(edades[1]);
        System.out.println(edades[2]);
        System.out.println(edades[3]);
        System.out.println(edades[4]);

        //Podemos saber el tamaño de un array usando el atributo .lenght

        edades[2] = 29;


        System.out.println("Esta es la posicion dos " + edades[2]);

        //Para recorrer los arrays tenemos las estructuras for y foreach

        System.out.println("------------------------------------------------");

        for (int i = 0; i < edades.length; i++){
            System.out.println(edades[i]);
        }
        System.out.println("------------------------------------------------");

        //forEach
        for (int edad : edades){
            System.out.println(edad);
        }

        System.out.println("------------------------------------------------");

        //Podemos recorrer el array con el ciclo while

        int i = 0;

        while (i < edades.length){

            System.out.println(edades[i]);

            i++;
        }
    }
}
