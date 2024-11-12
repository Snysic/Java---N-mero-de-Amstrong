package amstrong.ejercicio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un numero para comprobar");
        int number = scanner.nextInt();
        
        boolean isSpecial = Numero.isSpecialNumber(number);
        
        if (isSpecial) {
            System.out.println(number + " Numero especial.");
        } else {
            System.out.println(number + " Numero no especial.");
        }
        
        scanner.close();
    }
}
