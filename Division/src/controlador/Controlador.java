package controlador;

import interfaz.PanelOperadores;
import interfaz.PanelOperandos;
import interfaz.PanelResultado;
import javax.swing.JTextField;
import mundo.Dividir;

/**
 *
 * @author Esteban
 */
public class Controlador {

    private PanelResultado pnlResultado;
    private PanelOperandos pnlOperandos;
    private PanelOperadores pnlOperadores;
    private Dividir dividir;

    public Controlador(PanelResultado pnlResultado, PanelOperandos pnlOperandos, PanelOperadores pnlOperadores) {
        this.pnlResultado = pnlResultado;
        this.pnlOperandos = pnlOperandos;
        this.pnlOperadores = pnlOperadores;
    }

    public boolean validation() {
        double dividendo, divisor;
        try {
            dividendo = Double.parseDouble(pnlOperandos.getDividendo().getText().trim());
            divisor = Double.parseDouble(pnlOperandos.getDivisor().getText().trim());
            dividir = new Dividir(divisor, dividendo);
        } catch (NumberFormatException e) {
            return false;
        }

        switch (pnlOperadores.selectedOptions()) {
            case 0:
                pnlResultado.setResultado(dividir.getCociente());
                break;
            case 1:
                pnlResultado.setResultado(dividir.getResto());
                break;
            case 2: 
                pnlResultado.setResultado(dividir.getCocienteEntero());
                break;
            default:
                System.out.println("Esta mrd se rompio");
                break;
        }

        return true;
    }

}
