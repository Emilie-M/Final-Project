import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room2 extends SimulationWorld
{
    protected boolean isBlueKeyAcquired2;
    protected int hearts;
    /**
     * Constructor for objects of class Room2.
     * 
     */
    public Room2(int heart, boolean isBlueKeyAcquired)
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0); 
        prepare();
        isBlueKeyAcquired2 = isBlueKeyAcquired;
        int hearts = heart;
        isBlueKeyAcquired2 = isBlueKeyAcquired;
        
    }
    public void act()
    {
        super.act();
        if (isBlueKeyAcquired2) 
        {
            addObject(new BlueKey(), 58, 735);
        }
        if (hearts == 2) 
        {
            addObject(new Heart(), 125, 52);
        }
        
        if (hearts == 1)
        {
            addObject(new Heart(), 93, 52);
        }
        
        if (hearts == 0) 
        {
            addObject(new Heart(), 61, 52);
        }
    }
    
    public void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,756,599);
        PinkDoor pinkDoor = new PinkDoor();
        addObject(pinkDoor,756,502);

        removeObject(platform);
        removeObject(pinkDoor);

        Platform platform2 = new Platform();
        addObject(platform2,277,306);
        Platform platform3 = new Platform();
        addObject(platform3,451,480);
        removeObject(platform3);

        Platform platform4 = new Platform();
        addObject(platform4,535,604);
        Platform platform5 = new Platform();
        addObject(platform5,828,595);
        Platform platform6 = new Platform();
        addObject(platform6,718,595);
        Platform platform7 = new Platform();
        addObject(platform7,651,482);
        Platform platform8 = new Platform();
        addObject(platform8,756,380);
        Platform platform9 = new Platform();
        addObject(platform9,113,552);

        BlueDoor2 blueDoor2 = new BlueDoor2();
        addObject(blueDoor2,98,89);
        Platform platform10 = new Platform();
        addObject(platform10,97,187);
        Platform platform11 = new Platform();
        addObject(platform11,351,480);
        PinkDoor pinkDoor2 = new PinkDoor();
        addObject(pinkDoor2,845,499);
        Heart heart = new Heart();
        addObject(heart,61,52);
        Heart heart2 = new Heart();
        addObject(heart2,93,52);
        Heart heart3 = new Heart();
        addObject(heart3,125,52);
    }
}
