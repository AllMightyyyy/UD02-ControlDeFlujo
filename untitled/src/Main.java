import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 1
        Tenemos dos variables (x e y). Son dos variables numéricas,
        ambas entre 20 y 30. Queremos crear otra variable a la que
        asignar el valor de la mayor de ambas variables (x e y). Crea un IF para ello.
        Si son iguales guarda el valor de cualquiera de las dos variables.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int x = sc.nextInt();
        System.out.println("Enter the second Number : ");
        int y = sc.nextInt();
        System.out.println("The biggest number is : " + Math.max(x, y));
    }
}