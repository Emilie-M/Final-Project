import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SilverKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SilverKey extends Key
{
    public void act() 
    {
        detectCollision();
    }    
    
     public void detectCollision()
    {
        Actor flynn = getOneObjectAtOffset(0, 0, Flynn.class);
        if (isTouching(Flynn.class)) {
            SimulationWorld room1 = (SimulationWorld) getWorld();
            
            room1.removeObject(this);
            room1.addObject(new SilverKey(), 358, 735);
        }
    }     
}
