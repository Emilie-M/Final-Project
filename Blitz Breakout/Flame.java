import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flame extends Actor
{
    GifImage flame = new GifImage("flame2.gif");

    public void act()
    {
        setImage(flame.getCurrentImage());
    }   
}
