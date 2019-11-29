import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatformActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlatformActor extends SimulationActor
{
    protected boolean onPlatform;    
    
    public PlatformActor()
    {
        super();
        onPlatform = false;
    }
    
    public PlatformActor(Point2D position, Vector2D velocity, Vector2D acceleration)
    {
        super(position, velocity, acceleration);
        onPlatform = false;
    }
    
    public void act() 
    {
        super.act();
        landOnPlatform();
    } 
    
    public int getWidth()
    {
        if (getImage() != null)
            return getImage().getWidth();
        else
            return 0;
    }
    
    public int getHeight()
    {
        if (getImage() != null)
            return getImage().getHeight();
        else
            return 0;
    }
    
    public void landOnPlatform()
    {

        //Platform p1 = (Platform) getOneObjectAtOffset(-getRadius(), getRadius() + 1, Platform.class);
        //Platform p2 = (Platform) ge;AtOffset( getRadius(), getRadius() + 1, Platform.class);
        //Platform p = (p1 == null) ? p2 : p1;

        Platform p = (Platform) getOneObjectAtOffset(0, getRadius() + 1, Platform.class);
        if (p != null  && velocity.getY() < 0.0)
        {
            // Update position to lie on the platform
            setLocation(getX(), p.getY() - p.getHeight() / 2 - getHeight() / 2);
            
            // Update the velocity to stop falling
            velocity.setY(Math.max(velocity.getY(), 0.0));

            onPlatform = true;
        }
        else
        {
            onPlatform = false;
        }        
        
        Platform above = (Platform) getOneObjectAtOffset(0, -getHeight() / 2 - 1, InvisiblePlatform.class);    
        Platform right = (Platform) getOneObjectAtOffset( getWidth() / 2 + 1, 0, InvisiblePlatform.class);    
        Platform left  = (Platform) getOneObjectAtOffset(-getWidth() / 2 - 1, 0, InvisiblePlatform.class);    
        Point2D newPosition = null;
   
        if (above != null  && velocity.getY() > above.getVelocity().getY())
        {
            newPosition = new Point2D(getX(), above.getY() + above.getHeight() / 2 +  getHeight() / 2);
            velocity.setY(above.getVelocity().getY());
        }
        
        if (right != null  && velocity.getX() > right.getVelocity().getX())
        {
            newPosition = new Point2D(right.getX() - right.getWidth() / 2 -  getWidth() / 2, getY());
            velocity.setX(right.getVelocity().getX());
        }
    
        if (left != null  && velocity.getX() <= left.getVelocity().getX())
        {
            newPosition = new Point2D(left.getX() + left.getWidth() / 2 + getWidth() / 2, getY());
            velocity.setX(left.getVelocity().getX());
        }
        
        if (newPosition != null)
        {
            position = windowToWorld(newPosition);
        }

    } 
}   