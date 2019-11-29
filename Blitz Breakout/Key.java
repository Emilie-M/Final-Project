import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor flynn = getOneObjectAtOffset(0, 0, Flynn.class);
        if (isTouching(Flynn.class)) 
        {
            Greenfoot.playSound("keyPick.wav");
        }
    }  
    protected SimulationWorld getSimulationWorld()
    {
        return (SimulationWorld) getWorld();
    }
}
