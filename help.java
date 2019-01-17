import greenfoot.*;

/**
 * Write a description of class help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class help extends World
{

    /**
     * Constructor for objects of class help.
     * 
     */
    public help()
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
    }
}
