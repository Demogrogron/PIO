package enigma;
 public class Alphabet {
    
    public static final String ALPHA_UP_SPACE = "ABCDEFGHIJKLMNOPQRSTWZX";
    
    public String charset= "";
    
    public Alphabet(String charset){
        this.charset = charset;
    }

    public boolean isTextValid(String text){
        return text.matches("^["+charset+"]+$");
    }

    String getCharset() {
        return charset;
    }
    
    public int indexOf(int ch){
        return charset.indexOf(ch);
    }

    public int charAt(int idx) {
        return charset.charAt(idx % charset.length());     
    }

    public int length() {
        return charset.length();
    }
    
}