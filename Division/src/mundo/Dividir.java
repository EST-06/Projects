package mundo;

/**
 *
 * @author Esteban
 */
public class Dividir {
    double divisor, dividendo, cociente;
    int resto;
    
    public Dividir(double divisor, double dividendo){
        this.divisor = divisor;
        this.dividendo = dividendo;        
    }
    
    public void division(){
        cociente = (int)(dividendo/divisor);
        resto = (int)(dividendo%divisor);
    }
    
    public void divisionReal(){
        cociente = dividendo/divisor;
        resto = (int)(dividendo%divisor);
    }

    public double getCociente() {
        return cociente;
    }

    public int getResto() {
        return resto;
    }
    
    
        
}
