/*
* File: Calculator.java
* Author: Ács Bence
* Copyright: 2025, Ács Bence
* Group: szoft/2/n
* Date: 2025.01.16
* Github: 
* Licenc: GNU GPL
*/
public class Calculator {
    public static double calculateSurfaceArea(double radius, double height) {
    
        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralSurface = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralSurface;
    }
}
