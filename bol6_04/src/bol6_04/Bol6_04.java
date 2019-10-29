package bol6_04;
import java.util.Scanner;

public class Bol6_04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce un nombre: ");
                String nom1 = sc.next();
            System.out.print("Introduce su peso: ");
                int peso1 = sc.nextInt();
            System.out.print("\nIntroduce otro nombre: ");
                String nom2 = sc.next();
            System.out.print("Introduce su peso: ");
                int peso2 = sc.nextInt();
            sc.close();
        
        if(peso1 > peso2) {
            System.out.println("\nA persoa que pesa máis é: "+nom1+"\nO seu peso é de: "+peso1+" kg");
            System.out.println("\nA diferenza de peso entre as dúas persoas é de: "+(peso1-peso2)+" kg");
        }
        if(peso1 < peso2) {
            System.out.println("\nA persoa que pesa máis é: "+nom2+"\nO seu peso é de: "+peso1+" kg");
            System.out.println("\nA diferenza de peso entre as dúas persoas é de: "+(peso2-peso1)+" kg");
        }
    }
}