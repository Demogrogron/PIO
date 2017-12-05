package enigma;

public class Enigma {
        
        
    
  

public static void main(String[] args) 
{
/*   
   String alphabet = "ABCDEF" ;
   String text ="ABCF";
   
   StringBuilder out = new StringBuilder();
    int x = alphabet.length();
    for(int i=0 ; i<text.length() ; ++i){
       
        int ch = text.charAt(i);
       
        int idx = alphabet.indexOf(ch);
        
        idx = (idx + 1) % x;
        
        ch = alphabet.charAt(idx);
        
        out.append((char)ch);
} 
  */
    Alphabet alphabet = new Alphabet("ABCDEFGHIJKLMNOPRST");
    Cipher cipher = new Cipher();
    
    //cipher.setAlphabet(alphabet);
    String in = "ABCT";
    String out = cipher.encrypt(in);
            
    System.out.println("teskt szyfrowany: " + in);
    System.out.println("teskt zaszyfrowany: " + out);
    }



}