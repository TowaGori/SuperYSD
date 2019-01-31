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
<<<<<<< HEAD
        addObject( new YSD(), 0, 0 );
        addObject( new HP(), 900, 100 );
        addObject( new HP(), 960, 100 );
        addObject( new HP(), 1020, 100 );
        addObject( new Bee(), 600, 500 );
        
=======

        addObject( new YSD(), 0, 0 );
        addObject( new Enemy(), 1100, 500 );
          showText( "ﾋｨｲｲｲｲｲｲｲ ", 500, 300 );

        
        addObject( new block(), 550, 400 );
        addObject( new block(), 700, 400 );
        addObject( new block(), 775, 400 );
    }     

          
>>>>>>> e846dc53683907e692e6879dfc7e7f1f6c7e5ff8
    }



            System.exit(0);

    }
    
    if( Greenfoot.isKeyDown( "t" ) ){
        World game = new MyWorld();
        Greenfoot.setWorld( game );
        
    }
}
}
