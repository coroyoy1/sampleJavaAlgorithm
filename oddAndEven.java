import java.util.ArrayList;
import java.util.Scanner;

public class oddAndEven {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<Integer> arrayNumbers = new ArrayList<Integer>();
    static int[] array;

    public static void main(String[] args) {

        System.out.println("Enter how many numbers you want: ");
        int totalNumber = input.nextInt();
        array = new int[totalNumber];

        for(int count = 0; count < totalNumber; count++) array[count] = input.nextInt();
        for(int count = 0; count < array.length; count++) arrayNumbers.add(array[count]);

        System.out.println("Result of Even and Odd");
        for(int count = 0; count < array.length; count++){
                if(arrayNumbers.get(count) % 2 == 0){ 
                    System.out.println("Even: "+ arrayNumbers.get(count)); continue;
                } 
            System.out.println("Odd: "+ arrayNumbers.get(count));
        }
    }
}
