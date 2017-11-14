
package projekt1;

import java.util.Random;

abstract public class player {
   
   private Random dice = new Random();
   private String name = "anon";

   public player(String name){
    setName(name);
}
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
       if( name != null && name.matches("^[a-zA-Z0-9~_-]{5,}$")) {
        this.name = name;
       } else {
            throw new IllegalArgumentException();
           //System.err.println("Nazwa nieprawidłowa");
         }
    }
   
   abstract public int guess();
   
}
//serr tab
//sout tab