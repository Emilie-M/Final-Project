import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room2 extends SimulationWorld
{

    /**
     * Constructor for objects of class Room2.
     * 
     */
    public Room2()
    {
        super(900, 768, new Point2D(8.0, 6.0), 16.0); 
        prepare();
    }
    public void act()
    {
        super.act();
    }
    
    public void prepare()
    {
        Heart heart = new Heart();
        addObject(heart,61,52);
        Heart heart2 = new Heart();
        addObject(heart2,93,52);
        Heart heart3 = new Heart();
        addObject(heart3,125,52);
    }
}
