import java.util.ArrayList;
import java.util.Scanner;

public class arrayListingIOWithArray {

    static Scanner inputScan = new Scanner(System.in);
    public static void main(String[] args) {
        String[] arrayStrings;
        ArrayList<String> dataString = new ArrayList<String>();

        System.out.println("Enter how many data do you want to input: ");
        int totalNumber = inputScan.nextInt();
        arrayStrings = new String[totalNumber];

        for(int count = 0; count < totalNumber; count++) arrayStrings[count] = inputScan.next();
        for(int count = 0; count < totalNumber; count++) dataString.add(arrayStrings[count]);

        System.out.println(""+ dataString);
    }
}
