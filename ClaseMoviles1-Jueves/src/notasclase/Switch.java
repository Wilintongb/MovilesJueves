package notasclase;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1. Recomendaciones imc = bajo peso
        //2. Recomendaciones imc = peso normal
        //3. Recomendaciones imc = sobrepeso
        //4. Recomendaciones imc = obesidad

        System.out.println("Seleccione: \n" +
                "1. Bajo peso\n" +
                "2. Peso normal\n" +
                "3. Sobrepeso\n" +
                "4. Obesidad");

        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("Recomendaciones medicas para aumentar el imc");
                break;
            case 2:
                System.out.println("Recomendaciones medicas para manatener el imc normal");
                break;
            case 3:
                System.out.println("Recomendaciones medicas para disminuir el imc");
                break;
            case 4:
                System.out.println("Recomendaciones medicas para tratar el imc con obesidad");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }
}
