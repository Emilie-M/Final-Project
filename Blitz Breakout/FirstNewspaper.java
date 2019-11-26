import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstNewspaper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstNewspaper extends SimulationWorld
{

    /**
     * Constructor for objects of class FirstNewspaper.
     * 
     */
    public FirstNewspaper()
    {
        super("", 1000, 755, new Point2D(8.0, 6.0), 16.0);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("f"))
        {
            Greenfoot.setWorld(new Room1(false));
        }
    }
}
