package projekt1;
import java.util.Random;
import java.util.Scanner;
public class NewClass {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        Random dice = new Random(); 
        
        player Player = new PlayerComp();
        
        Game game = new Game();
        
        game.addplayer(Player);
        
        game.play();
        
        
       
//        Player.setName("Anon");
/*
        int number,guess;
        
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
        */
    }
}