package poo;

import java.util.Scanner;

public class producto {
    Scanner sc = new Scanner(System.in);
    // Atributos


    int id;
    String name;
    double price;
    String category;




    //Metodos

    public void createProduct (){
        String[] producto = new String[4];
        producto[0] = id + "";
        producto[1] = "name";
        producto[2] = price + "";
        producto[3] = "category";


        System.out.println ("Ingrese id :");
        id = sc.nextInt();
        System.out.println("Ingrese nombre");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Ingree precio");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese categoria");
        category = sc.nextLine();

    }

    public void selectProduct(){


    }

    public void updateProduct(){

    }

    public void deleteProduct(){

    }
}


public class TextProduct {

    public static void main(String[]args){

        producto producto = new producto();

      // producto.name = "computador";

      // System.out.println(producto.name);

        producto.createProduct();

    }
}


