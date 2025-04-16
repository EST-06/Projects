package mundo;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class Receptor extends Thread {

    private Object obj;

    public Receptor() {
        start();
    }

    @Override
    public void run() {
        ServerSocket serverSocket;
        Socket socket;
        ObjectInputStream data;

        try {
            serverSocket = new ServerSocket(5050);
            while (true) {
                socket = serverSocket.accept();
                data = new ObjectInputStream(socket.getInputStream());
                obj = data.readObject();
                System.out.println("WAWAWWAWAW");
                socket.close();

            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Client run() : IOException: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Receptor.class.getName() + " RECEPTOR ").log(Level.SEVERE, null, ex);
        }
    }

    public Object getObj() {
        return obj;
    }

}
