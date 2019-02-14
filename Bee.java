import greenfoot.*;

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Enemies
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int flag = 700;

    public void act() 
    { 
        if (flag != 2){
            if ( getX() != 700){setLocation( getX()+2,getY() );}else{flag = 1;}
            if ( flag == 1 && getX() != 500 ){
                setLocation( getX()-4,getY());
            }else if(flag == 1){ flag = 0;}
        }
    }
        // Add your action code here.
    }    

