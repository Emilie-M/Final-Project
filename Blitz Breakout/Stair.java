import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stair extends Platform
{
    /**
     * Act - do whatever the Stair wants to do. This method is called whenever
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
            return getImage().getHeight() - 150;
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
            return getImage().getWidth();
        }
        else
        {
            return 0;
        }            
    }
}
