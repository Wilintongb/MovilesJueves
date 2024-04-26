package notasclase;

import java.util.Scanner;

public class PrcticaArray2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String paises = new String[5];
        //String primerPais = sc.nextLine();
        //String segundoPais = sc.nextLine();
        //String paises[] = {primerPais, segundoPais}

        String paises[] = new String[5];

        paises[0] = "Colombia";
        paises[1] = "Brasil";
        paises[2] = "Polonia";
        paises[3] = "Belgica";
        paises[4] = "Jamaica";

        System.out.println("El pais seleccionado es " + "\n" + paises[4] + "\n" + paises[3]);


        for (int i = 0; i < paises.length; i++){
            System.out.println(paises[i]);

            System.out.println("-----------------------------");

            for (String pais : paises){
                System.out.println(pais);
            }
        }
    }
}
