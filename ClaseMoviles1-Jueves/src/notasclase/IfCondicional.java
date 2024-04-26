package notasclase;

import java.util.Scanner;

public class IfCondicional {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name = "pepito";
        String email = "pepito@mail.com";
        String phone = "3257101050";
        int password = 123456;

        System.out.println("Ingrese su usuario: ");
        String user = sc.nextLine();

        System.out.println("Ingrese su password: ");
        int userPassword = sc.nextInt();
        sc.nextLine();

        if ((user.equals(email) || user.equals(phone)) && userPassword == password){
            System.out.println("Bienvenido " + name);
        }else {
            System.out.println("Intente de nuevo");
        }

    }
}
