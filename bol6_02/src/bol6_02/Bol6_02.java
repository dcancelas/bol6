package bol6_02;
import java.util.Scanner;

public class Bol6_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce un número: ");
                short num1 = sc.nextShort();
            System.out.print("\nIntroduce otro número: ");
                short num2 = sc.nextShort();
            sc.close();
        System.out.println("");
        if(num1 >= num2) System.out.println("O resultado da resta é: "+(num1-num2));
        System.out.println("O resultado da suma é: "+(num1+num2));
    }
}