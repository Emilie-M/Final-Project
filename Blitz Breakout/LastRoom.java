import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LastRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LastRoom extends SimulationWorld
{
    protected boolean isBlueKeyAcquired2;
    protected boolean isGoldKeyAcquired2;
    protected boolean isGreenKeyAcquired2;
    protected boolean isOrangeKeyAcquired2;
    protected boolean isPinkKeyAcquired2;
    protected boolean isRedKeyAcquired2;
    protected boolean isSilverKeyAcquired2;
    
    protected int positionNumber;
    
    /**
     * Constructor for objects of class LastRoom.
     * 
     */
    public LastRoom(int heart, int positionNum, boolean isBlueKeyAcquired, boolean isGoldKeyAcquired, 
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
        
        if ((isBlueKeyAcquired2 == false) && j < 1) 
        {
            addObject(new BlueKey(),547,563);
            //isBlueKeyAcquired2 = true;
            j++;
        }
        
        // Copy all 7 below for new Room #3
        if (isBlueKeyAcquired2 && a < 1) 
        {
            addObject(new BlueKey(), 58, 735);
            a++;
        }
        if (isGoldKeyAcquired2 && b < 1) 
        {
            addObject(new GoldKey(), 62, 735);
            b++;
        }
        if (isGreenKeyAcquired2 && c < 1) 
        {
            addObject(new GreenKey(), 66, 735);
            c++;
        }
        if (isOrangeKeyAcquired2 && d < 1) 
        {
            addObject(new OrangeKey(), 70, 735);
            d++;
        }
        if (isPinkKeyAcquired2 && e < 1) 
        {
            addObject(new PinkKey(), 74,735);
            e++;
        }
        if (isRedKeyAcquired2 && f < 1) 
        {
            addObject(new RedKey(), 78, 735);
            f++;
        }
        if (isSilverKeyAcquired2 && g < 1) 
        {
            addObject(new SilverKey(), 82, 735);
            g++;
        }

        // Flynn Spawn
        if (positionNumber == 0 && i < 1)
        {
            addObject(new Flynn(), 147, 497);
            i++;
        }
        if(positionNumber == 1 && i < 1)
        {
            addObject(new Flynn(), 713, 360);
            i++;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Stairs stairs = new Stairs();
        addObject(stairs,414, 584);
        Stair stair = new Stair();
        addObject(stair,9,682);
        SilverDoor2 silverDoor2 = new SilverDoor2();
        addObject(silverDoor2,58,477);
        Torch torch = new Torch();
        addObject(torch,131,490);
        Aura aura = new Aura();
        addObject(aura,134,476);
        Flame flame = new Flame();
        addObject(flame,133,481);
        Stair stair2 = new Stair();
        addObject(stair2,836,682);
        Stair stair3 = new Stair();
        addObject(stair3,838,517);
        Gate gate = new Gate();
        addObject(gate,820,311);
        Rays rays = new Rays();
        addObject(rays, 502, 362);
    }
}
