import java.util.ArrayList;
import java.util.Comparator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayListing = new ArrayList<String>();
        ArrayList<Integer> arrayListingInteger = new ArrayList<>();

        //Number listing with looping
        for(int counter = 1; counter <= 10; counter++){
            arrayListingInteger.add(counter);
        }

        //String adding
        arrayListing.add("Nokia");
        arrayListing.add("Opo");
        arrayListing.add("Iphone");
        arrayListing.add("Samsung");

        //String sort result
        arrayListing.sort(Comparator.naturalOrder());
        System.out.println(""+ arrayListing);

        //Integer sort result
        arrayListingInteger.sort(Comparator.reverseOrder());
        System.out.println(""+ arrayListingInteger);
    }
}
