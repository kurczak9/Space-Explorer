import greenfoot.*; 

/**
 * Main world of the game.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class Space extends World
{
    public static boolean pause = false;
    public static boolean gameover = false;

    public void act()
    {
        if(pause)
        {
            Enemy.difficulty = 1; //
            Target.barrel = 1; // this causes game objects stop, 
            Bullet.bullet = 0; // without stopping the whole game
        }
        else if(!pause)
        {
            Enemy.difficulty = GameDifficulty.difficulty; //
            Target.barrel = 5; // 
            Bullet.bullet = 7; // this causes game objects move again
        }
    }
    
    public Space()
    {    
        super(700, 300, 1); 
        
        Enemy enemy = new Enemy();
        addObject(enemy, 400, Greenfoot.getRandomNumber(400));
        
        Enemy enemy2 = new Enemy();
        addObject(enemy2, 400, Greenfoot.getRandomNumber(400));
        
        Enemy enemy3 = new Enemy();
        addObject(enemy3, 400, Greenfoot.getRandomNumber(400));
        
        Enemy enemy4 = new Enemy();
        addObject(enemy4, 400, Greenfoot.getRandomNumber(400));
        
        Enemy enemy5 = new Enemy();
        addObject(enemy5, 400, Greenfoot.getRandomNumber(400));
        
        prepare();
    }

    private void prepare()
    {
        ScoreCounter scorecounter = new ScoreCounter();
        addObject(scorecounter, 64,20);
        
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, 100, 200);

        Target target = new Target();
        addObject(target, 700, Greenfoot.getRandomNumber(400));
        
        Target target2 = new Target();
        addObject(target2, 700, Greenfoot.getRandomNumber(400));
        
        PauseIcon pauseicon = new PauseIcon();
        addObject(pauseicon, 675, 30);
        
        Enemy enemy = new Enemy();
        addObject(enemy, 700, Greenfoot.getRandomNumber(400));
        
        Enemy enemy2 = new Enemy();
        addObject(enemy2, 700, Greenfoot.getRandomNumber(400));
        
        Enemy enemy3 = new Enemy();
        addObject(enemy3, 700, Greenfoot.getRandomNumber(400));
        
        Enemy enemy4 = new Enemy();
        addObject(enemy4, 700, Greenfoot.getRandomNumber(400));
        
        Enemy enemy5 = new Enemy();
        addObject(enemy5, 700, Greenfoot.getRandomNumber(400));
    }
}
