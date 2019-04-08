
/**
 * Write a description of class Pokemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pokemon
{
    protected String primaryType;
    protected String name;
    private int remainingHealth;
    private int maxHealth; 
    
    public Pokemon(String name, String primaryType)
    {
        this.name = name;
        this.primaryType = primaryType;
        this.maxHealth = 10;
        this.healToFull();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int useAttack() {
        System.out.println(this.getName() + " flailed about.");
        return 0;
    }
    
    public void healToFull() {
        this.remainingHealth = this.maxHealth;
    }
    
    public void dealDamage(int amount){
        remainingHealth = remainingHealth - amount;
    }
    
    public int getHealth() {
        return remainingHealth;
    }
}