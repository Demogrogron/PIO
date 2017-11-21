
package projekt1;

import java.util.Scanner;

public class PlayerHuman extends player {
    Scanner scanner = new Scanner(System.in);
    
    
    public PlayerHuman(String name){
    super(name);
}
    
    @Override
    public int guess(){
        System.out.println(">> ");
            return scanner.nextInt();
    }
}
