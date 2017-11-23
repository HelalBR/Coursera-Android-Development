package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {

    public static int Subtraction(int num1, int num2)
    {
        if(num1 > num2) { return (num1-num2); }
        else { return (-(num2-num1)); }
    }

}
