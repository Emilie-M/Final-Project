import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room6 extends SimulationWorld
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
    public Room6(int heart, int positionNum, boolean isBlueKeyAcquired, boolean isGoldKeyAcquired, 
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
        
        if (!isGoldKeyAcquired2 && k < 1) 
        {
            addObject(new GoldKey(), 803,602);
            k++;
        }
        // Copy all 7 below for new Room
        if (isBlueKeyAcquired2 && a < 1) 
        {
            addObject(new BlueKey(), 60, 735);
            a++;
        }
        if (isGoldKeyAcquired2 && b < 1) 
        {
            addObject(new GoldKey(), 62, 735);
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
        
        
        if (positionNumber == 0 && i < 1)
        {
            addObject(new Flynn(), 200, 149);
            i++;
        }
        if(positionNumber == 1 && i < 1)
        {
            addObject(new Flynn(), 180, 606);
            i++;
        }
        
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
    }
    
    public void prepare() 
    {
        RedDoor2 redDoor2 = new RedDoor2();
        addObject(redDoor2,76,129);

        InvisiblePlatform invisiblePlatform = new InvisiblePlatform();
        addObject(invisiblePlatform,899,719);
        InvisiblePlatform invisiblePlatform2 = new InvisiblePlatform();
        addObject(invisiblePlatform2,899,621);
        InvisiblePlatform invisiblePlatform3 = new InvisiblePlatform();
        addObject(invisiblePlatform3,899,523);
        InvisiblePlatform invisiblePlatform4 = new InvisiblePlatform();
        addObject(invisiblePlatform4,899,425);
        InvisiblePlatform invisiblePlatform5 = new InvisiblePlatform();
        addObject(invisiblePlatform5,899,329);
        InvisiblePlatform invisiblePlatform6 = new InvisiblePlatform();
        addObject(invisiblePlatform6,899,233);
        InvisiblePlatform invisiblePlatform7 = new InvisiblePlatform();
        addObject(invisiblePlatform7,899,136);
        InvisiblePlatform invisiblePlatform8 = new InvisiblePlatform();
        addObject(invisiblePlatform8,899,48);
        InvisiblePlatform invisiblePlatform9 = new InvisiblePlatform();
        addObject(invisiblePlatform9,0,719);
        InvisiblePlatform invisiblePlatform10 = new InvisiblePlatform();
        addObject(invisiblePlatform10,0,622);
        InvisiblePlatform invisiblePlatform11 = new InvisiblePlatform();
        addObject(invisiblePlatform11,0,527);
        InvisiblePlatform invisiblePlatform12 = new InvisiblePlatform();
        addObject(invisiblePlatform12,0,429);
        InvisiblePlatform invisiblePlatform13 = new InvisiblePlatform();
        addObject(invisiblePlatform13,0,333);
        InvisiblePlatform invisiblePlatform14 = new InvisiblePlatform();
        addObject(invisiblePlatform14,0,237);
        InvisiblePlatform invisiblePlatform15 = new InvisiblePlatform();
        addObject(invisiblePlatform15,0,138);
        InvisiblePlatform invisiblePlatform16 = new InvisiblePlatform();
        addObject(invisiblePlatform16,1,41);

        Platform platform = new Platform();
        addObject(platform,72,225);
        Platform platform2 = new Platform();
        addObject(platform2,197,225);
        Platform platform3 = new Platform();
        addObject(platform3,491,343);

        Platform platform4 = new Platform();
        addObject(platform4,803,602);
        Platform platform5 = new Platform();
        addObject(platform5,785,174);
        Platform platform6 = new Platform();
        addObject(platform6,77,681);
        Platform platform7 = new Platform();
        addObject(platform7,210,681);
        GoldDoor goldDoor = new GoldDoor();
        addObject(goldDoor,61,584);
        MovingPlatform movingPlatform = new MovingPlatform(1, 9);
        addObject(movingPlatform,633,138);
        HorizontalMovingPlatform horizontalMovingPlatform = new HorizontalMovingPlatform(6, 12);
        addObject(horizontalMovingPlatform,502,559);
        
        Spider spider = new Spider(0, 8);
        addObject(spider,327,95);
    }
}
