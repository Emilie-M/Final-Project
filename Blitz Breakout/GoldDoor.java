import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class GoldDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldDoor extends Door
{
    /**
     * Act - do whatever the GoldDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if (isDoorTouchingFlynn()) 
        {
            if (getGoldKey() == true)
            {
                SimulationWorld world = (SimulationWorld) getWorld();
                Greenfoot.setWorld(new Room7(Heart.getHearts(), 0, true, world.getGoldKey(), world.getGreenKey(), world.getOrangeKey(), world.getPinkKey(), 
                world.getRedKey(), world.getSilverKey()));
            }
        }
    }
    public boolean getGoldKey()
    {
        List <GoldKey> goldKeyList = getWorld().getObjects(GoldKey.class);
        
        if (goldKeyList.size() > 0)
        {
            GoldKey goldKey = goldKeyList.get(0);
            double y = (double) (goldKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
}
