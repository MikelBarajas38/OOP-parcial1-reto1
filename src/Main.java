//Parcial 1 Reto 1 Mikel Barajas
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //get user user input
        Scanner input = new Scanner(System.in);

        System.out.print("Captura operación: "); //print instead of println to scan in the same line
        String operation = input.nextLine();

        System.out.print("Operando 1: ");
        int firstOperand = input.nextInt();

        System.out.print("Operando 2: ");
        int secondOperand = input.nextInt();

        switch (operation) {
            case "SUMA" ->
                    System.out.println(firstOperand + " + " + secondOperand + " = " + (firstOperand + secondOperand));
            case "RESTA" ->
                    System.out.println(firstOperand + " - " + secondOperand + " = " + (firstOperand - secondOperand));
            case "MULTIPLICACION" ->
                    System.out.println(firstOperand + " * " + secondOperand + " = " + (firstOperand * secondOperand));
            case "DIVISION" -> {
                    try {
                        System.out.println(firstOperand + " / " + secondOperand + " = " + (firstOperand / secondOperand));
                    } catch (ArithmeticException e) {
                        System.out.println("ERROR: división entre cero");
                    }
            }
            default ->
                    System.out.println("Operación no soportada.");
        }

    }
}
