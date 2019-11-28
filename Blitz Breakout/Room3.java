import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room3 extends SimulationWorld
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
    public Room3(int heart, boolean isPinkKeyAcquired, boolean isOrangeKeyAcquired,boolean isGreenKeyAcquired,int positionNum)
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
    private int o = 0;
    private int p = 0;
    public void act()
    {
        super.act();
        if (o < 1) 
        {
            addObject(new Spider(2.0, 6.0), 459, 372);
            o++;
        }
        if (isPinkKeyAcquired2 && k < 1) 
        {
            addObject(new PinkKey(), 62, 735);
            k++;
        }
        if (!(isGreenKeyAcquired2) && p < 1)
        {
            addObject(new GreenKey(), 90,534);
            p++;
        }
        if (isGreenKeyAcquired2 && p < 1) 
        {
            addObject(new GreenKey(), 62, 735);
            p++;
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
        Platform platform = new Platform();
        addObject(platform,71,645);
        Platform platform2 = new Platform();
        addObject(platform2,204,645);
        Platform platform3 = new Platform();
        addObject(platform3,328,537);
        Platform platform4 = new Platform();
        addObject(platform4,502,438);
        Platform platform5 = new Platform();
        addObject(platform5,507,650);
        Platform platform6 = new Platform();
        addObject(platform6,145,413);
        Platform platform7 = new Platform();
        addObject(platform7,702,352);
        Platform platform8 = new Platform();
        addObject(platform8,823,352);
        PinkDoor2 pinkDoor2 = new PinkDoor2();
        addObject(pinkDoor2,56,548);
        OrangeDoor orangeDoor = new OrangeDoor();
        addObject(orangeDoor,838,255);
        Spider spider = new Spider(2, 6);
        addObject(spider,459,372);
        Platform platform9 = new Platform();
        addObject(platform9,295,284);
        Platform platform10 = new Platform();
        addObject(platform10,182,180);
        Platform platform11 = new Platform();
        addObject(platform11,71,180);
        GreenDoor greenDoor = new GreenDoor();
        addObject(greenDoor,54,83);
    }
}
