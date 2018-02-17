import greenfoot.*;  

/**
 * The menu of the game.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class Menu extends World
{
    public Menu()
    {    
        super(700, 300, 1); 
        
        prepare();
    }

    private void prepare(){
        MenuText menutext = new MenuText();
        addObject(menutext, 350, 45);

        StartGameButton startgamebutton = new StartGameButton();
        addObject(startgamebutton, 350, 110);

        InstructionButton instructionbutton = new InstructionButton();
        addObject(instructionbutton, 350, 180);

        GameDifficultyButton gamedifficultybutton = new GameDifficultyButton();
        addObject(gamedifficultybutton, 350, 250);
        
        AboutMe aboutme = new AboutMe();
        addObject(aboutme,664,263);
    }
}
