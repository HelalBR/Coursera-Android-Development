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
        mBusinessName = null;
        mParkingSpaces = 0;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        mParkingSpaces = 0;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
        sTotalOffices++;
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

    public String toString() {
        String result = "Business: ";
        if(this.getBusinessName()!= null) {
            result += mBusinessName;
        }else{
            result += "unoccupied";
        }
        if(this.getParkingSpaces()>0){
            result += "; has "+ mParkingSpaces + " parking spaces";
        }
        return result+" (total offices: " + sTotalOffices + ")";
    }


    public boolean equals(Object obj) {
        if (obj instanceof Office) {
            Office otherOffice = (Office) obj;
            if (otherOffice.calcBuildingArea() == this.calcBuildingArea() && otherOffice.getParkingSpaces() == this.getParkingSpaces())
                return true;
        }
        return false;
    }

}
