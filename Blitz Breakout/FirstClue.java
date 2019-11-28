import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class firstClue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstClue extends SimulationActor
{
    /**
     * Act - do whatever the firstClue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor flynn = getOneIntersectingObject(Flynn.class);
        
        if (flynn != null)
        {
            GreenfootImage image = new GreenfootImage("NewspaperUSEthisONE.png");
            double scalingFactor = 1.3;
            image.scale((int)(image.getWidth()/scalingFactor), (int)(image.getHeight()/scalingFactor));
            setImage(image);
            
            if (Greenfoot.isKeyDown("enter"))
            {
                getWorld().removeObject(this);
            }
        }
    }    
}
