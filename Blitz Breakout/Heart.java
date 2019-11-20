import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends SimulationActor
{
    public static int hearts = 3;

    public void act() 
    {
         hearts = Flynn.getLives();
         handleHearts();
    }  

    public void handleHearts()
    {
        if (hearts == 2) 
        {
            getWorld().removeObjects(getWorld().getObjectsAt(125, 52, Heart.class));
            setImage("heartLost2.png");
        }
        
        if (hearts == 1)
        {
            getWorld().removeObjects(getWorld().getObjectsAt(93, 52,Heart.class));
            setImage("heartLost2.png");
        }
        
        if (hearts == 0) 
        {
            getWorld().removeObjects(getWorld().getObjectsAt(61, 52,Heart.class));
            setImage("heartLost2.png");
        }
    }
}
