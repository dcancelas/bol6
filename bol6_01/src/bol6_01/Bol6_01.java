package bol6_01;

import java.util.Scanner;

/**
 *
 * @author dcancelas
 */
public class Bol6_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce un número: ");
            int numero = sc.nextInt();
            sc.close();
        if(numero >= 0) System.out.println("\n"+numero+" é positivo");
    }
    
}
