import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class GreenDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenDoor2 extends Door
{
    /**
     * Act - do whatever the GreenDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if (isDoorTouchingFlynn()) 
        {
                SimulationWorld world = (SimulationWorld) getWorld();
                world.transitionToWorld(new Room3(Heart.getHearts(), 1, true, world.getGoldKey(), true, world.getOrangeKey(), world.getPinkKey(), 
                world.getRedKey(), world.getSilverKey()));
                // USE STATEMENTS BELOW TO COPY CODE IN DOORS
                //(int heart, int positionNum, boolean isBlueKeyAcquired, boolean isGoldKeyAcquired, 
                //boolean isGreenKeyAcquired, boolean isOrangeKeyAcquired, boolean isPinkKeyAcquired,boolean isRedKeyAcquired, boolean isSilverKeyAcquired)
                //world.getPinkKey()

        }
    }
}
