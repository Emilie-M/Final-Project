import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends SimulationWorld
{
    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public StartMenu()
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0);
    }
    
    public void act()
    {
        super.act();
        if (Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new Room1(false));
        }
    }
}
