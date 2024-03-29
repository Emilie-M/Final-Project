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
        super("StartMenu.wav", 900, 768, new Point2D(8.0, 6.0), 16.0);
        for (Object obj : startMenu.getImages())
        {
            ((GreenfootImage)obj).scale(getWidth(), getHeight());
        }
    }

    public void act()
    {
        super.act();
        setBackground(startMenu.getCurrentImage());
        Flynn.setHearts();

        if (Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new Room1(true, 3, 0, false, false, false, false, false, false, false));
        }
    }
}
