package notasclase;

public class Variable {
    public static void main(String[]args){

        byte numByte;
        numByte = 127;

        short numShort;
        numShort = 32767;

        int numInt;
        numInt = 2147483647;

        //Casting de variable

        short numByteShort = (short) numByte;

        System.out.println(numByteShort);

        numByteShort = 155;

        System.out.println(numByteShort);

        int numShortInt = (int) numByteShort;

        numShortInt = 1160000;

        System.out.println(numShortInt);

        byte numIntByte = (byte) numShortInt;

        numIntByte = 32;

        //Parseo: Se puede parsear con StringtoInt  ó intToString


        String numString = "32";

        System.out.println(numString);

        //int mult = numString*100;

        int numStringToInt = Integer.parseInt(numString);

        int mult = numStringToInt*100;

        System.out.println(numStringToInt);

        int numInt2 = 25;

        //numInt2 + ""; La variable mas LAS COMILLAS convierten a texto automaticamente

        String numIntToString = numInt2 + "";

        System.out.println(numInt2);

        //Variables por tipo de datos

        String name = "Pepito";

        byte num1 = 127;

        float nota = 4.5f;

        double salary = 1300000;

        long numeroLargo = 322227208l;

        boolean trabaja = true;

        boolean casado = false;

        char arroba = 64;

        System.out.println(arroba);

        //Constantes: Se declara con la palabra final y agregando a lo ultimo la f → de float

        final float PI = 3.1416f;

        //Concatenacion: Yo puedo guardar un valor con una variable y se hace con el operador +

        String nombre = "Wilinton";
        int edad = 41;
        double pagoRecibido = 1000000;
        boolean esEmpleado = true;

        System.out.println("El empleado " + nombre + "\n"
                + "tiene " + edad + "años" + "\n"
                +"Gana $ " + pagoRecibido + "\n"
                +"se encuentra activo " + esEmpleado);







    }
}
