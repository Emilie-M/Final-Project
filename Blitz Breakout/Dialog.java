import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialog extends SimulationActor
{
    private String dialog;
    private final int width = 200, height = 50;
    
    public Dialog(String dialog)
    {
        this.dialog = dialog;
        makeFrame();
        //setImage("DialogBox1.png");
    }

    public void act()
    {
        super.act();
        getSimulationWorld().setGamePaused(true);

        if (Greenfoot.isKeyDown("enter"))
        {
            stopDialog();
        }
    }
    
    public void makeFrame()
    {
        GreenfootImage frame = new GreenfootImage(width, height);
        GreenfootImage body = new GreenfootImage(width, height);
        
        body.setColor(new Color(255, 230, 153));
        body.fill();
        
        //Now write the text onto the frame
        body.setColor(Color.BLACK);
        body.drawString(dialog, 10, body.getHeight()/2);
        
        frame.drawImage(body, 0, 0);
        
        setImage(frame);
    }

    public void stopDialog()
    {
        getSimulationWorld().setGamePaused(false);
        getSimulationWorld().removeObject(this);
    } 
}