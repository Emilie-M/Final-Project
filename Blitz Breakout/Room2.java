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
    protected boolean isGoldKeyAcquired2;
    protected boolean isGreenKeyAcquired2;
    protected boolean isOrangeKeyAcquired2;
    protected boolean isPinkKeyAcquired2;
    protected boolean isRedKeyAcquired2;
    protected boolean isSilverKeyAcquired2;
    
    protected int hearts;
    protected int positionNumber;
    /**
     * Constructor for objects of class Room2.
     * 
     */
    public Room2(int heart, int positionNum, boolean isBlueKeyAcquired, boolean isGoldKeyAcquired, 
    boolean isGreenKeyAcquired, boolean isOrangeKeyAcquired, boolean isPinkKeyAcquired,boolean isRedKeyAcquired, boolean isSilverKeyAcquired)
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0);
        prepare();
        
        isBlueKeyAcquired2 = isBlueKeyAcquired;
        isGoldKeyAcquired2 = isGoldKeyAcquired;
        isGreenKeyAcquired2 = isGreenKeyAcquired;
        isOrangeKeyAcquired2 = isOrangeKeyAcquired;
        isPinkKeyAcquired2 = isPinkKeyAcquired;
        isRedKeyAcquired2 = isRedKeyAcquired;
        isSilverKeyAcquired2 = isSilverKeyAcquired;
        
        hearts = heart;
        positionNumber = positionNum;
    }
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    public void act()
    {
        super.act();
        if ((isPinkKeyAcquired2 == false) && k < 1) 
        {
            addObject(new PinkKey(), 87,534);
            isPinkKeyAcquired2 = true;
            k++;
        }
        // Copy all 7 below for new Room
        if (isBlueKeyAcquired2 && a < 1) 
        {
            addObject(new BlueKey(), 58, 735);
            a++;
        }
        if (isGoldKeyAcquired2 && b < 1) 
        {
            addObject(new GoldKey(), 60, 735);
            b++;
        }
        if (isGreenKeyAcquired2 && c < 1) 
        {
            addObject(new GreenKey(), 62, 735);
            c++;
        }
        if (isOrangeKeyAcquired2 && d < 1) 
        {
            addObject(new OrangeKey(), 64, 735);
            d++;
        }
        if (isPinkKeyAcquired2 && e < 1) 
        {
            addObject(new PinkKey(), 66,735);
            e++;
        }
        if (isRedKeyAcquired2 && f < 1) 
        {
            addObject(new RedKey(), 68, 735);
            f++;
        }
        if (isSilverKeyAcquired2 && g < 1) 
        {
            addObject(new SilverKey(), 70, 735);
            g++;
        }
        // STAP
        
        
        if (hearts == 1 && j < 1) 
        {
            addObject(new Heart(), 61, 52);
            j++;
        }
        if (hearts == 2 && j < 1)
        {
            addObject(new Heart(), 61, 52);
            addObject(new Heart(), 93, 52);
            j++;
        }
        if (hearts == 3 && j < 1) 
        {
            addObject(new Heart(), 61, 52);
            addObject(new Heart(), 93, 52);
            addObject(new Heart(), 125, 52);
            j++;
        }

        // Flynn Spawn
        if (positionNumber == 0 && i < 1)
        {
            addObject(new Flynn(), 297, 286);
            i++;
        }
        if(positionNumber == 1 && i < 1)
        {
            addObject(new Flynn(), 733, 521);
            i++;
        }
    }

    public void prepare()
    {
        Platform platform = new Platform();
        addObject(platform, 756, 599);
        PinkDoor pinkDoor = new PinkDoor();
        addObject(pinkDoor, 756, 502);

        removeObject(platform);
        removeObject(pinkDoor);

        Platform platform2 = new Platform();
        addObject(platform2, 277, 306);
        Platform platform3 = new Platform();
        addObject(platform3, 451, 480);
        removeObject(platform3);

        Platform platform4 = new Platform();
        addObject(platform4, 535, 604);
        Platform platform5 = new Platform();
        addObject(platform5, 828, 595);
        Platform platform6 = new Platform();
        addObject(platform6, 718, 595);
        Platform platform7 = new Platform();
        addObject(platform7, 651, 482);
        Platform platform8 = new Platform();
        addObject(platform8, 756, 380);
        Platform platform9 = new Platform();
        addObject(platform9, 113, 552);

        BlueDoor2 blueDoor2 = new BlueDoor2();
        addObject(blueDoor2, 98, 89);
        Platform platform10 = new Platform();
        addObject(platform10, 97, 187);
        Platform platform11 = new Platform();
        addObject(platform11, 351, 480);
        PinkDoor pinkDoor2 = new PinkDoor();
        addObject(pinkDoor2, 845, 499);
        
    }
}