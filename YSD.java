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

        move();
        fall();
        if(Greenfoot.isKeyDown("up") && getY()> getWorld().getHeight()-195) jump();
        if (isTouching (Enemy.class)){ 
         removeTouching(Enemy.class);
         Greenfoot.stop();
         
        }
        if (isTouching (block.class)){ 
        
         Greenfoot.stop();
         
        }
        if(getX()> getWorld().getWidth()-10){
            setLocation(0,getY());
            getWorld().removeObject( block.class );
            int ran = (int)(Math.random()*4);//０～３の乱数をつくる
            switch(ran){
                
                case 0:
                    addObject( new block(), 150, 450 );
                    addObject( new block(), 200, 450 );
                    addObject( new block(), 575, 450 );
                    break;
                
                case 1:
                    addObject( new block(), 550, 450 );
                    addObject( new block(), 600, 450 );
                    addObject( new block(), 875, 450 );
                    break;
                
                case 2:
                    addObject( new block(), 150, 450 );
                    addObject( new block(), 200, 450 );
                    addObject( new block(), 575, 450 );
                    break;
                
                case 3:
                    addObject( new block(), 550, 450 );
                    addObject( new block(), 600, 450 );
                    addObject( new block(), 875, 450 );
                    break;
            
            }

        }
    }
    public void fall(){
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
        velocity=-25;
       }
    public void eat(){
       Actor actor = getOneObjectAtOffset( 0, 0, Enemy.class );
       if( actor != null ){
           getWorld().showText( "HOGE", 100, 50 );
           Greenfoot.stop();
       }
      }
    }
