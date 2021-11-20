import java.util.Arrays;

public class MultiplicationTable {

    final static int number[] = {1,2,3,4,5,6,7,8,9,10};
    final static int length = 10;
    static int multiplyBy1, multiplyBy2, multiplyBy3, 
    multiplyBy4, multiplyBy5, multiplyBy6, multiplyBy7, multiplyBy8 = 0;

    static int multiplyBy1Arr[] = new int[10];
    static int multiplyBy2Arr[] = new int[10];
    static int multiplyBy3Arr[] = new int[10];
    static int multiplyBy4Arr[] = new int[10];
    static int multiplyBy5Arr[] = new int[10];
    static int multiplyBy6Arr[] = new int[10];
    static int multiplyBy7Arr[] = new int[10];
    static int multiplyBy8Arr[] = new int[10];

    public static void main(String[] args) {
        for(int x = 0; x < length; x ++){
            multiplyBy1 = number[x] * number[0];
            multiplyBy2 = number[x] * number[1];
            multiplyBy3 = number[x] * number[2];
            multiplyBy4 = number[x] * number[3];
            multiplyBy5 = number[x] * number[4];
            multiplyBy6 = number[x] * number[5];
            multiplyBy7 = number[x] * number[6];
            multiplyBy8 = number[x] * number[7];

            multiplyBy1Arr[x] = multiplyBy1;
            multiplyBy2Arr[x] = multiplyBy2;
            multiplyBy3Arr[x] = multiplyBy3;
            multiplyBy4Arr[x] = multiplyBy4;
            multiplyBy5Arr[x] = multiplyBy5;
            multiplyBy6Arr[x] = multiplyBy6;
            multiplyBy7Arr[x] = multiplyBy7;
            multiplyBy8Arr[x] = multiplyBy8;
        }

        System.out.println(Arrays.toString(multiplyBy1Arr));
        System.out.println(Arrays.toString(multiplyBy2Arr));
        System.out.println(Arrays.toString(multiplyBy3Arr));
        System.out.println(Arrays.toString(multiplyBy4Arr));
        System.out.println(Arrays.toString(multiplyBy5Arr));
        System.out.println(Arrays.toString(multiplyBy6Arr));
        System.out.println(Arrays.toString(multiplyBy7Arr));
        System.out.println(Arrays.toString(multiplyBy8Arr));
    }
}
