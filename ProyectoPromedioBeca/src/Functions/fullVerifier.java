
package Functions;

import Abstract_Code.verifier;

/**
 *
 * @author Esteban
 */
public class fullVerifier extends verifier {

    logVerifier lv;
    double grade = 4.5;

    @Override
    public boolean isOk(int index, int secIndex) {
        lv = new logVerifier();

        if (!lv.isOk(index, secIndex)) {
            return false;
        }
        if (grade < 4.5) {
            return false;
        }

        return true;

    }

    public void setAverageGrade(double grade) {

        this.grade = grade;
    }

}
