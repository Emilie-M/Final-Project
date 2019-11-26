import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueKey extends Key
{
    //public static boolean isBlueKeyAcquired = false;
    public void act() 
    {
        detectCollision();
    }    

     public void detectCollision()
    {
        Actor flynn = getOneObjectAtOffset(0, 0, Flynn.class);
        if (isTouching(Flynn.class)) {
            SimulationWorld room1 = (SimulationWorld) getWorld();
            //isBlueKeyAcquired = true;
            room1.removeObject(this);
            room1.addObject(new BlueKey(), 58, 735);
        }
    }
    //public static boolean isBlueKeyAcquired()
    //{
      //  return isBlueKeyAcquired;
    //}
}