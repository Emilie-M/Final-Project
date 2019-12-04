import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gate extends Door
{
    /**
     * Act - do whatever the Gate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
    }   
    
    public void transitionEnd()
    {
        if (isDoorTouchingFlynn()) 
        {
            SimulationWorld world = (SimulationWorld) getWorld();
            world.transitionToWorld(new GameWinScreen());
        }
    }
}
