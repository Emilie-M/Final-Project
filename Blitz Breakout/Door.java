import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends SimulationActor
{
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectCollision();
    }
    public void detectCollision()
    {
        Actor flynn = getOneObjectAtOffset(0, 0, Flynn.class);
        if (isTouching(Flynn.class)) {
            removeTouching(Flynn.class);
            SimulationWorld room2 = new Room2();
            Greenfoot.setWorld(room2);
        }
    }
}
