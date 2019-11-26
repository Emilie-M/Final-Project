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
            image.scale(image.getWidth()/2, image.getHeight()/2);
            setImage(image);
            
            if (Greenfoot.isKeyDown("f"))
            {
                getWorld().removeObject(this);
            }
        }
    }    
}
