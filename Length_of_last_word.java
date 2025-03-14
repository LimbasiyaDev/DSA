public class Length_of_last_word {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        return s.length() - lastSpace - 1;
    }    
}
