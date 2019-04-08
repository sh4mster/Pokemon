
/**
 * Write a description of class Battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    private Pokemon yourPokemon;
    private Pokemon opponentPokemon;
    private boolean battleHasStarted;
    
    public Battle()
    {
    
    }
    
    public void quickStartBattle() 
    {        
        startBattle(new Pikachu(), new Larvitar());
    }

    public void startBattle(Pokemon yourPokemon, Pokemon opponentPokemon) 
    {
        this.yourPokemon = yourPokemon;
        this.opponentPokemon = opponentPokemon;
        
        System.out.println("You sent out " + yourPokemon.getName() + "!");
        System.out.println("Opponent sent out " + opponentPokemon.getName() + "!");
        
        battleHasStarted = true;
    }
    
    public void commandPokemon() 
    {
        if (battleHasStarted == false) {
            System.out.println("Battle has not started.");
            return;
        }
        
        int dealtDamage = yourPokemon.useAttack();
        opponentPokemon.dealDamage(dealtDamage);
        
        if (opponentPokemon.getHealth() <= 0) {
            System.out.println(opponentPokemon.getName() + " fainted. You won!");
            battleHasStarted = false;
            return;
        }
        
        int receivedDamage = opponentPokemon.useAttack();
        yourPokemon.dealDamage(receivedDamage);
        
        if (yourPokemon.getHealth() <= 0) {
            System.out.println(yourPokemon.getName() + " fainted. You lost!");
            battleHasStarted = false;
            return;
        }
    }
}
