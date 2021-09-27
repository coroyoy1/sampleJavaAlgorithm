import java.util.Arrays;

public class _code_sample_bs{
    public static void main(String[] args) {
        int[] list ={9,8,7,6,4,2,1,3,5};
        mergeSort(list, 0, list.length - 1);
        System.out.println(Arrays.toString(list));
    }
    
    public static void mergeSort(int[] list, int lowIndex, int highIndex){
        if (lowIndex == highIndex){
		return;
        }
	    else {
            int midIndex = (lowIndex + highIndex) / 2;
            mergeSort(list, lowIndex, midIndex);
            mergeSort(list, midIndex + 1, highIndex);
            merge(list, lowIndex, midIndex, highIndex);
	    } 
    }

    public static void merge(int[] list, int lowIndex, int midIndex, int highIndex){
        int count = 0, start = lowIndex, last = midIndex + 1;
        int[] temp = new int[highIndex - start + 1];
        while(start <= midIndex && last<= highIndex){
            temp[count++] = list[start] < list[last] ? list[start++] : list[last++];
        }
        while(start <= midIndex){
            temp[count++] = list[start++];
        }
        while(last <= highIndex){
            temp[count++] = list[last++];
        }
        count = 0;
        while(start <= highIndex){
            list[start++] = temp[count++];
        }
    }

}