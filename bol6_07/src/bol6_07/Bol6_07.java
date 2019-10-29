package bol6_07;
import java.util.Scanner;

public class Bol6_07 {

    public static void main(String[] args) {
        System.out.println(
        "\n╔═══════════════════════╗"+
        "\n║  CALCULAR SUPERFICIE  ║"+
        "\n║  1. Cuadrado          ║"+
        "\n║  2. Triángulo         ║"+
        "\n║  3. Círculo           ║"+
        "\n╚═══════════════════════╝");
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Selecciona una opción: ");
                int figura = sc.nextInt();
        
        switch(figura) {
            case 1:
                System.out.print("\nIntroduce el lado: ");
                    float lado = sc.nextFloat();
                System.out.println("\nLa superficie es de: "+(lado*lado)+" m"); 
                break;
            case 2:
                System.out.print("\nIntroduce la base: ");
                    float base = sc.nextFloat();
                System.out.print("Introduce la altura: ");
                    float altura = sc.nextFloat();
                System.out.println("\nLa superficie es de: "+(base*altura)+" m"); 
                break;
            case 3:
                System.out.print("\nIntroduce el radio: ");
                    float radio = sc.nextFloat();
                System.out.println("\nLa superficie es de: "+((float)Math.PI*(radio*radio))+" m");
                break;
            default:
                System.out.println("\nEl numero introducido no se corresponde con ninguna opción.");
        }
        sc.close();
        
    }
}