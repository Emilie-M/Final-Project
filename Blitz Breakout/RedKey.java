import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedKey extends Key
{
    public void act() 
    {
        detectCollision();
    }    
    
     public void detectCollision()
    {
        Actor flynn = getOneObjectAtOffset(0, 0, Flynn.class);
        if (isTouching(Flynn.class)) 
        {
            SimulationWorld room1 = (SimulationWorld) getWorld();
            room1.removeObject(this);
            room1.addObject(new RedKey(), 308, 735);
        }
    }    
}
