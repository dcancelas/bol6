package bol6_03;
import java.util.Scanner;

public class Bol6_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce un número: ");
                int num = sc.nextInt();
            sc.close();
        if(num == 0) System.out.println("0");
        if(num > 0) System.out.println("+");
        if(num < 0) System.out.println("-");
    }
}