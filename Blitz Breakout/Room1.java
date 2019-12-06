
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room1 extends SimulationWorld
{
    // Copy all 7 below for new Room #1 (TOTAL = )
    protected boolean isBlueKeyAcquired2;
    protected boolean isGoldKeyAcquired2;
    protected boolean isGreenKeyAcquired2;
    protected boolean isOrangeKeyAcquired2;
    protected boolean isPinkKeyAcquired2;
    protected boolean isRedKeyAcquired2;
    protected boolean isSilverKeyAcquired2;
    
    protected int hearts;
    protected int positionNumber;
    protected boolean dialogPop2;
    protected boolean isItPoping = true;
    protected double popUp;
    /**
     * Constructor for objects of class Room1.
     * 
     */
    public Room1(boolean dialogPop, int heart, int positionNum, boolean isBlueKeyAcquired, boolean isGoldKeyAcquired, 
    boolean isGreenKeyAcquired, boolean isOrangeKeyAcquired, boolean isPinkKeyAcquired,boolean isRedKeyAcquired, boolean isSilverKeyAcquired)
    {
        super("ost.wav", 900, 768, new Point2D(8.0, 6.0), 16.0);
        prepare();
        dialogPop2 = dialogPop;
        hearts = heart;
        
        // Copy all 7 below for new Room #2
        isBlueKeyAcquired2 = isBlueKeyAcquired;
        isGoldKeyAcquired2 = isGoldKeyAcquired;
        isGreenKeyAcquired2 = isGreenKeyAcquired;
        isOrangeKeyAcquired2 = isOrangeKeyAcquired;
        isPinkKeyAcquired2 = isPinkKeyAcquired;
        isRedKeyAcquired2 = isRedKeyAcquired;
        isSilverKeyAcquired2 = isSilverKeyAcquired;
        
        positionNumber = positionNum;
    }
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    
    // Copy all 7 below for new Room #3
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    
    public void act()
    {
        super.act();
        popUp += getTimeStepDuration();
        if (popUp >= 2 && l < 1 && isItPoping && dialogPop2)
        {
            addObject(new Dialog("Where am I? All I remember is the storm and my car breaking down..", "", "", ""), 449, 666);
            l++;
            isItPoping = false;
        }
        
        if (popUp >= 5 && m < 1 && !(isItPoping) && dialogPop2)
        {
            Greenfoot.delay(260);
            addObject(new Dialog("I did enter this manor though, maybe I'm under it?", "", "\"Press enter to close.\"", ""), 449, 666);
            m++;
        }
        
        
        // Do the true statement Below new Room #2
        if ((isBlueKeyAcquired2 == false) && j < 1) 
        {
            addObject(new BlueKey(),547,563);
            //isBlueKeyAcquired2 = true;
            j++;
        }
        
        // Copy all 7 below for new Room #3
        if (isBlueKeyAcquired2 && a < 1) 
        {
            addObject(new BlueKey(), 58, 735);
            a++;
        }
        if (isGoldKeyAcquired2 && b < 1) 
        {
            addObject(new GoldKey(), 62, 735);
            b++;
        }
        if (isGreenKeyAcquired2 && c < 1) 
        {
            addObject(new GreenKey(), 66, 735);
            c++;
        }
        if (isOrangeKeyAcquired2 && d < 1) 
        {
            addObject(new OrangeKey(), 70, 735);
            d++;
        }
        if (isPinkKeyAcquired2 && e < 1) 
        {
            addObject(new PinkKey(), 74,735);
            e++;
        }
        if (isRedKeyAcquired2 && f < 1) 
        {
            addObject(new RedKey(), 78, 735);
            f++;
        }
        if (isSilverKeyAcquired2 && g < 1) 
        {
            addObject(new SilverKey(), 82, 735);
            g++;
        }
        // STAP


        if (hearts == 1 && k < 1) 
        {
            addObject(new Heart(), 61, 52);
            k++;
        }
        if (hearts == 2 && k < 1)
        {
            addObject(new Heart(), 61, 52);
            addObject(new Heart(), 93, 52);
            k++;
        }
        if (hearts == 3 && k < 1) 
        {
            addObject(new Heart(), 61, 52);
            addObject(new Heart(), 93, 52);
            addObject(new Heart(), 125, 52);
            k++;
        }

        // Flynn Spawn
        if (positionNumber == 0 && i < 1)
        {
            addObject(new Flynn(), 68, 444);
            i++;
        }
        if(positionNumber == 1 && i < 1)
        {
            addObject(new Flynn(), 716, 463);
            i++;
        }
    }
   
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,194,464);
        Platform platform2 = new Platform();
        addObject(platform2,327,464);
        Platform platform3 = new Platform();
        addObject(platform3,578,584);
        Platform platform4 = new Platform();
        addObject(platform4,416,528);
        BlueDoor blueDoor = new BlueDoor();
        addObject(blueDoor,824,440);
        Platform platform5 = new Platform();
        addObject(platform5,819,538);
        Platform platform6 = new Platform();
        addObject(platform6,68,464);

        //Heart heart = new Heart();
        //addObject(heart,61,52);
        //Heart heart2 = new Heart();
        //addObject(heart2,93,52);
        //Heart heart3 = new Heart();
        //addObject(heart3,125,52);

        Platform platform12 = new Platform();
        addObject(platform12,749,538);
        Platform platform13 = new Platform();
        addObject(platform13,828,538);
        Torch torch = new Torch();
        addObject(torch,727,456);
        Aura aura = new Aura();
        addObject(aura,730,450);
        Flame flame2 = new Flame();
        addObject(flame2,729,446);
        
        InvisiblePlatform invisiblePlatform = new InvisiblePlatform();
        addObject(invisiblePlatform,0,397);

        InvisiblePlatform invisiblePlatform4 = new InvisiblePlatform();
        addObject(invisiblePlatform4,0,103);
        InvisiblePlatform invisiblePlatform8 = new InvisiblePlatform();
        addObject(invisiblePlatform8,0,46);
        InvisiblePlatform invisiblePlatform9 = new InvisiblePlatform();
        addObject(invisiblePlatform9,0,531);
        InvisiblePlatform invisiblePlatform11 = new InvisiblePlatform();
        addObject(invisiblePlatform11,0,726);
        InvisiblePlatform invisiblePlatform3 = new InvisiblePlatform();
        addObject(invisiblePlatform3,0,201);

        InvisiblePlatform invisiblePlatform2 = new InvisiblePlatform();
        addObject(invisiblePlatform2,0,300);

        InvisiblePlatform invisiblePlatform5 = new InvisiblePlatform();
        addObject(invisiblePlatform5,899,51);
        InvisiblePlatform invisiblePlatform6 = new InvisiblePlatform();
        addObject(invisiblePlatform6,899,152);
        InvisiblePlatform invisiblePlatform7 = new InvisiblePlatform();
        addObject(invisiblePlatform7,899,253);
        InvisiblePlatform invisiblePlatform12 = new InvisiblePlatform();
        addObject(invisiblePlatform12,899,353);
        InvisiblePlatform invisiblePlatform13 = new InvisiblePlatform();
        addObject(invisiblePlatform13,899,472);
        InvisiblePlatform invisiblePlatform14 = new InvisiblePlatform();
        addObject(invisiblePlatform14,899,472);
        InvisiblePlatform invisiblePlatform15 = new InvisiblePlatform();
        addObject(invisiblePlatform15,898,604);
        InvisiblePlatform invisiblePlatform16 = new InvisiblePlatform();
        addObject(invisiblePlatform16,899,679);
        InvisiblePlatform invisiblePlatform18 = new InvisiblePlatform();
        addObject(invisiblePlatform18,899,724);
        InvisiblePlatform invisiblePlatform19 = new InvisiblePlatform();
        addObject(invisiblePlatform19,0,631);
        InvisiblePlatform invisiblePlatform20 = new InvisiblePlatform();
        addObject(invisiblePlatform20,899,414);
        
        Inventory inventory = new Inventory();
        addObject(inventory, 242, 729);
    }
}
