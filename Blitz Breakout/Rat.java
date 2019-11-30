import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rat extends SimulationActor
{
    protected final static double RAT_SPEED = 2.0;
    protected double maxLeft;
    protected double maxRight;
    
    public Rat(double maxLeft,double maxRight)
    {
        super();
        this.maxLeft = maxRight;
        this.maxRight = maxLeft;
        
        velocity = new Vector2D(RAT_SPEED, 0.0);
    }
    public void act() 
    {
        super.act();
        
        if (position.getX() > maxLeft)
        {
            velocity = new Vector2D(-RAT_SPEED, 0.0);
        }
        
        if (position.getX() < maxRight)
        {
            velocity = new Vector2D(RAT_SPEED, 0.0);
        }
    }   
}
