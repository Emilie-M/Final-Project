
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
    boolean dialogPop2;
    double popUp;
    /**
     * Constructor for objects of class Room1.
     * 
     */
    public Room1(boolean dialogPop, int heart, boolean isBlueKeyAcquired, int positionNum)
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0);
        super.stopped();
        stopped();
        prepare();
        dialogPop2 = dialogPop;
        hearts = heart;
        isBlueKeyAcquired2 = isBlueKeyAcquired;
        positionNumber = positionNum;
    }
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;

    public void act()
    {
        super.act();
        
        popUp += getTimeStepDuration();
        if (popUp >= 2 && popUp <= 7 && l < 1 && dialogPop2)
        {
            addObject(new Dialog("Where am I? All I remember is the storm and my car breaking down..", "", "", ""), 449, 666);
            l++;
        }
        
        if (popUp >= 8 && m < 1 && dialogPop2)
        {
            addObject(new Dialog("I did enter this manor though, maybe I'm under it?", "", "\"Press enter to close.\"", ""), 449, 666);
            m++;
        }
            
        if (isBlueKeyAcquired2 && j < 1) 
        {
            addObject(new BlueKey(), 58, 735);
            j++;
        }
        
        if (!(isBlueKeyAcquired2) && j < 1) 
        {
            addObject(new BlueKey(),547,563);
            j++;
        }
        
        if (isBlueKeyAcquired2) 
        {
            addObject(new BlueKey(), 58, 735);
            j++;
        }
        if (!(isBlueKeyAcquired2) && j < 1) 
        {
            addObject(new BlueKey(),547,563);
            j++;
        }

        if (hearts == 1 && k < 1) 
        {
            addObject(new Heart(), 61, 52);
            k++;
        }
        if (hearts == 2 && k < 2)
        {
            addObject(new Heart(), 61, 52);
            addObject(new Heart(), 93, 52);
            k++;
        }
        if (hearts == 3 && k < 3) 
        {
            addObject(new Heart(), 61, 52);
            addObject(new Heart(), 93, 52);
            addObject(new Heart(), 125, 52);
            k++;
        }

        if (positionNumber == 0 && i < 1)
        {
            addObject(new Flynn(), 68, 444);
            i++;
        }

        if(positionNumber == 1 && i < 1)
        {
            addObject(new Flynn(), 716, 463);
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

        Heart heart = new Heart();
        addObject(heart,61,52);
        Heart heart2 = new Heart();
        addObject(heart2,93,52);
        Heart heart3 = new Heart();
        addObject(heart3,125,52);
       

        BlueKey blueKey2 = new BlueKey();
        addObject(blueKey2,547,563);

        Platform platform12 = new Platform();
        addObject(platform12,749,538);
        Platform platform13 = new Platform();
        addObject(platform13,828,538);
    }
}
