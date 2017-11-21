package projekt1;
import java.util.*;

public class Game {
    private final Random dice = new Random(); 
    private player Player;
    List<String> players = new ArrayList();
    
    public void addplayer (player Player){
        this.Player = Player;
       // players.add(Player);
    }
    
    
    public void play() {
        
        int number;
        int guess;
        
        do{
            number = dice.nextInt(6)+1; 
            System.out.println("WYLOSOWANA TO: "+number);
           guess = Player.guess();
            System.out.println("GRACZ >" + Player.getName() + "< LOSUJE: "+guess);
            
            if(number==guess){
            System.out.println("Brawo!");
            }else if(number!=guess){
            System.out.println("Źle!");
            }
            
        }while(number!=guess);
    }
}
