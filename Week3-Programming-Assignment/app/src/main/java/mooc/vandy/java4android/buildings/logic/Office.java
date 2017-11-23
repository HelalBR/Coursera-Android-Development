package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    public Office(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
    }

    public String getBusinessName()
    {
        return this.mBusinessName;
    }

    public int getParkingSpaces()
    {
        return this.mParkingSpaces;
    }

    public void setBusinessName(String name)
    {
        this.mBusinessName = name;
    }

    public void setParkingSpaces(int spaces)
    {
        this.mParkingSpaces = spaces;
    }

    // TODO toString() equals()

}
