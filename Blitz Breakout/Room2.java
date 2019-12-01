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
        super("ost.wav", 900, 768, new Point2D(8.0, 6.0), 16.0);
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
            addObject(new PinkKey(), 103,603);
            //isPinkKeyAcquired2 = true;
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
            addObject(new Flynn(), 219, 110);
            i++;
        }
        if(positionNumber == 1 && i < 1)
        {
            addObject(new Flynn(), 737, 543);
            i++;
        }
    }

    public void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,75,186);
        Platform platform2 = new Platform();
        addObject(platform2,202,186);
        Platform platform3 = new Platform();
        addObject(platform3,306,353);
        Platform platform4 = new Platform();
        addObject(platform4,249,536);
        Platform platform5 = new Platform();
        addObject(platform5,116,620);
        Platform platform6 = new Platform();
        addObject(platform6,524,623);
        Platform platform7 = new Platform();
        addObject(platform7,829,620);
        Platform platform8 = new Platform();
        addObject(platform8,737,620);
        PinkDoor pinkDoor = new PinkDoor();
        addObject(pinkDoor,846,523);
        Platform platform9 = new Platform();
        addObject(platform9,655,515);
        Platform platform10 = new Platform();
        addObject(platform10,748,397);

        BlueDoor2 blueDoor2 = new BlueDoor2();
        addObject(blueDoor2,62,89);

        InvisiblePlatform invisiblePlatform = new InvisiblePlatform();
        addObject(invisiblePlatform,0,719);
        InvisiblePlatform invisiblePlatform2 = new InvisiblePlatform();
        addObject(invisiblePlatform2,0,620);
        InvisiblePlatform invisiblePlatform4 = new InvisiblePlatform();
        addObject(invisiblePlatform4,0,423);

        InvisiblePlatform invisiblePlatform5 = new InvisiblePlatform();
        addObject(invisiblePlatform5,0,324);
        InvisiblePlatform invisiblePlatform6 = new InvisiblePlatform();
        addObject(invisiblePlatform6,0,226);
        InvisiblePlatform invisiblePlatform7 = new InvisiblePlatform();
        addObject(invisiblePlatform7,0,126);
        InvisiblePlatform invisiblePlatform8 = new InvisiblePlatform();
        addObject(invisiblePlatform8,0,3);
        InvisiblePlatform invisiblePlatform9 = new InvisiblePlatform();
        addObject(invisiblePlatform9,0,3);
        InvisiblePlatform invisiblePlatform10 = new InvisiblePlatform();
        addObject(invisiblePlatform10,899,723);
        InvisiblePlatform invisiblePlatform11 = new InvisiblePlatform();
        addObject(invisiblePlatform11,899,629);
        InvisiblePlatform invisiblePlatform12 = new InvisiblePlatform();
        addObject(invisiblePlatform12,899,537);
        InvisiblePlatform invisiblePlatform13 = new InvisiblePlatform();
        addObject(invisiblePlatform13,899,441);
        InvisiblePlatform invisiblePlatform14 = new InvisiblePlatform();
        addObject(invisiblePlatform14,899,343);
        InvisiblePlatform invisiblePlatform15 = new InvisiblePlatform();
        addObject(invisiblePlatform15,899,245);
        InvisiblePlatform invisiblePlatform16 = new InvisiblePlatform();
        addObject(invisiblePlatform16,899,149);
        InvisiblePlatform invisiblePlatform17 = new InvisiblePlatform();
        addObject(invisiblePlatform17,899,49);
        InvisiblePlatform invisiblePlatform18 = new InvisiblePlatform();
        addObject(invisiblePlatform18,899,49);
        InvisiblePlatform invisiblePlatform19 = new InvisiblePlatform();
        addObject(invisiblePlatform19,0,520);

        
        
        
    }
}