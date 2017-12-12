import org.junit.Test;
import static org.junit.Assert.*;

import enigma.Alphabet;
import org.junit.Before;



public class AlphabetTest {
    
    private Alphabet a ;
    public AlphabetTest() {
    }
    
    @Before
    public void setUp(){
        a = new Alphabet ("ABCDE");
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void emptyCharsetTest() {
        a = new Alphabet("");
    }
    @Test (expected = IllegalArgumentException.class)
    public void nullTest() {
        a = new Alphabet(null);
    }
    
    
    @Test
    public void lengthTest() {
        
        assertEquals(5, a.length()); 
    }
    
    @Test
    public void indexOfTest() {
        
        assertEquals(2, a.indexOf('C')); 
        
        assertEquals(-1, a.indexOf('X'));
    }
    
     @Test
    public void charAtTest() {
        
        assertEquals('C', a.charAt(2)); 
        
        assertEquals('C', a.charAt(7));
    }
    
    
    
    
}
