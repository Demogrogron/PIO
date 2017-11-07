package projekt1;

import java.util.Random;

public class player {
    
     private String name;
    
     Random rand = new Random();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
        //     System.err.println("Imie niepoprawne");
            this.name = name;
        else throw new IllegalArgumentException("Imie niepoprawne");
                
    }
   


     
    public int guess() { 
        return rand.nextInt(6) + 1;
    }

}
//serr tab
//sout tab