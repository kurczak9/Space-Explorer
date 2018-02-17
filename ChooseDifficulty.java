import greenfoot.*; 

/**
 * World for the option of changing difficulty.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class ChooseDifficulty extends World
{
    public ChooseDifficulty()
    {    
        super(700, 300, 1); 
        
        prepare();
    }

    private void prepare()
    {
        GameDifficultyText gamedifficultytext = new GameDifficultyText();
        addObject(gamedifficultytext, 350, 45);
        
        EasyButton easybutton = new EasyButton();
        addObject(easybutton, 350, 110);
        
        NormalButton normalbutton = new NormalButton();
        addObject(normalbutton, 350, 180);
        
        HardButton hardbutton = new HardButton();
        addObject(hardbutton, 350, 250);
    }
}
