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
    /**
     * Act - do whatever the BlueDoor2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();

        transitionToRoom1();
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
    public void transitionToRoom1()
    {
        if (isDoorTouchingFlynn()) 
        {
            if (getBlueKey())
            {
                SimulationWorld world = (SimulationWorld) getWorld();
                Greenfoot.setWorld(new Room1(false, Heart.getHearts(),true, 1));
            }
        }
    }    
}
