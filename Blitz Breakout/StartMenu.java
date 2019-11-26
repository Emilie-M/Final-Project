import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends SimulationWorld
{
    GifImage startMenu = new GifImage("StartMenu.gif");

    public StartMenu()
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0);
        super.stopped();
        for (Object obj : startMenu.getImages())
        {
            ((GreenfootImage)obj).scale(getWidth(), getHeight());
        }
    }

    public void act()
    {
        super.act();
        setBackground(startMenu.getCurrentImage());

        if (Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new Room1(3, false, 0));
        }
    }
}
