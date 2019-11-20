import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Flynn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flynn extends PlatformActor
{
    //protected static final SpriteSheet standRight = new SpriteSheet
    private GreenfootImage standRight = new GreenfootImage("DemoStandingRight3.png");
    //protected static final SpriteSheet runRight = new SpriteSheet
    //("spritesheet20.png", 1, 6);
    //protected static final SpriteSheet runLeft = new SpriteSheet
    //("SpriteJumpSequenceLeft.png", 1, 6);
    private GreenfootImage runRight1 = new GreenfootImage("Run2.png");
    private GreenfootImage runRight2 = new GreenfootImage("Run3.png");
    private GreenfootImage runRight4 = new GreenfootImage("Run5.png");
    private GreenfootImage runRight5 = new GreenfootImage("Run6.png");
    
    private GreenfootImage runLeft1 = new GreenfootImage("Run2Flipped.png");
    private GreenfootImage runLeft2 = new GreenfootImage("Run3Flipped.png");
    private GreenfootImage runLeft4 = new GreenfootImage("Run5Flipped.png");
    private GreenfootImage runLeft5 = new GreenfootImage("Run6Flipped.png");
    
    private GreenfootImage jumpRight1 = new GreenfootImage("Jump3.png");
    private GreenfootImage jumpRight2 = new GreenfootImage("Jump4.png");
    private GreenfootImage jumpRight3 = new GreenfootImage("Jump5.png");
    private GreenfootImage jumpRight4 = new GreenfootImage("Jump6.png");
    private GreenfootImage jumpRight5 = new GreenfootImage("Jump7.png");
    private GreenfootImage jumpRight6 = new GreenfootImage("Jump8.png");
    
    private GreenfootImage jumpLeft1 = new GreenfootImage("Jump3Flipped.png");
    private GreenfootImage jumpLeft2 = new GreenfootImage("Jump4Flipped.png");
    private GreenfootImage jumpLeft3 = new GreenfootImage("Jump5Flipped.png");
    private GreenfootImage jumpLeft4 = new GreenfootImage("Jump6Flipped.png");
    private GreenfootImage jumpLeft5 = new GreenfootImage("Jump7Flipped.png");
    private GreenfootImage jumpLeft6 = new GreenfootImage("Jump8Flipped.png");
    
    private int frame = 1;
    private int animationCounter = 0;
    //private GreenfootImage runRight4 = new GreenfootImage("");
    //protected static final double SPRITE_FRAMES_DURATION = 0.4;
    protected static final double FLYNN_VELOCITY = 1.6;
    //protected int currentSpriteSheet;
    //protected int currentColumn;
    //protected double currentFrameTime;
    //private GreenfootImage runRight3 = new GreenfootImage("Run4.png");
    public static int lives = 3;
    
    public Flynn()
    {
        super(null, new Vector2D(0,0), new Vector2D(0, GRAVITY));
        //currentSpriteSheet = 1;
        //currentColumn = 0;
        //currentFrameTime = 0.0;
        
        //GreenfootImage sprite = runRight.getSprite(0, 0);
        //setImage(sprite);
        setImage(standRight);
        
    }
    
    public void act() 
    {
        super.act();
        
        if (Greenfoot.isKeyDown("space") && Greenfoot.isKeyDown("a")) {
            jumpLeft();
        }
        if (Greenfoot.isKeyDown("d")) {
            moveRight();
        }
        if (Greenfoot.isKeyDown("a")) { 
            moveLeft();
        }
<<<<<<< HEAD
        if (Greenfoot.isKeyDown("space")) {
            jumpRight();
        }
        if (Greenfoot.isKeyDown("space") && Greenfoot.isKeyDown("left")) {
            jumpLeft();
        }
=======

        if (Greenfoot.isKeyDown("space")) {
            jumpRight();
        }
        
>>>>>>> master
        //else 
        //{
            //setImage(standRight);
        //}
        //moveOnPlatform();
        //updateFrame();
        animationCounter++;
        hitDetection();
    }  
    
    public void moveRight() 
    {
        setLocation(getX(),getY());
        if (animationCounter % 7 == 0) {
            animateRight();
        }
    }
    public void animateRight() 
    {
        if (frame == 1)
        {
            setImage(runRight1);
        }
        else if (frame == 2)
        {
            setImage(runRight2);
        }
        //else if (frame == 3)
        //{
            //setImage(runRight3);
        //}
        else if (frame == 3)
        {
            setImage(runRight4);
            //frame = 1;
            //return;
        }
        else if (frame == 4)
        {
            setImage(runRight5);
            frame = 1;
            return;
        }
        
        frame++;
    }
    
    public void moveLeft() 
    {
        setLocation(getX(),getY());
        if (animationCounter % 7 == 0) {
            animateLeft();
        }
    }
    public void animateLeft() 
    {
        if (frame == 1)
        {
            setImage(runLeft1);
        }
        else if (frame == 2)
        {
            setImage(runLeft1);
        }
        //else if (frame == 3)
        //{
            //setImage(runLeft3);
        //}
        else if (frame == 3)
        {
            setImage(runLeft4);
            //frame = 1;
            //return;
        }
        else if (frame == 4)
        {
            setImage(runRight5);
            frame = 1;
            return;
        }
        frame++;
    }
    
    public void jumpRight() 
    {
        setLocation(getX(),getY());
        if (animationCounter % 7 == 0) {
            animateJumpRight();
        }
    }
    public void animateJumpRight() 
    {
        setImage(jumpRight1);
        Greenfoot.delay(4);
        setImage(jumpRight2);
        Greenfoot.delay(4);
        setImage(jumpRight3);
        Greenfoot.delay(4);
        setImage(jumpRight4);
        Greenfoot.delay(4);
        setImage(jumpRight5);
        Greenfoot.delay(4);
        setImage(jumpRight6);
    }
    
    public void jumpLeft() 
    {
        setLocation(getX(),getY());
        if (animationCounter % 7 == 0) {
            animateJumpLeft();
        }
    }
    public void animateJumpLeft() 
    {
        setImage(jumpLeft1);
        Greenfoot.delay(4);
        setImage(jumpLeft2);
        Greenfoot.delay(4);
        setImage(jumpLeft3);
        Greenfoot.delay(4);
        setImage(jumpLeft4);
        Greenfoot.delay(4);
        setImage(jumpLeft5);
        Greenfoot.delay(4);
        setImage(jumpLeft6);
    }
    //public void moveOnPlatform()
    //{
        //if (onPlatform == true)
        //{
            //if (velocity.getX() == 0)
            //{
                //velocity.setX(SKELETON_VELOCITY);
                //currentRow = 3;
            //}
        //}
        //else
        //{
            //velocity.setX(-velocity.getX());
            
            //if (velocity.getX() > 0.0)
            //{
                //currentRow = 3;
            //}
            //else
            //{
                //currentRow = 1;
            //}           
        //}
    //}
    
    public void moveFromKeyboard()
    {
        //if (Greenfoot.isKeyDown("a"))
        //{
            // Moving left in the second row in the spritesheet
            //currentRow = 1;
        //}
        //if (Greenfoot.isKeyDown("s"))
        //{
            // Moving down in the second row in the spritesheet
            //currentRow = 2;
        //}
        //if (Greenfoot.isKeyDown("d"))
        //{
            // Moving left in the second row in the spritesheet
            //currentRow = 3;
        //}
        //if (Greenfoot.isKeyDown("w"))
        //{
            // Moving up in the second row in the spritesheet
            //currentRow = 0;
        //}
    }
    
    public void hitDetection()
    {
        //SimulationWorld world = (SimulationWorld) getWorld();
        Actor spider = getOneIntersectingObject(Spider.class);
        
        if(spider != null)  
        {  
            lives--;
        } 
    }
    
    public static int getLives()
    {
        return lives;
    }
    
    //public void updateFrame()
    //{
        //currentFrameTime += getSimulationWorld().getTimeStepDuration();
        //if (currentFrameTime > SPRITE_FRAMES_DURATION)
        //{
            //currentColumn = (currentColumn + 1) % runRight.getColumns();
            //currentFrameTime -= SPRITE_FRAMES_DURATION;
        //}
        
        //setImage(runRight.getSprite(0, currentColumn));
    //}
}
