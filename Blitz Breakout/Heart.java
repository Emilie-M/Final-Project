import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    public static int hearts = 3;

    public void act() 
    {
        //try
        {
            
            
             hearts = Flynn.getLives();
             handleHearts();
        }
        //catch(Exception e)
        {
        }
        
    }  

    public void handleHearts()
    {
        if (hearts == 2) 
        {
            getWorld().removeObjects(getWorld().getObjectsAt(125, 52, Heart.class));
        }
        
        if (hearts == 1)
        {
            getWorld().removeObjects(getWorld().getObjectsAt(93, 52,Heart.class));
        }
        
        if (Flynn.lives <= 0) 
        {
            getWorld().removeObjects(getWorld().getObjectsAt(61, 52,Heart.class)); 
            SimulationWorld world = (SimulationWorld) getWorld();
            world.transitionToWorld(new GameOverScreen());
        }
    }
    public static int getHearts()
    {
        return hearts;
    }
}
