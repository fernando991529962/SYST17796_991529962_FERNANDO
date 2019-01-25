
package block;

public class stringToCharArray {

    public static void main(String[] args) {
        
        char[] characters = convertStringToArray("Samuel");
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }
    }
    
    public static char[] convertStringToArray(String str) {
        
        int strLen = str.length();
        char characters[] = new char[strLen]; 
        for (int i = 0; i < strLen; i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }
}
