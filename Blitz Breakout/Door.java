import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends SimulationActor
{
    public boolean isDoorTouchingFlynn() 
    {
        Actor flynn = getOneObjectAtOffset(0, 0, Flynn.class);
        return (isTouching(Flynn.class));
    }
}

