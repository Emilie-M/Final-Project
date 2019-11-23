import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueDoor extends Door
{
    /**
     * Act - do whatever the BlueDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        
        Actor blueKey = getOneObjectAtOffset(0, 0, BlueKey.class);
        Actor flynn = getOneObjectAtOffset(0, 0, Flynn.class);
        if (blueKey.getY() == 735 && isTouching(Flynn.class))
        {
            SimulationWorld world = (SimulationWorld) getWorld();
            Greenfoot.setWorld(new Room2());
        }
    }    
}
