
/**
 * Write a description of class Larvitar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Larvitar extends DualTypePokemon
{
    
    /**
     * Constructor for objects of class Larvitar
     */
    public Larvitar()
    {
        super("Larvitar", "Ground", "Rock");
    }
    
    public int useAttack() 
    {
        System.out.println(this.getName() + " used Smack Down.");
        return 3;
    }
}
