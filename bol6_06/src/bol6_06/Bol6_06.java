package bol6_06;

import java.util.Scanner;

public class Bol6_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce el nombre del producto: ");
                String nom = sc.next();
            System.out.print("Introduce el número de ventas anuales: ");
                int numVentas = sc.nextInt();
            sc.close();
        
        if(numVentas <= 100)
            System.out.println("\n"+nom+" es un producto de consumo bajo.");
        if((numVentas > 100) && (numVentas <= 500))
            System.out.println("\n"+nom+" es un producto de consumo medio.");
        if((numVentas > 500) && (numVentas <= 1000))
            System.out.println("\n"+nom+" es un producto de consumo alto.");
        if(numVentas > 1000)
            System.out.println("\n"+nom+" es un producto de primera necesidad.");
    }
}