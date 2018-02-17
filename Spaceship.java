import greenfoot.*;

/**
 * The rocket, game hero.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class Spaceship extends GamePlay
{
    boolean spaceDown = true;
    
    public void act() 
    {
        World world = this.getWorld();      

        int x = this.getX(); 
        int y = this.getY();  
       
        if(Greenfoot.isKeyDown("up") && !Space.pause)  
        {
            y -= 3;
        }//*
        
        if(Greenfoot.isKeyDown("down") && !Space.pause) 
        {
            y += 3;
        }//* Space.pause is to pretend moving of rocket while game is paused
        
        this.setLocation(x, y); //*rocket moving
            
        if(Greenfoot.getKey() == "space" && !Space.pause)
        {
            spaceDown = false;
        }//**
        if(!spaceDown && Greenfoot.isKeyDown("space") && !Space.pause)
        {
            Bullet bullet = new Bullet();
            world.addObject(bullet, x, y);
            
            spaceDown = true;
        }//**makes missiles appear by every single space touch
         //**Space.pause is to pretend creating bullets why game
        
        if(this.isTouching(Enemy.class))
        {
            x = this.getX();
            y = this.getY();
            
            world.removeObject(this); 
                
            DeadShipIcon deadship = new DeadShipIcon();
            world.addObject(deadship, x, y);
                
            ToMenuButton tomenubutton = new ToMenuButton();
            world.addObject(tomenubutton, 350, 250);
                
            GameOverText gameovertext = new GameOverText();   
            world.addObject(gameovertext, 350, 90);
            
            GameOverText2 gameovertext2 = new GameOverText2();
            world.addObject(gameovertext2, 350, 170);
                
            Space.pause = true;
            Space.gameover = true;
        }       
    }
}
