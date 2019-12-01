import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class RedDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedDoor2 extends Door
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
            SimulationWorld world = (SimulationWorld) getWorld();
            Greenfoot.setWorld(new Room5(Heart.getHearts(), 0, true, world.getGoldKey(), world.getGreenKey(), world.getOrangeKey(), world.getPinkKey(), 
                world.getRedKey(), world.getSilverKey()));
        }
    }
}
