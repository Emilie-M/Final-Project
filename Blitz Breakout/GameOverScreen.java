import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndWorldPit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends SimulationWorld
{
    GifImage gameOverScreen = new GifImage("GameOverScreen.gif");
    
    public GameOverScreen()
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0); 
        
        for (Object obj : gameOverScreen.getImages())
        {
            ((GreenfootImage)obj).scale(getWidth(), getHeight());
        }
    }
    
    public void act()
    {
        super.act();
        
        setBackground(gameOverScreen.getCurrentImage());
        if (Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new StartMenu());
        }
    }
}
