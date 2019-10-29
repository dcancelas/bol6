package bol6_05;
import java.util.Scanner;

public class Bol6_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce un número (1/3): ");
                int num1 = sc.nextInt();
            System.out.print("\nIntroduce un número (2/3): ");
                int num2 = sc.nextInt();
            System.out.print("\nIntroduce un número (3/3): ");
                int num3 = sc.nextInt();
            sc.close();
        
        if(num1 > num2) {
            if(num1 > num3) System.out.println("\n"+num1+" é o maior");
            else System.out.println("\n"+num3+" é o maior");
        }
        else {
            if(num2 > num3) System.out.println("\n"+num2+" é o maior");
            else System.out.println("\n"+num3+" é o maior");
        }
    }
}