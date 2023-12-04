import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 8
        Crea el juego de piedra, papel o tijeras usando Scanner
        para leer un valor por teclado y Random para generar la
        opción aleatoria elegida por el rival (la máquina).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("Let's play together :D");
        System.out.println("choose, Papel, Piedra, Tijeras");
        String choice = sc.nextLine().toUpperCase();
        Random rnd = new Random();
        int x = rnd.nextInt(3);
        String[] options = {"PAPEL", "PIEDRA", "TIJERAS"};
        if(choice.equals(options[x])) {
            System.out.println("You chose " + choice + "and computer chose " + options[x] );
        } else {
            if(options[x].equalsIgnoreCase("TIJERAS")) {
                if(choice.equalsIgnoreCase("PIEDRA")) {
                    System.out.println("You chose " + choice + "and computer chose " + options[x] + " and you won");
                } else if(choice.equalsIgnoreCase("PAPEL")) {
                    System.out.println("You chose " + choice + "and computer chose " + options[x] + " and computer won");
                } else {
                    System.out.println("INVALID CHOICE, VERIFY YOUR SPELLING");
                }
            } else if(options[x].equalsIgnoreCase("PIEDRA")) {
                if(choice.equalsIgnoreCase("TIJERAS")) {
                    System.out.println("You chose " + choice + "and computer chose " + options[x] + " and computer won");
                } else if(choice.equalsIgnoreCase("PAPEL")) {
                    System.out.println("You chose " + choice + "and computer chose " + options[x] + " and you won");
                } else {
                    System.out.println("INVALID CHOICE, VERIFY YOUR SPELLING");
                }
            } else if(options[x].equalsIgnoreCase("PAPEL")) {
                if(choice.equalsIgnoreCase("TIJERAS")) {
                    System.out.println("You chose " + choice + "and computer chose " + options[x] + " and you won");
                } else if(choice.equalsIgnoreCase("PIEDRA")) {
                    System.out.println("You chose " + choice + "and computer chose " + options[x] + " and computer won");
                } else {
                    System.out.println("INVALID CHOICE, VERIFY YOUR SPELLING");
                }
            }
        }
    }
}