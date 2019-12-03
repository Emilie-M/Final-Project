import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class GoldDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldDoor2 extends Door
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
            SimulationWorld world = (SimulationWorld) getWorld();
            world.transitionToWorld(new Room6(Flynn.getHearts(), 1, true, world.getGoldKey(), world.getGreenKey(), world.getOrangeKey(), world.getPinkKey(), 
            world.getRedKey(), world.getSilverKey()));
        }
    }
}