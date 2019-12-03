import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class OrangeDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrangeDoor2 extends Door
{
    /**
     * Act - do whatever the OrangeDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if (isDoorTouchingFlynn()) 
        {
            SimulationWorld world = (SimulationWorld) getWorld();
            world.transitionToWorld(new Room3(Flynn.getHearts(), 2, true, world.getGoldKey(), world.getGreenKey(), world.getOrangeKey(), world.getPinkKey(), 
            world.getRedKey(), world.getSilverKey()));
            // USE STATEMENTS BELOW TO COPY CODE IN DOORS
            //(int heart, int positionNum, boolean isBlueKeyAcquired, boolean isGoldKeyAcquired, 
            //boolean isGreenKeyAcquired, boolean isOrangeKeyAcquired, boolean isPinkKeyAcquired,boolean isRedKeyAcquired, boolean isSilverKeyAcquired)
            //world.getBlaBLaKey()

        }
    }
}