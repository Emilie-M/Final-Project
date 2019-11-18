import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flynn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flynn extends SimulationActor
{
    //protected static final SpriteSheet standRight = new SpriteSheet
    //("JumpInitial.png", 1, 6);
    protected static final SpriteSheet runRight = new SpriteSheet
    ("SpriteRunSequenceRight.png", 1, 6);
    protected static final SpriteSheet runLeft = new SpriteSheet
    ("SpriteJumpSequenceLeft.png", 1, 6);
    protected static final double SPRITE_FRAMES_DURATION = 0.1;
    protected static final double FLYNN_VELOCITY = 1.6;
    protected int currentSpriteSheet;
    protected int currentColumn;
    protected double currentFrameTime;
    
    public Flynn()
    {
        super(null, new Vector2D(0,0), new Vector2D(0, GRAVITY));
        currentSpriteSheet = 1;
        currentColumn = 0;
        currentFrameTime = 0.0;
        
        GreenfootImage sprite = runRight.getSprite(0, 0);
        setImage(sprite);
    }
    
    public void act() 
    {
        super.act();
        
        //moveOnPlatform();
        updateFrame();
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
    
    public void updateFrame()
    {
        currentFrameTime += getSimulationWorld().getTimeStepDuration();
        if (currentFrameTime > SPRITE_FRAMES_DURATION)
        {
            currentColumn = (currentColumn + 1) % runRight.getColumns();
            currentFrameTime -= SPRITE_FRAMES_DURATION;
        }
        
        setImage(runRight.getSprite(0, currentColumn));
    }
}
