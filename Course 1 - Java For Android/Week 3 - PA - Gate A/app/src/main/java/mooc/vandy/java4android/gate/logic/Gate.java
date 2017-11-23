package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {

    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    public Gate()
    {
        this.mSwing = 0;
    }

    public boolean setSwing(int direction)
    {
        if(direction == -1 || direction ==1)
        {
            this.mSwing = direction;
            return true;
        }
        else
        {
            return false;
        }

    }

    public boolean open(int direction)
    {
        if (direction == -1 || direction == 1)
        {
            this.mSwing = direction;
            return true;
        }
        else
        {
            return false;
        }
    }

    public void close()
    {
        this.mSwing = 0;
    }

    public int getSwingDirection()
    {
        return this.mSwing;
    }

    public int thru(int count)
    {
        if(mSwing == -1)
        {
            return -count;
        }
        else if(mSwing == 0)
        {
            return 0;
        }
        else
        {
            return count;
        }
    }

    public String toString()
    {
        if(mSwing == -1)
        {
            return("This gate is open and swings to exit the pen only");
        }
        else if(mSwing == 0)
        {
            return("This gate is closed");
        }
        else if(mSwing == 1)
        {
            return("This gate is open and swings to enter the pen only");
        }
        else
        {
            return("This gate has an invalid swing direction");
        }
    }

}
