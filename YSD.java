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
    private final int GRAVITY=1;
    private int velocity;
    
    public void jumper()
    {
        velocity=0;
    }
    public void act() 
    {
<<<<<<< HEAD
        move();
        fall();
        if(Greenfoot.isKeyDown("up") && getY()> getWorld().getHeight()-195) jump();
        if (isTouching (Enemies.class))
        {
         removeTouching(HP.class);
        
        // Greenfoot.stop();}
        
=======

        move();
        fall();
        if(Greenfoot.isKeyDown("up") && getY()> getWorld().getHeight()-195) jump();
        if (isTouching (Enemy.class)){ 
         removeTouching(Enemy.class);
         Greenfoot.stop();
         
>>>>>>> e846dc53683907e692e6879dfc7e7f1f6c7e5ff8
        }
        if(getX()> getWorld().getWidth()-10)
        {
            setLocation(0,600);
        }

    }   
    public void fall()
    {
        setLocation(getX(),getY()+velocity);
        if (getY()> getWorld().getHeight()-195) velocity=0;
        else
        velocity=velocity+GRAVITY;
        }
    public void move(){
        int x= getX();
        int y= getY();
        
        if(Greenfoot.isKeyDown("left"))x-=6;
        if(Greenfoot.isKeyDown("right"))x+=6;
        setLocation(x,y);
    }
    public void jump(){
        velocity=-15;
    }
<<<<<<< HEAD
         public void eat(){
       Actor actor = getOneObjectAtOffset( 0, 0, Enemies.class );
=======
    public void eat(){
       Actor actor = getOneObjectAtOffset( 0, 0, Enemy.class );
>>>>>>> e846dc53683907e692e6879dfc7e7f1f6c7e5ff8
       if( actor != null ){
       getWorld().showText( "HOGE", 100, 50 );
       Greenfoot.stop();
       }
    }
<<<<<<< HEAD
}// Add your action code here.
=======
}
    





>>>>>>> e846dc53683907e692e6879dfc7e7f1f6c7e5ff8



