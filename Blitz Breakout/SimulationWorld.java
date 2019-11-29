import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Graphics2D; 
import java.awt.image.*; 
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class SimulationWorld extends World
{
    
    // The following are in World Coordinates
    protected final double DEFAULT_CAMERA_WIDTH;
    protected Point2D cameraCenter;
    protected double cameraWidth;
    
    // For conversion between World and Window Coordinates
    private Matrix2D toWindowMatrix;
    private Matrix2D toWorldMatrix;

    // To dynamically calculate the time step duration
    private long lastFrameTimeMS;
    private double timeStepDuration;

    // Looping music
    protected GreenfootSound music;
    protected boolean isGamePaused = false;
    
    public SimulationWorld(String musicFile,int windowWidth, int windowHeight, Point2D cameraCenter, double cameraWidth) 
    {    
        super(windowWidth, windowHeight, 1, false); 
        
        // Setup music
        if (musicFile != null && musicFile.isEmpty() == false)
        {
            music = new GreenfootSound(musicFile);
        }
        
        // Save the initial width to compute the zooming ratio
        DEFAULT_CAMERA_WIDTH = cameraWidth;
        
        // Save Camera Parameters
        this.cameraCenter = cameraCenter;
        this.cameraWidth = cameraWidth;
        
        // Conversion matrices
        this.toWindowMatrix = Matrix2D.worldToWindow(cameraCenter, cameraWidth, new Vector2D(getWidth(), getHeight()));
        this.toWorldMatrix = Matrix2D.windowToWorld(cameraCenter, cameraWidth, new Vector2D(getWidth(), getHeight()));
        
    }
    
    public void act()
    {
        // Update time step duration
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();

        // Update Viewport Matrix
        toWindowMatrix = Matrix2D.worldToWindow(cameraCenter, cameraWidth, new Vector2D(getWidth(), getHeight()));
        toWorldMatrix = Matrix2D.windowToWorld(cameraCenter, cameraWidth, new Vector2D(getWidth(), getHeight()));
    }
    public boolean getBlueKey()
    {
        List <BlueKey> blueKeyList = getObjects(BlueKey.class);
        
        if (blueKeyList.size() > 0)
        {
            BlueKey blueKey = blueKeyList.get(0);
            double y = (double) (blueKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
    public boolean getGoldKey()
    {
        List <GoldKey> goldKeyList = getObjects(GoldKey.class);
        
        if (goldKeyList.size() > 0)
        {
            GoldKey goldKey = goldKeyList.get(0);
            double y = (double) (goldKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
    public boolean getGreenKey()
    {
        List <GreenKey> greenKeyList = getObjects(GreenKey.class);
        
        if (greenKeyList.size() > 0)
        {
            GreenKey greenKey = greenKeyList.get(0);
            double y = (double) (greenKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
    public boolean getOrangeKey()
    {
        List <OrangeKey> orangeKeyList = getObjects(OrangeKey.class);
        
        if (orangeKeyList.size() > 0)
        {
            OrangeKey orangeKey = orangeKeyList.get(0);
            double y = (double) (orangeKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
    public boolean getPinkKey()
    {
        List <PinkKey> pinkKeyList = getObjects(PinkKey.class);
        
        if (pinkKeyList.size() > 0)
        {
            PinkKey pinkKey = pinkKeyList.get(0);
            double y = (double) (pinkKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
    public boolean getRedKey()
    {
        List <RedKey> redKeyList = getObjects(RedKey.class);
        
        if (redKeyList.size() > 0)
        {
            RedKey redKey = redKeyList.get(0);
            double y = (double) (redKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
    public boolean getSilverKey()
    {
        List <SilverKey> silverKeyList = getObjects(SilverKey.class);
        
        if (silverKeyList.size() > 0)
        {
            SilverKey silverKey = silverKeyList.get(0);
            double y = (double) (silverKey.getY());
            
            if (y > 705)
            {
                return true;
            }   
        }

        return false;
    }
    public void started()
    {
        if (music != null)
        {
            music.playLoop();
        }
        
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void stopped()
    {
        // Pause music when pausing the game
        if (music != null)
        {
            music.pause();
        }        
    }
    
    public GreenfootSound getMusic()
    {
        return music;
    }
    
    public void setMusic(GreenfootSound newMusic)
    {
        // If the music is playing, stop the current music
        if (music != null && music.isPlaying() == true)
        {
            music.stop();
            newMusic.playLoop();
        }
        
        music = newMusic;
    } 
    
    public void transitionToWorld(SimulationWorld newWorld)
    {
        stopped();
        Greenfoot.setWorld(newWorld);
        
        // Continue playing current music is new world has none
        if (newWorld.getMusic() == null)
        {
            newWorld.setMusic(music);
        }
        // Im about to comment the code below (I = AKASH)
        //newWorld.started();
    }

    
    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }

    public double worldToWindow(double worldValue)
    {
        return worldValue * getWidth() / cameraWidth;
    }

    public Point2D worldToWindow(Point2D worldCoord)
    {
        return toWindowMatrix.transform(worldCoord);
    }

    public Vector2D worldToWindow(Vector2D worldCoord)
    {
        return toWindowMatrix.transform(worldCoord);
    }
    
    public double windowToWorld(double windowValue)
    {
        return windowValue * cameraWidth / getWidth();
    }
    
    public Point2D windowToWorld(Point2D windowCoord)
    {        
        return toWorldMatrix.transform(windowCoord);
    }

    public Vector2D windowToWorld(Vector2D windowCoord)
    {        
        return toWorldMatrix.transform(windowCoord);
    }
    
    public void scaleActors()
    {
        List<SimulationActor> actors = getObjects(SimulationActor.class);
        
        for (int i=0; i<actors.size(); i++)
        {
            SimulationActor actor = actors.get(i);
            actor.scaleImage(getZoomRatio());
        }
    }
    
    public double getZoomRatio()
    {
        return DEFAULT_CAMERA_WIDTH / cameraWidth;
    }
    
    public void addObject(Actor a, int x, int y)
    {
        super.addObject(a,x,y);
        
        // Set World Position from Window Position for Simulation Actors
        if (a instanceof SimulationActor)
        {
            SimulationActor sa = (SimulationActor) a;
            sa.setPosition(windowToWorld(new Point2D(x, y)));
        }            
    }
    
    public void setGamePaused(boolean isPaused)
    {
        isGamePaused = isPaused;
    }

    public boolean getGamePaused()
    {
        return isGamePaused;
    }
}
