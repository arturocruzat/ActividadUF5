package Base;

public class Circulo {
    
    private double radio;
    
    public Circulo (double r) {
        
        if (r < 1 && r > 0)            
            this.radio = r;
        else
            throw new IllegalArgumentException("Radio incorrecto");
    }
    
    private double perimetro () {
        return 2*Math.PI*getRadio();
    }
    
    private double area () {
        return Math.PI*Math.pow(getRadio(), 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public String toString() {
        return String.format("%s%.4f\t\t%s%.4f", "Perimetro: ", perimetro(),
                "Area: ", area());
    }
}
