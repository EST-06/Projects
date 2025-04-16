package mundo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class Remisor {

    public Remisor(Cliente cliente) {
        socket(cliente);
    }
         

    private void socket(Cliente cliente) {
        try {
            Socket client = new Socket(cliente.getDirectionIP(), 5000);
            ObjectOutputStream outBuffer = new ObjectOutputStream(client.getOutputStream());
            Conversacion msg = new Conversacion(cliente);
            outBuffer.writeObject(msg);
            client.close();
        } catch (UnknownHostException e) {
            JOptionPane.showMessageDialog(null, "Server : socket() : UnknownHostException: " + e.getMessage() + "CLIENTE");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Server : socket() : IOException: " + e.getMessage() + "CLIENTE");
        }
    }

    private class Conversacion {

        private String message;
        private String nick;

        public Conversacion(Cliente cliente) {
            this.message = cliente.getMessage();
            this.nick = cliente.getNick();
        }

        public String getMessage() {
            return message;
        }

        public String getNick() {
            return nick;
        }

    }
}
