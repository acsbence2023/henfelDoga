/*
* File: Main.java
* Author: Ács Bence
* Copyright: 2025, Ács Bence
* Group: szoft/2/n
* Date: 2025.01.16
* Github: 
* Licenc: GNU GPL
*/
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg a henger sugarát (r): ");
        double radius = scanner.nextDouble();
        System.out.print("Adja meg a henger magasságát (h): ");
        double height = scanner.nextDouble();

        
        double surfaceArea = Calculator.calculateSurfaceArea(radius, height);

        System.out.printf("A henger felszíne: %.2f négyzetegység\n", surfaceArea);

        scanner.close();
    }
}
