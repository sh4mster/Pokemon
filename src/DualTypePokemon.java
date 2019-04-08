
/**
 * Write a description of class DualTypePokemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DualTypePokemon extends Pokemon
{
    protected String secondaryType;
    
    public DualTypePokemon(String name, String primaryType, String secondaryType)
    {
        super(name, primaryType);
        this.secondaryType = secondaryType;
    }
}
