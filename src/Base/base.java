package Base;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class base {
    
    private static ArrayList<Circulo> Circulos = new ArrayList<Circulo>();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double radio;
        
        //Generador de circulos aleatorios
        do {                
            radio = getRadio();
            
            Circulo c = new Circulo(radio);
            Circulos.add(c);
            
        } while (radio >= 0.01);
        
        System.out.println("Circulos generados");
        System.out.println("");
        
        //Ordenamos la lista
        System.out.println("La lista se ordenara por radios: \n"
            + "1 -> ascendentes \n2 -> descendentes");
        
        boolean correcto = false;
        do { 
            var respuesta = input.next();
            if (respuesta.equals("1")){
                Circulos.sort(Comparator.comparingDouble(Circulo::getRadio));
                correcto = true;
            }
            else if (respuesta.equals("2")){
                Circulos.sort(Comparator.comparingDouble(Circulo::getRadio).reversed());
                correcto = true;
            }
            else
                System.err.println("Debe introducir 1 o 2");
        } while (!correcto);
        
        
        //Imprimimos la lista de circulos
        System.out.println("");
        System.out.println("Circulos");
        for (Circulo lista : Circulos) {
            System.out.println(lista.toString());
        }
           
    }
    
    public static double getRadio() { //Generador de radio aleatorio entre 0 y 1;
        return Math.random();
    }
}
