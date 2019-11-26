
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
    protected int hearts;
    protected int positionNumber;
    /**
     * Constructor for objects of class Room1.
     * 
     */
    public Room1(int heart, boolean isBlueKeyAcquired, int positionNum)
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0);
        super.stopped();
        stopped();
        prepare();
        int hearts = heart;
        isBlueKeyAcquired2 = isBlueKeyAcquired;
        positionNumber = positionNum;
    }
    private int i = 0;
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

        if (positionNumber == 0 && i < 1)
        {
            addObject(new Flynn(), 68, 444);
            i++;
        }

        if(positionNumber == 1 && i < 1)
        {
            addObject(new Flynn(), 68, 444);
            i++;
        }
    }
   
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,189,463);
        Platform platform2 = new Platform();
        addObject(platform2,327,464);
        Platform platform3 = new Platform();
        addObject(platform3,578,584);
        Platform platform4 = new Platform();
        addObject(platform4,416,528);
        BlueDoor blueDoor = new BlueDoor();
        addObject(blueDoor,824,440);
        Platform platform5 = new Platform();
        addObject(platform5,819,538);
        Platform platform6 = new Platform();
        addObject(platform6,68,464);
        platform.setLocation(194,464);
        Platform platform7 = new Platform();
        addObject(platform7,194,464);

        
        BlueKey blueKey = new BlueKey();
        addObject(blueKey,601,597);

        Platform platform8 = new Platform();
        addObject(platform8,637,618);
        platform8.setLocation(584,602);

        Platform platform9 = new Platform();
        addObject(platform9,391,595);
        Platform platform10 = new Platform();
        addObject(platform10,625,619);


        Heart heart = new Heart();
        addObject(heart,61,52);
        Heart heart2 = new Heart();
        addObject(heart2,93,52);
        Heart heart3 = new Heart();
        addObject(heart3,125,52);
        removeObject(platform9);

        removeObject(platform10);
        removeObject(platform8);
        removeObject(blueKey);
        
        
        BlueKey blueKey2 = new BlueKey();
        addObject(blueKey2,547,563);
    }
}
