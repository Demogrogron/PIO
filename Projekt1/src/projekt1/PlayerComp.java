package projekt1;
import java.util.Random;

public class PlayerComp extends player {
private final Random random = new Random();

public PlayerComp(String name){
    super(name);
}


@Override
public int guess(){
       return random.nextInt(6) + 1;
    }    
}
