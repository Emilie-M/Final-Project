import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stairs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stairs extends Platform
{
    /**
     * Act - do whatever the Stairs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
    } 
    
    public int getHeight()
    {
        if (getImage() != null)
        {
            return getImage().getHeight() - 500;
        }
        else
        {
            return 0;
        }      
    }
    public int getWidth()
    {
        if (getImage() != null)
        {
            return getImage().getWidth() - 500;
        }
        else
        {
            return 0;
        }            
    }
}
