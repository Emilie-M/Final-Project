import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class PinkDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinkDoor extends Door
{
    /**
     * Act - do whatever the PinkDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if (isDoorTouchingFlynn()) 
        {
            SimulationWorld w1 = (SimulationWorld) getWorld();
            if (w1.getPinkKey() == true)
            {
                SimulationWorld world = (SimulationWorld) getWorld();
                Greenfoot.setWorld(new Room3(Heart.getHearts(), w1.getPinkKey(), w1.getOrangeKey(), w1.getGreenKey(), 0));
                return;
                //int heart, boolean isPinkKeyAcquired, boolean isOrangeKeyAcquired,boolean isGreenKeyAcquired,int positionNum
            }
        }
    }
   
}
