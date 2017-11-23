package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner)
    {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool)
    {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }

    public String getOwner()
    {
        return this.mOwner;
    }

    public boolean hasPool()
    {
        return this.mPool;
    }

    public void setOwner(String owner)
    {
        this.mOwner = owner;
    }

    public void setPool(boolean pool)
    {
        this.mPool = pool;
    }


    public String toString() {
        String result = "Owner: ";
        if (mOwner != null)
            result += getOwner();
        else
            result += "n/a";
        if (mPool)
            result += "; has a pool";
        if(this.calcLotArea() > 2*this.calcBuildingArea())
            result += "; has a big open space";
        return result;
    }


    public boolean equals(Object obj) {
        if (obj instanceof House) {
            House otherHouse = (House) obj;
            if (otherHouse.calcBuildingArea() == this.calcBuildingArea() && otherHouse.hasPool() == this.hasPool())
                return true;
        }
        return false;
    }
}
