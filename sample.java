import java.util.HashMap;
import java.util.Scanner;

public class sample {

  static Scanner myObj = new Scanner(System.in); 
  public static void main(String[] args) {
    HashMap<String, String> data = new HashMap<String, String>();
    String[] listing = {"Name", "Age", "Address"};
    for(int x = 0; x < listing.length; x++)
    {
    	System.out.println("Enter " + listing[x] + ":");
        String input = myObj.nextLine();
        data.put(listing[x], input);
    }
    
    for (String i : data.keySet()) {
        System.out.println(i + ":" + data.get(i));
    }
  }
}