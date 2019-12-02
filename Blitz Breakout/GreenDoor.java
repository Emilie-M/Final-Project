import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class GreenDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenDoor extends Door
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
            if (getGreenKey() == true)
            {
                SimulationWorld world = (SimulationWorld) getWorld();
                world.transitionToWorld(new Room4(Heart.getHearts(), 0, true, world.getGoldKey(), world.getGreenKey(), world.getOrangeKey(), world.getPinkKey(), 
                world.getRedKey(), world.getSilverKey()));
                // USE STATEMENTS BELOW TO COPY CODE IN DOORS
                //(int heart, int positionNum, boolean isBlueKeyAcquired, boolean isGoldKeyAcquired, 
                //boolean isGreenKeyAcquired, boolean isOrangeKeyAcquired, boolean isPinkKeyAcquired,boolean isRedKeyAcquired, boolean isSilverKeyAcquired)
                //world.getBlaBLaKey()
            }
        }
    }
    public boolean getGreenKey()
    {
        List <GreenKey> greenKeyList = getWorld().getObjects(GreenKey.class);
        
        if (greenKeyList.size() > 0)
        {
            GreenKey greenKey = greenKeyList.get(0);
            double y = (double) (greenKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
}
