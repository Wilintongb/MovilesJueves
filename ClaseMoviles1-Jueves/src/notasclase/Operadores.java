import java.util.Scanner;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int resultado = 3 + 2 / 7 * 3;

        System.out.println(resultado);

        System.out.println("Ingrese el numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el numero");
        int num2 = sc.nextInt();

        int operacionSuma = num1 + num2;
        System.out.println("Resultado = " + operacionSuma);

        int operacionResta = num1 - num2;
        System.out.println("Resultado = " + operacionResta);

        int operacionMultiplicacion = num1 * num2;
        System.out.println("Resultado = " + operacionMultiplicacion);

        int operacionDivision = num1 /num2;
        System.out.println("Resultado = " + operacionDivision);

        int operacionMod = num1 % num2;
        System.out.println("Resultado = " + operacionMod);

        System.out.println("Num1 es mayor que Num2");
        boolean esMayor = num1 > num2;
        System.out.println("Es mayor?:" + esMayor);

        System.out.println("Num1 es menor que Num2");
        boolean esMenor = num1 < num2;
        System.out.println("Es menor?:" + esMenor);

        System.out.println("Num1 es mayor o igual que Num2");
        boolean esMayorigual = num1 >= num2;
        System.out.println("Es mayor o igual?:" + esMayorigual);

        System.out.println("Num1 es menor o igual que Num2");
        boolean esMenorigual = num1 <= num2;
        System.out.println("Es menor o igual?:" + esMenorigual);

        System.out.println("Num1 es igual que Num2");
        boolean esigual = num1 == num2;
        System.out.println("Es igual?:" + esigual);

        System.out.println("Num1 es diferente que Num2");
        boolean esdiferente = num1 != num2;
        System.out.println("Es diferente?:" + esdiferente);

        boolean telefono = true;
        boolean correo = false;
        boolean contraseña = true;
        boolean ingreso = (telefono || correo) && contraseña;
        System.out.println("Su ingreso es : " + ingreso);


        //Ejemplo de uso de operadores de asignacion
        int num3 = 0;
        //num3 = num3 + num2;
        num3 += num1;
        System.out.println("El valor de Num3 es de : " + num3);

    }
}
