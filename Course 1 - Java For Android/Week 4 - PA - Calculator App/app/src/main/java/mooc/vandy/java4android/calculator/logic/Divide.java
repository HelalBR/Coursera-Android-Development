package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {

    public static boolean divbyzero(int num) {
        if (num == 0 || num == -0) {
            return false;
        } else {
            return true;
        }
    }

    public static int Division(int num1, int num2) {
        return (num1 / num2);
    }

    public static int restDivision(int num1, int num2) {
        if ((num1 % num2) < 0) {
            return -(num1 % num2);
        } else {
            return (num1 % num2);
        }

    }
}
