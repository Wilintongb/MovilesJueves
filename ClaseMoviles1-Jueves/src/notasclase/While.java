package notasclase;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int servicio = 8;

       while (servicio > 0){
           System.out.println("Servicio : " + servicio);
           //servicio -= 1;
           servicio --;
       }
    }

}
