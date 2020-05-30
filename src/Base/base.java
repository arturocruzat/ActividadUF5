package Base;

import java.util.ArrayList;
import java.util.Scanner;

public class base {
    
    private static ArrayList<Double> Radios = new ArrayList<Double>();
    private static ArrayList<Circulo> Circulos = new ArrayList<Circulo>();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double radio;
        
        do {                
            radio = getRadio();
            Radios.add(radio);
            
            Circulo c = new Circulo(radio);
            Circulos.add(c);
            
        } while (radio >= 0.01);    //Generador de circulos aleatorios
           
    }
    
    public static double getRadio() { //Generador de radio aleatorio entre 0 y 1;
        return Math.random();
    }
}
