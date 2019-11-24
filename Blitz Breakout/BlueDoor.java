import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class BlueDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueDoor extends Door
{
    /**
     * Act - do whatever the BlueDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if (isDoorTouchingFlynn()) 
        {
            if (getBlueKey() == true)
            {
                SimulationWorld world = (SimulationWorld) getWorld();
                Greenfoot.setWorld(new Room2(getBlueKey()));
            }
        }
    }
    
    public boolean getBlueKey()
    {
        List <BlueKey> blueKeyList = getWorld().getObjects(BlueKey.class);
        
        if (blueKeyList.size() > 0)
        {
            BlueKey blueKey = blueKeyList.get(0);
            double y = (double) (blueKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
}
