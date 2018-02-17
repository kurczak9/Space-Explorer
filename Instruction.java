import greenfoot.*;  

/**
 * Instruction screen.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class Instruction extends World
{
    public Instruction()
    {    
        super(700, 300, 1);

        prepare();
    }

    private void prepare()
    {
        InstructionText instructiontext = new InstructionText();
        addObject(instructiontext, 350,130);

        BackButton backbutton = new BackButton();
        addObject(backbutton, 350, 250); 
    }
}
