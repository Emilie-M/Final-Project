import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends SimulationActor
{
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleLives();
    }  

    public static int lives = 3;
    public void handleLives()
    {
        if (lives == 2) 
        {
            getWorld().removeObjects(getWorld().getObjectsAt(125, 52, Heart.class));
        }
        
        if (lives == 1)
        {
            getWorld().removeObjects(getWorld().getObjectsAt(93, 52,Heart.class));
        }
        
        if (lives == 0) 
        {
            getWorld().removeObjects(getWorld().getObjectsAt(61, 52,Heart.class));
        }
    }
}
