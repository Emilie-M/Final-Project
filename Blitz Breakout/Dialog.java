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
    private String dialog2;
    private String dialog3;
    private String dialog4;
    
    public Dialog(String dialog, String dialog2, String dialog3, String dialog4)
    {
        this.dialog = dialog;
        this.dialog2 = dialog2;
        this.dialog3 = dialog3;
        this.dialog4 = dialog4;
        makeDialog();
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
    
    public void makeDialog()
    {
        int fontsize = 30;
        Color fontColor = Color.WHITE;
        Color bgColor = new Color(0, 0, 0, 200);
        
        GreenfootImage txtImg = new GreenfootImage(dialog, fontsize, fontColor, bgColor);
        GreenfootImage img = new GreenfootImage(830, 200);
        GreenfootImage txtImg2 = new GreenfootImage(dialog2, fontsize, fontColor, bgColor);

        GreenfootImage txtImg3 = new GreenfootImage(dialog3, fontsize, fontColor, bgColor);

        GreenfootImage txtImg4 = new GreenfootImage(dialog4, fontsize, fontColor, bgColor);

        bgColor = new Color(0, 0, 0, 200);
        
        img.setColor(bgColor);
        img.fill();
        
        img.drawImage(txtImg, 60, 50);
        img.drawImage(txtImg2, 60, 90);
        img.drawImage(txtImg3, 60, 130);
        img.drawImage(txtImg4, 60, 170);
        setImage(img);
    }

    public void stopDialog()
    {
        getSimulationWorld().setGamePaused(false);
        getSimulationWorld().removeObject(this);
    } 
}