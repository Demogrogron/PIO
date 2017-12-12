import org.junit.Test;
import static org.junit.Assert.*;

import enigma.Alphabet;



public class AlphabetTest {
    
    public AlphabetTest() {
    }
    
    @Test
    public void lengthTest() {
        Alphabet a = new Alphabet ("ABCDE");
        assertEquals(5, a.length()); 
    }
    
    @Test
    public void indexOfTest() {
        Alphabet a = new Alphabet ("ABCDE");
        assertEquals(2, a.indexOf('C')); 
        
        assertEquals(-1, a.indexOf('X'));
    }
    
     @Test
    public void charAtTest() {
        Alphabet a = new Alphabet ("ABCDE");
        assertEquals('C', a.charAt(2)); 
        
        assertEquals('C', a.charAt(7));
    }
    
    
    
    
}
