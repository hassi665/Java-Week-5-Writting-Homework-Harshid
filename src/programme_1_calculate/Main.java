package programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaring a scanner object
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            //input first number
            System.out.print("Please first number : ");
            int a = scanner.nextInt();
            //input second number
            System.out.print("Please Second number : ");
            int b = scanner.nextInt();
            //input symbol
            System.out.print("Please enter one of symbol +,-,*, / :");
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            //input Y or N for further calculation
            System.out.print("Would you like to do more calculation Please enter “Y” or “N” : ");
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        //Closing scanner
        scanner.close();
    }
}
