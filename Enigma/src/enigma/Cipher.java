package enigma;


public class Cipher {
    
private int key = 1;
private String alphabet = "ABCDEF"; 

public Cipher(){
}

public void setKey(int key){
    this.key = key;
}

void setAlphabet(String alphabet){
    this.alphabet = alphabet;
}


public  String encrypt (String text) {
 
   StringBuilder encrypted = new StringBuilder();
        int x = alphabet.length();
        for(int i=0 ; i<text.length() ; ++i){
       
            int ch = text.charAt(i);
            int idx = alphabet.indexOf(ch);
            idx = (idx + key) % x;
        
        ch = alphabet.charAt(idx);
        
        encrypted.append((char)ch);
        }
    
    return encrypted.toString();
    
    }
}