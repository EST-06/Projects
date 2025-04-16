package mundo;

import gfutria.Logic;

/**
 *
 * @author Esteban
 */
public class Cambios extends Logic {

    private int[] reloj;

    public Cambios(int[] reloj) {
        this.reloj = reloj;
    }

    public Cambios() {
    }

    public int[] getReloj() {
        return reloj;
    }

    public void setReloj(int[] reloj) {
        this.reloj = reloj;
    }
    
    

    public void rotarDerecha() {
        int temp = reloj[7];
        int[] arrayTemp = new int[8];

        for (int i = 0; i < reloj.length - 1; i++) {
            arrayTemp[i + 1] = reloj[i];
        }
        arrayTemp[0] = temp;
        reloj = arrayTemp;
    }

    public void rotarIzquierda() {
        int temp = reloj[7];
        int[] arrayTemp = new int[8];
        for (int i = reloj.length - 1; i >= 1; i--) {
            arrayTemp[i] = reloj[i - 1];
        }
        arrayTemp[0] = temp;
        reloj = arrayTemp;
    }

    public void organizar() {        
            int temp = reloj[0];
            reloj[0] = reloj[1];
            reloj[1] = temp;        
    }

    public String view() {
        String temp = "";
        for (int i = 0; i < reloj.length; i++) {
            temp += reloj[i];
        }
        return temp;
    }

    @Override
    public Logic cloneObject(Logic logic) {
        Cambios obj = (Cambios)logic;
        Cambios clone = new Cambios();
        
        clone.setReloj(obj.getReloj());
        return clone;
    }

    @Override
    public String state() {
        return ""+reloj[0]+reloj[1]+reloj[2]+reloj[3]+reloj[4]+reloj[5]+reloj[6]+reloj[7];
    }

    @Override
    public void action(int i) {
        switch (i) {
            case 1:
                rotarDerecha();
                break;
            case 2:
                rotarIzquierda();
                break;
            case 3:
                organizar();
                break;
        }
    }

}
