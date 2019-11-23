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
            if (getPinkKey() == true)
            {
                //SimulationWorld world = (SimulationWorld) getWorld();
                //Greenfoot.setWorld(new Room2());
                return;
            }
        }
    }
    public boolean getPinkKey()
    {
        List <PinkKey> pinkKeyList = getWorld().getObjects(PinkKey.class);
        
        if (pinkKeyList.size() > 0)
        {
            PinkKey pinkKey = pinkKeyList.get(0);
            double y = (double) (pinkKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
}
