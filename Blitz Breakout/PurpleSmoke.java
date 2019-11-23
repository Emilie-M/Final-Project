import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PurpleSmoke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PurpleSmoke extends Actor
{
    GifImage purpleSmoke = new GifImage("PurpleSmoke.gif");

    public void act()
    {
        setImage(purpleSmoke.getCurrentImage());
    }
}
