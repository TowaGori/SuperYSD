import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1123, 794, 1); 

}
    public void act()
    {
    if( Greenfoot.isKeyDown( "enter" ) ){
        World game = new game();
        Greenfoot.setWorld( game );
    }
    else if( Greenfoot.isKeyDown( "h" ) ){
        World game = new help();
        Greenfoot.setWorld( game );
    }
            
        if( Greenfoot.isKeyDown( "e" ) ){
            System.exit(0);

    }
    
    
    
    }

}

