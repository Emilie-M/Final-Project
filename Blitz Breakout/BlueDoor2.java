import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class BlueDoor2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueDoor2 extends Door
{
    public void act() 
    {
        super.act();
        transitionToRoom1();
    }

    public void transitionToRoom1()
    {
        if (isDoorTouchingFlynn()) 
        {
            SimulationWorld world = (SimulationWorld) getWorld();
            world.transitionToWorld(new Room1(false, Flynn.getHearts(), 1, true, world.getGoldKey(), 
            world.getGreenKey(), world.getOrangeKey(), world.getPinkKey(), world.getRedKey(), world.getSilverKey()));
            // USE STATEMENTS BELOW TO COPY CODE IN DOORS
            //(int heart, int positionNum, boolean isBlueKeyAcquired, boolean isGoldKeyAcquired, 
            //boolean isGreenKeyAcquired, boolean isOrangeKeyAcquired, boolean isPinkKeyAcquired,boolean isRedKeyAcquired, boolean isSilverKeyAcquired)
            //world.getPinkKey()

        }
    }    
}