import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingPlatform extends Platform
{
    protected final static double PLATFORM_SPEED = 2.0;
    protected double minHeight;
    protected double maxHeight;
    
    public MovingPlatform(double minHeight,double maxHeight)
    {
        super();
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        
        velocity = new Vector2D(0.0, PLATFORM_SPEED);
    }
    
    public void act() 
    {
        super.act();
        
        if (position.getY() > maxHeight)
        {
            velocity = new Vector2D(0.0, -PLATFORM_SPEED);
        }
        
        if (position.getY() < minHeight)
        {
            velocity = new Vector2D(0.0, PLATFORM_SPEED);
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

    public int getHeight()
    {
        if (getImage() != null)
        {
            return getImage().getHeight();
        }
        else
        {
            return 0;
        }            
    }   
}
