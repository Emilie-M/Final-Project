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
        
        Actor blueKey = getOneObjectAtOffset(0, 0, BlueKey.class);
        Actor flynn = getOneObjectAtOffset(0, 0, Flynn.class);
        if (isTouching(Flynn.class)) 
        {
            if (getBlueKey())
            {
                SimulationWorld world = (SimulationWorld) getWorld();
                Greenfoot.setWorld(new Room2());
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
            
            if (y == 735)
            {
                return true;
            }   
        }

        return false;
    }
}
