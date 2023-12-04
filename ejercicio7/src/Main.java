import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     /*
     Ejercicio 7
     Pide un número por teclado usando Scanner y muestra si es
     positivo o negativo, si es par o impar y si es divisible
     por 5 o no.
      */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double number = sc.nextDouble();
        if(number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        if(number % 5 == 0) {
            System.out.println("The number is divisble by 5");
        } else {
            System.out.println("The number isn't divisible by 5");
        }
        if(number >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}