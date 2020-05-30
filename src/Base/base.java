package Base;

import java.util.ArrayList;
import java.util.Scanner;

public class base {
    
    private static ArrayList<Double> Radios = new ArrayList<Double>();
    private static ArrayList<Circulo> Circulos = new ArrayList<Circulo>();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        

    }
    
    public double getRadio() {
        return Math.random();
    }
}
