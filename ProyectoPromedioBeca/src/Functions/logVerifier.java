package Functions;

import Abstract_Code.verifier;

/**
 *
 * @author Esteban
 */
public class logVerifier extends verifier{

    public boolean isOk(int index, int secIndex) {
        if (index == secIndex) {
            return true;
        }       
        return false;
    }

    
    
}
