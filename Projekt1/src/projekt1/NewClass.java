package projekt1;
import java.util.Random;
import java.util.Scanner;

public class NewClass {
   
    public static void main(String[] args) {
    Random rand = new Random();
    
    player Player = new player();
    try{
    Player.setName("");
    } catch (IllegalArgumentException ex) {
        System.err.println("Błąd " + ex.getMessage());
    } catch (Exception ex){
        System.err.println("NULL");
    }
    
    int number = Player.guess();
    int tries = 0;
    Scanner input = new Scanner(System.in);
    int guess;
       
        boolean win = false;
           
            while (win == false) {
                System.out.println("Guess the number of rolled dice "+ Player.getName() +" : ");
                guess = input.nextInt();
                tries++;
                 
               if (guess == number ){
                   win = true;
               }
               else if (guess < number){
                System.out.println(Player.getName()+" Your guess is to low");  
               }
               else if (guess > number){
                System.out.println(Player.getName()+" Your guess is to high");
               
               }
           
            }
            System.out.println("You win "+Player.getName());
            System.out.println("Number of tries " + Player.getName()+" used: "+ tries);
    }
}