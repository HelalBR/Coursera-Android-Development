package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {

    public static void print(Building[] buildings, String header, OutputInterface out)
    {
        out.print(header + "\n");
        out.print("----------\n");
        for (Building build: buildings)
        {
            out.print(build.toString() + "\n");
        }
        out.print("\n");
    }

    public static int calcArea(Building[] buildings)
    {
        int totalarea = 0;
        for (Building build: buildings)
        {
            totalarea = totalarea + build.calcLotArea();
        }
        return totalarea;
    }

    
}
