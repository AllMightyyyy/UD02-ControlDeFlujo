import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 3
        Queremos declarar una variable que represente una dirección
        (puede ser Arriba, Abajo, Derecha o Izquierda).
        Nuestro programa debe asignar a otra variable la dirección
        opuesta a la dirección declarada. Se puede imprimir por pantalla
        dicho valor opuesto o almacenarlo en una variable.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a direction, Up, Down, Right, or Left ");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("up")) {
            System.out.println("Down");
        } else if(input.equalsIgnoreCase("down")) {
            System.out.println("Up");
        } else if(input.equalsIgnoreCase("right")) {
            System.out.println("Left");
        } else if(input.equalsIgnoreCase("left")) {
            System.out.println("Right");
        } else {
            System.out.println("You entered an invalid direction, check your spelling");
        }
    }
}