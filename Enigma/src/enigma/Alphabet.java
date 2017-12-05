package enigma;


public class Alphabet {
    private String charset = "ABCDEF";
    
    public Alphabet ( String charset){
        this.charset = charset;
    }
    boolean isTextValid(String input){
        boolean match = false;
        for (int i=0; i<input.length();i++){
            match = false;
            for (int j=0; j<charset.length();j++) { 
                 if(input.charAt(i) == charset.charAt(i)){
                    match = true;
                 }
            }
            if (match == false) return false;
            
        } 
        return true;
    }

    String getCharSet(){
        return charset;
    }
    public int indexOf(int ch){
        return charset.indexOf(ch);
    }
    
    int charAt(int ch){
        return charset.charAt(ch);
    }
    
    int lenght(int ch){
        return charset.length();
    }
}
