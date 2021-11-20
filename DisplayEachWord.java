interface Sentence{
    void getPerWord(String sentence);
}

class DisplayPerWord implements Sentence{

    @Override
    public void getPerWord(String sentence) {
        String[] word = sentence.split("\\s+");
        for(int index = 0; index < word.length; index++){
            word[index] = word[index].replaceAll("[^\\w]", "");
            System.out.println(word[index]);
        }
    }
    
}

public class DisplayEachWord {

    private String sentence;

    DisplayEachWord(){
        sentence = "My Name is John Cena";
    }

    private static DisplayEachWord displayEach = new DisplayEachWord();
    private static DisplayPerWord displayWord = new DisplayPerWord();

    public static void main(String[] args) {
        displayWord.getPerWord(displayEach.sentence);
    }    
}
