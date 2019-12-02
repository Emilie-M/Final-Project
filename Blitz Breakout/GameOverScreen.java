import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndWorldPit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends SimulationWorld
{
    public GameOverScreen()
    {
        super("", 900, 768, new Point2D(8.0, 6.0), 16.0); 
        
        GreenfootImage img = new GreenfootImage("gameover.png");
        img.scale(900,768);
        setBackground(img);
    }
    
    public void act()
    {
        super.act();
        
        if (Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new StartMenu());
        }
    }
}
