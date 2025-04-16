
package controlador;

import interfaz.panelChat;
import interfaz.panelInfo;
import mundo.Cliente;
import mundo.Receptor;

/**
 *
 * @author Esteban
 */
public class Controlador {
    private panelInfo pnlInfo;
    private panelChat pnlChat;
    private Cliente cliente;

    public Controlador() {
    }
    public void ejecucion(String msg){
        cliente = new Cliente(pnlInfo.getNick(), );
        
    }
    public void setInstance(panelInfo info, panelChat chat){
        this.pnlChat = chat;
        this.pnlInfo = info;
    }
    
    public void traduccionDeObjeto(Object objeto){
        
    }
    
}
