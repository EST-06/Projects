
package mundo;

/**
 *
 * @author Esteban
 */
public class Cliente {

    private String nick;
    private String message;
    private String directionIP;

    public Cliente(String nick, String message, String directionIP) {
        this.nick = nick;
        this.message = message;
        this.directionIP = directionIP;
    }

    public String getNick() {
        return nick;
    }

    public String getMessage() {
        return message;
    }

    public String getDirectionIP() {
        return directionIP;
    }
    
}
