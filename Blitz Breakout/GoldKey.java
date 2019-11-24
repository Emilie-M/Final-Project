import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldKey extends Key
{
    public static boolean isGoldKeyAcquired = false;
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
            isGoldKeyAcquired = true;
            room1.removeObject(this);
            room1.addObject(new GoldKey(), 108, 735);
        }
    }
    public static boolean isGoldKeyAcquired()
    {
        return isGoldKeyAcquired;
    }
}
