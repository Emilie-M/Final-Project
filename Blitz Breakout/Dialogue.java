import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue extends SimulationActor
{
    //public Dialogue()
    //{
        //super();

    // }

    public void stopDialogue()
    {
        getSimulationWorld().setGamePaused(false);
        getSimulationWorld().removeObject(this);
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
}
