import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvisiblePlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvisiblePlatform extends Platform
{
    /**
     * Act - do whatever the InvisiblePlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if (Greenfoot.isKeyDown("F10"))
        {
            getImage().setTransparency(255);
        }
        else
        {
            getImage().setTransparency(0);
        }
    }    
}