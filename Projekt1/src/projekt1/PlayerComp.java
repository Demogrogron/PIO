package projekt1;
import java.util.Random;

public class PlayerComp extends player {
private Random random = new Random();

public PlayerComp(){
}

public PlayerComp(String name){
    super(name);
}


@Override
public int guess(){
       return dice.nextInt(6) + 1;
    }    
}
