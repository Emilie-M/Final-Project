import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PinkKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinkKey extends Key
{
    public static boolean isPinkKeyAcquired = false;
    public void act() 
    {
        detectCollision();
        isGoldKeyAcquired();
    }    
    
     public void detectCollision()
    {
        Actor flynn = getOneObjectAtOffset(0, 0, Flynn.class);
        if (isTouching(Flynn.class)) {
            SimulationWorld room1 = (SimulationWorld) getWorld();
            isPinkKeyAcquired = true;
            room1.removeObject(this);
            room1.addObject(new PinkKey(), 258, 735);
        }
    }    
    public static boolean isGoldKeyAcquired()
    {
        return isPinkKeyAcquired;
    }
}
