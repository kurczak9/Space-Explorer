import greenfoot.*; 

/**
 * Write a description of class InstructionButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionButton extends MenuObjects
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Instruction());
        }  
    }    
}
