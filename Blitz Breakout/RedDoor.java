import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class RedDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedDoor extends Door
{
    /**
     * Act - do whatever the RedDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if (isDoorTouchingFlynn()) 
        {
            if (getRedKey() == true)
            {
                SimulationWorld world = (SimulationWorld) getWorld();
                world.transitionToWorld(new Room6(Flynn.getHearts(), 0, true, world.getGoldKey(), world.getGreenKey(), world.getOrangeKey(), world.getPinkKey(), 
                world.getRedKey(), world.getSilverKey()));
                return;
            }
        }
    }
    public boolean getRedKey()
    {
        List <RedKey> redKeyList = getWorld().getObjects(RedKey.class);
        
        if (redKeyList.size() > 0)
        {
            RedKey redKey = redKeyList.get(0);
            double y = (double) (redKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
}
