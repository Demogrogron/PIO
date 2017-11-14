package projekt1;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Random dice = new Random(); 
    private player Player;
    
    public void addplayer (player Player){
        this.Player = Player;
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
