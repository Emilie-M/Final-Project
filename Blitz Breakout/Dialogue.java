import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue extends SimulationActor
{
    private int duration = -1;
     
    public Dialogue(String text, int size, int time)
    {
        setImage(new GreenfootImage("Hello......", 20, null, null));
    }
 
    public Dialogue(String text, int size)
    {
        this(text, size, -1);
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
