import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class SilverDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SilverDoor2 extends Door
{
    /**
     * Act - do whatever the SilverDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if (isDoorTouchingFlynn()) 
        {

            //SimulationWorld world = (SimulationWorld) getWorld();
            //Greenfoot.setWorld(new Room2());


        }
    }
    public boolean getSilverKey()
    {
        List <SilverKey> silverKeyList = getWorld().getObjects(SilverKey.class);
        
        if (silverKeyList.size() > 0)
        {
            SilverKey silverKey = silverKeyList.get(0);
            double y = (double) (silverKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
}

