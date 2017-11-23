package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

import static mooc.vandy.java4android.gate.logic.Gate.IN;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }


    // TODO -- Fill your code in here
    public void setCorralGates(Gate[] gates, Random selDir) {
        mOut.println("Initial gate setup:");
        for(int i=0; i<gates.length; i++) {
            gates[i].setSwing(selDir.nextInt(3)-1);
            mOut.println("Gate " + i + ": " + gates[i].toString());
        }
    }


    public boolean anyCorralAvailable(Gate[] gates) {
        for(int i=0; i<gates.length; i++) {
            if(gates[i].getSwingDirection() == IN) {
                return true;
            }
        }
        return false;
    }


    public int corralSnails(Gate[] gates, Random rand) {
        int pasture = 5;
        int count = 0;
        int randomInt;
        int randomGate;

        do {
            randomGate = rand.nextInt(gates.length);
            randomInt = rand.nextInt(pasture)+1;
            mOut.println(randomInt + " are trying to move through corral " + randomGate);
            pasture -= gates[randomGate].thru(randomInt);
            count++;
        }
        while(pasture > 0);

        mOut.println("It took "+count+" attempts to corral all of the snails.");
        return count;
    }
}