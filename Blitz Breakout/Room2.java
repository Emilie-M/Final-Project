import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room2 extends SimulationWorld
{
    boolean isBlueKeyAcquired2;
    /**
     * Constructor for objects of class Room2.
     * 
     */
    public Room2(boolean isBlueKeyAcquired)
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
    
    public void prepare()
    {

        Heart heart = new Heart();
        addObject(heart,61,52);
        Heart heart2 = new Heart();
        addObject(heart2,93,52);
        Heart heart3 = new Heart();
        addObject(heart3,125,52);
        Heart heart4 = new Heart();
        addObject(heart4,697,249);

        removeObject(heart4);
        Platform platform = new Platform();
        addObject(platform,756,599);
        PinkDoor pinkDoor = new PinkDoor();
        addObject(pinkDoor,756,502);
    }
}
