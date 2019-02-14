import greenfoot.*;

/**
 * Write a description of class game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game extends World
{

    /**
     * Constructor for objects of class game.
     * 
     */
    public game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1123, 794, 1); 

        addObject( new YSD(), 0, 0 );
        //addObject( new Enemy(), 1100, 500 );
          //showText( "ﾋｨｲｲｲｲｲｲｲ ", 500, 300 );

        
        addObject( new block(), 550, 450 );
        addObject( new block(), 700, 450 );
        addObject( new block(), 775, 450 );

    }     

          
    }

