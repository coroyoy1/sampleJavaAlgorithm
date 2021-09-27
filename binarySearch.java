
public class binarySearch {

    public int BinarySearch(int input[], int start, int center, int searchNumber){
        
        if(center >= start){
            int middle = start + (center - 1) / 2;
            
            //If the element is present at the middle itself
            if(input[middle] == searchNumber) return middle;

            // If element is smaller than mid, then it can only be present in left subarray
            if(input[middle] > searchNumber) return BinarySearch(input, start, middle - 1, searchNumber);

            // Else the element can only be present in right subarray
            return BinarySearch(input, middle + 1, center, searchNumber);
        }
        // We reach here when element is not present in array
        return - 1;
    }

    public static void main(String[] args) {

        // Driver method to test above
        binarySearch search = new binarySearch();
        int array[] = {2, 3, 4, 10, 40};
        int numberLength = array.length;
        int findNumber = 4;

        int result = search.BinarySearch(array, 0, numberLength - 1, findNumber);
        if(result == -1) System.out.println("Element is not present");
        else System.out.println("Element is found at index " +result);
    }
}