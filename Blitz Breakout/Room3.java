import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room3 extends SimulationWorld
{
    protected boolean isBlueKeyAcquired2;
    protected int hearts;
    protected int positionNumber;
    /**
     * Constructor for objects of class Room2.
     * 
     */
    public Room3(int heart, boolean isBlueKeyAcquired, int positionNum)
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0);
        prepare();
        isBlueKeyAcquired2 = isBlueKeyAcquired;
        hearts = heart;
        positionNumber = positionNumber;
    }
    private int i = 0;
    private int j = 0;
    private int k = 0;
    public void act()
    {
        super.act();
        //if (isBlueKeyAcquired2 && k < 1) 
        //{
            //addObject(new BlueKey(), 58, 735);
            //k++;
        //}
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
            addObject(new Flynn(), 297, 286);
            i++;
        }
        if(positionNumber == 1 && i < 1)
        {
            addObject(new Flynn(), 297, 286);
            i++;
        }
    }

    public void prepare()
    {
        
        
    }
}
