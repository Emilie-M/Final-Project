import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends SimulationWorld
{
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {
        super("SplashScreen.wav", 900, 768, new Point2D(8.0, 6.0), 16.0);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PurpleSmoke purpleSmoke = new PurpleSmoke();
        addObject(purpleSmoke,451,236);
    }
}
