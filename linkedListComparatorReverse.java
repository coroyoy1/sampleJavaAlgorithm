import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class linkedListComparatorReverse {
    public static void main(String[] args) {
        List<String> listOfFood = new LinkedList<>(
            Arrays.asList("beans", "oat", "rice", "chicken"));
        
        System.out.println("Before sorting: "+listOfFood);
        listOfFood.sort(Comparator.reverseOrder());
        System.out.println("After sorting: " +listOfFood);
    }
}
