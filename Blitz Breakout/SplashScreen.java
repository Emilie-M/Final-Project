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

    protected double timeUntilTransition = 3.5;
    public void act()
    {
        super.act();
        super.started();
        started();
        timeUntilTransition -= getTimeStepDuration();
        start(timeUntilTransition);
        //if (timeUntilTransition < 0)
        //{
            //super.stopped();
            //stopped();   
            //transitionToWorld(new StartMenu());
        //}
    }
    public void start(double timeUntilTransition)
    {
        if (timeUntilTransition < 0)
        {
            super.stopped();
            stopped();   
            transitionToWorld(new StartMenu());
        }
        else
        {
            return;
        }
    }
    private void prepare()
    {
        PurpleSmoke purpleSmoke = new PurpleSmoke();
        addObject(purpleSmoke,451,236);
    }
}