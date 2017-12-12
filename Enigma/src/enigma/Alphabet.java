package enigma;
 public class Alphabet {
    
    public static final String ALPHA_UP_SPACE = "ABCDEFGHIJKLMNOPQRSTWZX";
    
    public String charset= "";
    
    public Alphabet(String charset){
        if(charset.isEmpty()||charset == null){
            throw new IllegalArgumentException("zestaw znakow nie moze byc pusty");
        }
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
        int i = idx % charset.length();
        return charset.charAt(i);     
    }

    public int length() {
        return charset.length();
    }
    
}