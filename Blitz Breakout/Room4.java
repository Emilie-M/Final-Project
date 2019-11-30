import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room4 extends SimulationWorld
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
    public Room4(int heart, int positionNum, boolean isBlueKeyAcquired, boolean isGoldKeyAcquired, 
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
        if (isPinkKeyAcquired2 && k < 1) 
        {
            addObject(new PinkKey(), 62, 735);
            k++;
        }
        if (isGreenKeyAcquired2 && l < 1) 
        {
            addObject(new GreenKey(), 62, 735);
            l++;
        }
        if (isOrangeKeyAcquired2 && m < 1) 
        {
            addObject(new OrangeKey(), 62, 735);
            m++;
        }
        
        if (hearts == 1 && j < 1) 
        {
            addObject(new Heart(), 61, 52);
            j++;
        }
        if (hearts == 2 && j < 2)
        {
            addObject(new Heart(), 61, 52);
            addObject(new Heart(), 93, 52);
            j++;
        }
        if (hearts == 3 && j < 3) 
        {
            addObject(new Heart(), 61, 52);
            addObject(new Heart(), 93, 52);
            addObject(new Heart(), 125, 52);
            j++;
        }
        
        

        if (positionNumber == 0 && i < 1)
        {
            addObject(new Flynn(), 178, 570);
            i++;
        }
        if(positionNumber == 1 && i < 1)
        {
            addObject(new Flynn(), 693, 278);
            i++;
        }
    }
    
    public void prepare() 
    {

        InvisiblePlatform invisiblePlatform = new InvisiblePlatform();
        addObject(invisiblePlatform,5,53);
        InvisiblePlatform invisiblePlatform2 = new InvisiblePlatform();
        addObject(invisiblePlatform2,6,146);
        InvisiblePlatform invisiblePlatform3 = new InvisiblePlatform();
        addObject(invisiblePlatform3,7,239);
        InvisiblePlatform invisiblePlatform4 = new InvisiblePlatform();
        addObject(invisiblePlatform4,4,337);
        InvisiblePlatform invisiblePlatform5 = new InvisiblePlatform();
        addObject(invisiblePlatform5,5,435);
        InvisiblePlatform invisiblePlatform6 = new InvisiblePlatform();
        addObject(invisiblePlatform6,5,534);
        InvisiblePlatform invisiblePlatform7 = new InvisiblePlatform();
        addObject(invisiblePlatform7,5,628);
        InvisiblePlatform invisiblePlatform8 = new InvisiblePlatform();
        addObject(invisiblePlatform8,5,715);
        InvisiblePlatform invisiblePlatform9 = new InvisiblePlatform();
        addObject(invisiblePlatform9,890,53);
        InvisiblePlatform invisiblePlatform10 = new InvisiblePlatform();
        addObject(invisiblePlatform10,893,151);
        InvisiblePlatform invisiblePlatform11 = new InvisiblePlatform();
        addObject(invisiblePlatform11,894,243);
        InvisiblePlatform invisiblePlatform12 = new InvisiblePlatform();
        addObject(invisiblePlatform12,896,331);
        InvisiblePlatform invisiblePlatform13 = new InvisiblePlatform();
        addObject(invisiblePlatform13,896,412);
        InvisiblePlatform invisiblePlatform14 = new InvisiblePlatform();
        addObject(invisiblePlatform14,895,472);
        InvisiblePlatform invisiblePlatform15 = new InvisiblePlatform();
        addObject(invisiblePlatform15,898,527);
        InvisiblePlatform invisiblePlatform16 = new InvisiblePlatform();
        addObject(invisiblePlatform16,894,570);
        InvisiblePlatform invisiblePlatform17 = new InvisiblePlatform();
        addObject(invisiblePlatform17,894,652);
        InvisiblePlatform invisiblePlatform18 = new InvisiblePlatform();
        addObject(invisiblePlatform18,894,718);
    }
}