package mundo;

/**
 *
 * @author Esteban
 */
public class Dividir {
    double divisor, dividendo, cociente;
    double resto;
    
    public Dividir(double divisor, double dividendo){
        this.divisor = divisor;
        this.dividendo = dividendo;
        division();
    }
    
    private void division(){
        cociente = dividendo/divisor;        
        resto = (dividendo%divisor);
    }
        
    public double getCociente() {
        return cociente;
    }
    
    public int getCocienteEntero(){
        return (int)cociente;
    }

    public double getResto() {
        return resto;
    }
    
    
        
}
