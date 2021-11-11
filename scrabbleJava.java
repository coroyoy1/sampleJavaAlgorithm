public class scrabbleJava {

    static scrabbleJava sj = new scrabbleJava();

    public static void main(String[] args) {
       sj.ScrabbleJava("OxyphenButazone");
       System.out.println(sj.getScore());
    }

    String word = "";

    void ScrabbleJava(String word){
        this.word = word;
    }

    int getScore(){
        int score = 0;
        char ch = ' ';
        for(int index = 0; index < word.length(); index++){
            ch = word.charAt(index);
            switch(ch){
                case 'a': case 'e': case 'i': case 'o': case 'u': case 'l':
                case 'n': case 'r': case 's': case 't':  
                    score += 1;
                    break;
                case 'd': case 'g':
                    score += 2;
                    break;
                case 'b': case 'c': case 'm': case 'p':
                    score += 3;
                    break;
                case 'f': case 'h': case 'v': case 'w': case 'y':
                    score += 4;
                    break;
                case 'k':
                    score += 5;
                    break;
                case 'j': case 'x':
                    score += 8;
                    break;
                case 'q': case 'z':
                    score += 10;
                    break;
                default:
                    score += 0;
                    break;
            }
        }
        return score;
    }

    /*         int score = 0;
        char ch = ' ';
        for(int index = 0; index < word.length(); index++){
            ch = word.charAt(index);
            String charToStr = String.valueOf(ch);
            charToStr.toUpperCase();
            switch(charToStr){
                case "A": case "E": case "I": case "O": case "U": case "L":
                case "N": case "R": case "S": case "T":  
                    score += 1;
                    break;
                case "D": case "G":
                    score += 2;
                    break;
                case "B": case "C": case "M": case "P":
                    score += 3;
                    break;
                case "F": case "H": case "V": case "W": case "Y":
                    score += 4;
                    break;
                case "K":
                    score += 5;
                    break;
                case "J": case "X":
                    score += 8;
                    break;
                case "Q": case "Z":
                    score += 10;
                    break;
                default:
                    score += 0;
                    break;
            }
        }
        return score;*/
}
