package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
    }

    /**
     * 1 = Addition
     * 2 = Subtraction
     * 3 = Multiplication
     * 4 = Division
     */
    private static final int ADD = 1;
    private static final int SUB = 2;
    private static final int MUL = 3;
    private static final int DIV = 4;

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        int result = 0;
        boolean no_error = true; // If false = division by zero
        int restDiv = 0;

        switch (operation) {
            case ADD:
                result = Add.Addition(argumentOne, argumentTwo);
                break;
            case SUB:
                result = Subtract.Subtraction(argumentOne, argumentTwo);
                break;
            case MUL:
                result = Multiply.Multiplication(argumentOne, argumentTwo);
                break;
            case DIV: {
                no_error = Divide.divbyzero(argumentTwo);
                if (!no_error) {
                    break;
                } else {
                    result = Divide.Division(argumentOne, argumentTwo);
                    restDiv = Divide.restDivision(argumentOne, argumentTwo);
                }
                break;
            }
        }

        if (!no_error) {
            mOut.print("Warning: Division by zero can lead to world destruction!");
        } else if (operation != DIV) {
            mOut.print("" + result);
        } else {
            mOut.print(result + " " + "R: " + restDiv);
        }
    }
}