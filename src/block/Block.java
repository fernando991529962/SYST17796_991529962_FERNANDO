package block;

public class Block {

    private char letter = 'a';
    private String color = "brown";
    
    public Block() {
    }
    
    public Block(char letter, String color) {
        this.letter = letter;
        this.color = color;
    }
    
    public char getLetter() {
        return letter;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Block has the letter " + letter + " on it and is " + color;
    }
    
    public static void main(String[] args) {
        Block block1 = new Block();
        Block block2 = new Block('e', "red");
        System.out.println(block1.getLetter());
        System.out.println(block2.getColor());
        System.out.println(block2);
    } 
}

