import greenfoot.*;

/**
 * Write a description of class YSD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YSD extends Actor
{
    /**
     * Act - do whatever the YSD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
}// Add your action code here.
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
}// Add your action code here.
<<<<<<< HEAD
=======
=======

<<<<<<< HEAD
        
=======
   
>>>>>>> bbdeef4a7b9fdcbb851bc609c453daadbbdd2ebb
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
    }// Add your action code here.


>>>>>>> bbdeef4a7b9fdcbb851bc609c453daadbbdd2ebb
>>>>>>> dc14a7bdde4b855bbacb52a9868556f8dccf25d1
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(270);
        move(1);
}// Add your action code here.
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(180);
        move(1);
}// Add your action code here. 
       }// Add your action code here.
    }    
}
