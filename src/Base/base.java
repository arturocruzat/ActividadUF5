package Base;

import java.util.ArrayList;
import java.util.Scanner;

public class base {
    
    private static ArrayList<Double> Radios = new ArrayList<Double>();
    private static ArrayList<Circulo> Circulos = new ArrayList<Circulo>();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double radio;
        
        //Generador de circulos aleatorios
        do {                
            radio = getRadio();
            Radios.add(radio);
            
            Circulo c = new Circulo(radio);
            Circulos.add(c);
            
        } while (radio >= 0.01);
        
        //Imprimimos la lista de circulos
        System.out.println("Circulos");
        for (Circulo lista : Circulos) {
            System.out.println(lista.toString());
        }
           
    }
    
    public static double getRadio() { //Generador de radio aleatorio entre 0 y 1;
        return Math.random();
    }
}
