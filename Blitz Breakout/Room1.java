
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room1 extends SimulationWorld
{
    protected boolean isBlueKeyAcquired2;
    /**
     * Constructor for objects of class Room1.
     * 
     */
    public Room1(boolean isBlueKeyAcquired)
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0); 
        prepare();
        isBlueKeyAcquired2 = isBlueKeyAcquired;
    }

    public void act()
    {
        super.act();
       
        if (isBlueKeyAcquired2) 
        {
            addObject(new BlueKey(), 58, 735);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Heart heart = new Heart();
        addObject(heart,61,52);
        Heart heart2 = new Heart();
        addObject(heart2,93,52);
        Heart heart3 = new Heart();
        addObject(heart3,125,52);
    }
}
