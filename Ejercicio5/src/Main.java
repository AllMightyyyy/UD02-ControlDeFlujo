import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 5
        Queremos comprobar si con una compra en la que gastamos 5249.24 euros,
        nos quedamos en números rojos.
        Realiza una operación para “gastar” dicha cantidad de dinero en
        una variable llamada ahorros.
        En caso de estar en números rojos debemos imprimir un mensaje por
        pantalla. En caso de no estar en números rojos, pero si nuestros ahorros
        son menores que 1000 euros, debemos imprimir un mensaje de aviso para no
        gastar mucho más. En otro caso, pasaremos a gastar 2000 euros más y mostrar por
        pantalla cómo quedan nuestros ahorros después del gasto.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much money is in your savings account :");
        double savings = sc.nextDouble();

        System.out.println("How much are you going to spend ? ");
        double spending = sc.nextDouble();

        double warningValue = 1000.00;

        if((savings - spending) < 0) {
            System.out.println("You don't have enough money, you will be in the red");
        } else if ((savings - spending) < warningValue) {
            System.out.println("You have the money but your balance will be under 1000.00");
        } else {
            System.out.println("You can make this operation, you have enough funds and you will have : " + (savings - spending));
        }
    }
}