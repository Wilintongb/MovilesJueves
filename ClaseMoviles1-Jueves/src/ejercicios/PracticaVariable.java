package ejercicios;

import java.nio.channels.UnresolvedAddressException;

public class PracticaVariable {
    public static void main(String []args){

        String Nombre = "Wilinton";
        String Apellido = "Giraldo";
        int Edad = 41;
        long Telefono = 3116298336l;
        String Direccion = "CALLE 12 SUR # 52 B 14 APTO 201";
        String Curso = "Moviles";
        boolean Activo = true;
        String pagoString = "600000";
        String pagoCarnetString = "750000";

        int pagoStringToInt = Integer.parseInt(pagoString);
        int pagoCarnetStringToInt = Integer.parseInt(pagoCarnetString);

        int pagoTotal = (pagoStringToInt + pagoCarnetStringToInt);



       // int TotalPagos = (pago + pagoCarnet);

        System.out.println(
                "El estudiante " + Nombre  + " " + Apellido + "\n"
                + "tiene " + Edad + " años" + "\n"
                + "su numero de telefono es " + Telefono + "\n"
                + "su direccion de residencia es " + Direccion + "\n"
                + "y se encuentra matriculado en el modulo " + Curso + "\n"
                + "y se encuentra activo " + Activo + "\n"
                + pagoTotal + "\n"

        );



    }
}
