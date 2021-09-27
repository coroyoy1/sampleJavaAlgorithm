import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] input = {9,8,7,5,1,2,3,4,5,6};

        System.out.println(Arrays.toString(input));    
        mergeSorting(input, 0 ,input.length - 1);
        System.out.println(Arrays.toString(input));
    }

    public static void mergeSorting(int[] input, int start, int end){

        int mid = (start + end) / 2;
        if(start < end) {
            mergeSorting(input, start, mid); 
            mergeSorting(input, mid + 1, end);
        }

        int count = 0, first = start, last = mid + 1;
        int[] temporary = new int[end - start + 1];

        while(first <= mid && last <= end) temporary[count++] = input[first] < input[last] ? input[first++] : input[last++];
        while(first <= mid) temporary[count++] = input[first++];
        while(last <= end) temporary[count++] = input[last++];
        count = 0;
        while(start <= end) input[start++] = temporary[count++];
    }
}
