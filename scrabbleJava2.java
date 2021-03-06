public class scrabbleJava2 {

    public static void main(String[] args) {
        scrabbleJava2 sj = new scrabbleJava2();
        sj.Scrabble("OxyphenButazone");
        System.out.println(sj.getScore());
    }


    private String input;
    void Scrabble (String input) {
        this.input = input;
    }
    public int getScore() {
        if (input == null)
            return 0;
        return input.toLowerCase().chars()
                .map(scrabbleJava2::scoreOfLetter)
                .sum();
    }
    private static int scoreOfLetter(int letter) {
        switch (letter) {
            case 'a': return 1;
            case 'b': return 3;
            case 'c': return 3;
            case 'd': return 2;
            case 'e': return 1;
            case 'f': return 4;
            case 'g': return 2;
            case 'h': return 4;
            case 'i': return 1;
            case 'j': return 8;
            case 'k': return 5;
            case 'l': return 1;
            case 'm': return 3;
            case 'n': return 1;
            case 'o': return 1;
            case 'p': return 3;
            case 'q': return 10;
            case 'r': return 1;
            case 's': return 1;
            case 't': return 1;
            case 'u': return 1;
            case 'v': return 4;
            case 'w': return 4;
            case 'x': return 8;
            case 'y': return 4;
            case 'z': return 10;
            default:
                return 0;
        }
    }
}
