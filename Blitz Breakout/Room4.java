import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room4 extends SimulationWorld
{
    protected boolean isPinkKeyAcquired2;
    protected boolean isGreenKeyAcquired2;
    protected boolean isOrangeKeyAcquired2;
    protected int hearts;
    protected int positionNumber;
    /**
     * Constructor for objects of class Room2.
     * 
     */
    public Room4(int heart, boolean isPinkKeyAcquired,boolean isGreenKeyAcquired, boolean isOrangeKeyAcquired, int positionNum)
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0);
        prepare();
        isPinkKeyAcquired2 = isPinkKeyAcquired;
        isGreenKeyAcquired2 = isGreenKeyAcquired;
        isOrangeKeyAcquired2 = isOrangeKeyAcquired;
        hearts = heart;
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
        
    }
}