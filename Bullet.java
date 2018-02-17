import greenfoot.*;

/**
 * The bullet, rocket use it to destroy enemies.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class Bullet extends GamePlay
{
    public static int bullet = 7; //variable setting speed of bullet
    
    public void act() 
    {
        World world = this.getWorld();
       
        this.move(bullet);
      
        if(this.isAtEdge())
        {
            world.removeObject(this);
        }
        
        if(Space.gameover)
        {
            world.removeObject(this); 
        }//removes bullet after spaceship dies
    }    
}
