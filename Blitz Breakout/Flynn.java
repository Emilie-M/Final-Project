import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flynn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flynn extends PlatformActor
{
    //protected static final SpriteSheet standRight = new SpriteSheet
    //("JumpInitial.png", 1, 6);
    //protected static final SpriteSheet runRight = new SpriteSheet
    //("spritesheet20.png", 1, 6);
    //protected static final SpriteSheet runLeft = new SpriteSheet
    //("SpriteJumpSequenceLeft.png", 1, 6);
    private GreenfootImage runRight1 = new GreenfootImage("Run2.png");
    private GreenfootImage runRight2 = new GreenfootImage("Run3.png");
    private GreenfootImage runRight3 = new GreenfootImage("Run4.png");
    private GreenfootImage runRight4 = new GreenfootImage("Run5.png");
    private GreenfootImage runRight5 = new GreenfootImage("Run6.png");
    private int frame = 1;
    private int animationCounter = 0;
    //private GreenfootImage runRight4 = new GreenfootImage("");
    //protected static final double SPRITE_FRAMES_DURATION = 0.4;
    protected static final double FLYNN_VELOCITY = 1.6;
    //protected int currentSpriteSheet;
    //protected int currentColumn;
    //protected double currentFrameTime;
    
    public Flynn()
    {
        super(null, new Vector2D(0,0), new Vector2D(0, GRAVITY));
        //currentSpriteSheet = 1;
        //currentColumn = 0;
        //currentFrameTime = 0.0;
        
        //GreenfootImage sprite = runRight.getSprite(0, 0);
        //setImage(sprite);
    }
    
    public void act() 
    {
        super.act();
        moveRight();
        //moveOnPlatform();
        //updateFrame();
        animationCounter++;
    }    
    public void moveRight() 
    {
        setLocation(getX() + 70,getY());
        if (animationCounter % 4 == 0) {
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
        else if (frame == 3)
        {
            setImage(runRight3);
        }
        else if (frame == 4)
        {
            setImage(runRight4);
        }
        else if (frame == 5)
        {
            setImage(runRight5);
            frame = 1;
            return;
        }
        
        frame++;
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
