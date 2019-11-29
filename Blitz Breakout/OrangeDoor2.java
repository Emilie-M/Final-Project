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
            if (getOrangeKey() == true)
            {
                SimulationWorld world = (SimulationWorld) getWorld();
                Greenfoot.setWorld(new Room3(Heart.getHearts(), true, getOrangeKey(),getGreenKey(), 1));
                return;
            }
        }
    }
    public boolean getOrangeKey()
    {
        List <OrangeKey> orangeKeyList = getWorld().getObjects(OrangeKey.class);
        
        if (orangeKeyList.size() > 0)
        {
            OrangeKey orangeKey = orangeKeyList.get(0);
            double y = (double) (orangeKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
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