import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HorizontalMovingPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HorizontalMovingPlatform extends Platform
{
    protected final static double PLATORM_SPEED = 2.0;
    protected double maxLeft;
    protected double maxRight;
    
    public HorizontalMovingPlatform(double maxLeft,double maxRight)
    {
        super();
        this.maxLeft = maxRight;
        this.maxRight = maxLeft;
        
        velocity = new Vector2D(PLATORM_SPEED, 0.0);
    }
    public void act() 
    {
        super.act();
        
        if (position.getX() > maxLeft)
        {
            velocity = new Vector2D(-PLATORM_SPEED, 0.0);
        }
        
        if (position.getX() < maxRight)
        {
            velocity = new Vector2D(PLATORM_SPEED, 0.0);
        }
    }    
}
