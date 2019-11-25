
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
        Platform platform = new Platform();
        addObject(platform,189,463);
        Platform platform2 = new Platform();
        addObject(platform2,327,464);
        Platform platform3 = new Platform();
        addObject(platform3,514,534);
        Platform platform4 = new Platform();
        addObject(platform4,656,615);
        BlueDoor blueDoor = new BlueDoor();
        addObject(blueDoor,824,440);
        Platform platform5 = new Platform();
        addObject(platform5,819,538);
        Flynn flynn = new Flynn();
        addObject(flynn,145,386);
        Platform platform6 = new Platform();
        addObject(platform6,68,464);
        platform.setLocation(194,464);
        Platform platform7 = new Platform();
        addObject(platform7,194,464);

        platform4.setLocation(601,597);
        BlueKey blueKey = new BlueKey();
        addObject(blueKey,601,597);

        Platform platform8 = new Platform();
        addObject(platform8,637,618);
        platform8.setLocation(584,602);

        Platform platform9 = new Platform();
        addObject(platform9,391,595);
        Platform platform10 = new Platform();
        addObject(platform10,625,619);
        Platform platform14 = new Platform();
        addObject(platform14,396,542);
        platform10.setLocation(569,600);
        BlueKey blueKey2 = new BlueKey();
        addObject(blueKey2,569,600);

        Platform platform13 = new Platform();
        addObject(platform13,625,608);

        BlueKey blueKey3 = new BlueKey();
        addObject(blueKey3,574,581);

        Heart heart = new Heart();
        addObject(heart,61,52);
        Heart heart2 = new Heart();
        addObject(heart2,93,52);
        Heart heart3 = new Heart();
        addObject(heart3,125,52);
        removeObject(platform9);

        removeObject(blueKey2);
        removeObject(platform10);
        removeObject(platform8);
        removeObject(blueKey);
        platform3.setLocation(418,533);
        platform3.setLocation(456,541);
        platform4.setLocation(581,539);
        platform3.setLocation(404,532);
        platform4.setLocation(576,589);
    }
}
