import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue extends SimulationActor
{
    public Dialogue()
    {
        setImage(new GreenfootImage("error", 15, Color.WHITE, Color.BLACK));
    }
     
    public void act()
    {
        super.act();
        getSimulationWorld().setGamePaused(true);
        
        if (Greenfoot.isKeyDown("enter"))
        {
            stopDialogue();
        }
    }
    
    public void stopDialogue()
    {
        getSimulationWorld().setGamePaused(false);
        getSimulationWorld().removeObject(this);
    } 
}
