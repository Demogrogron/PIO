package projekt1;
import java.util.*;
public class NewClass {

    public static void main(String[] args) {
       
       /* 
        List<String> list = new ArrayList();
        
        list.add("pierwszy");
        list.add("drugi");
        list.add("3");
        
       System.out.println(list);
       System.out.println("--------------------------");
       for (int i=0 , len = list.size() ; i < len; i++ ){
           String elem = list.get(i);
        System.out.println(elem); 
        
       }
       System.out.println("--------------------------");
       for (String elem : list){ // brak mozliwosci usuwania elementow w tej petli
           System.out.println(elem);
       }
       System.out.println("--------------------------");
       
       Iterator<String> itr = list.iterator();
       while(itr.hasNext()) {
         String elem = itr.next();
         System.out.println(elem);
      }
        */
       
        Scanner klawiatura = new Scanner(System.in);
        Random dice = new Random();              
            Game game = new Game();      
             player Player = new PlayerComp("anon");      
             game.addplayer(Player);       
             game.play();
             
//       Player.setName("Anon");
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