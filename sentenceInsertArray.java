import java.util.ArrayList;
import java.util.Scanner;

public class sentenceInsertArray {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String sentence = "My Name is John";
        String[] array = sentence.split(" ");
        ArrayList<String> arrayListOfWords = new ArrayList<String>();

        //array is for Display and Arraylist is to store/add come from array
        for(int count = 0; count < array.length; count++) System.out.print(array[count]+ " ");
        for(int count = 0; count < array.length; count++) arrayListOfWords.add(array[count]);
        System.out.println(arrayListOfWords);

        //Get John's name
        String specificName = null;
        boolean exists = false;

        System.out.println("What do you want to display?: ");
        specificName = input.nextLine().toLowerCase();

        for(int count = 0; count < arrayListOfWords.size(); count++){
            if(specificName.equals(arrayListOfWords.get(count).toLowerCase())) exists = true;
        }

        //Check if Name exists
        if(exists == true) System.out.println("Exists");
        else System.out.println("Not Exists");
    }
}
