/*
* File: Main.java
* Author: Ács Bence
* Copyright: 2025, Ács Bence
* Group: szoft/2/n
* Date: 2025.01.16
* Github: 
* Licenc: GNU GPL
*/
public class Calculator {
    public static double calculateSurfaceArea(double radius, double height) {
       
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException("A sugár és magasság értéke pozitív kell legyen.");
        }
        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralSurface = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralSurface;
    }
}
