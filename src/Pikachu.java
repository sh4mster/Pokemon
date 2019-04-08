
/**
 * Write a description of class Pikachu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pikachu extends Pokemon
{

    /**
     * Constructor for objects of class Pikachu
     */
    public Pikachu()
    {
        super("Pikachu", "Electric");
    }
    
    public int useAttack() 
    {
        System.out.println(this.getName() + " used Thunderbolt.");
        return 2;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if ((obj instanceof Pikachu) == false) {
            return false;
        }
        
        Pikachu other = (Pikachu) obj;
        return name.equals(other.name) && primaryType.equals(other.primaryType);
    }
    
    public int hashCode() 
    {
        int arbitraryValue = 1337;
        int result = arbitraryValue + name.hashCode() + primaryType.hashCode();
        return result;
    }
}
