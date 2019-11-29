import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends SimulationActor
{
    protected final static double SPIDER_SPEED = 2.0;
    protected double minHeight;
    protected double maxHeight;
    public Spider(double minHeight,double maxHeight)
    {
        super();
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        
        velocity = new Vector2D(0.0, SPIDER_SPEED);
    }

    public void act() 
    {
        super.act();
        
        if (position.getY() > maxHeight)
        {
            velocity = new Vector2D(0.0, -SPIDER_SPEED);
        }
        
        if (position.getY() < minHeight)
        {
            velocity = new Vector2D(0.0, SPIDER_SPEED);
        }
    }

    //public int getWidth()
    //{
        //if (getImage() != null)
        //{
        //    return getImage().getWidth();
        //}
        //else
        //{
         //   return 0;
        //}            
    //}

    //public int getHeight()
    //{
        //if (getImage() != null)
        //{
        //    return getImage().getHeight();
       // }
        //else
        //{
        //    return 0;
        //}            
    //}
}