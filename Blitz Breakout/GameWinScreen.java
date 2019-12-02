import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWinScreen extends SimulationWorld
{
    GifImage gameWin = new GifImage("GameWinScreen.gif");
    /**
     * Constructor for objects of class GameWinScreen.
     * 
     */
    public GameWinScreen()
    {
        super("GameWin.wav", 900, 768, new Point2D(8.0, 6.0), 16.0);
        
        for (Object obj : gameWin.getImages())
        {
            ((GreenfootImage)obj).scale(getWidth(), getHeight());
        }
    }
    public void act()
    {
        super.act();
        
        setBackground(gameWin.getCurrentImage());
        if (Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new StartMenu());
        }
    }
}
