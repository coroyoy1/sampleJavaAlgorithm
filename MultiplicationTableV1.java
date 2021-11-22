/*  Multiplication Table Version 1
    Using Array to store value for multiplier and multiplicand
*/
import java.util.Arrays;

public class MultiplicationTableV1 {

    private final int multiplier[] = new int[]{1,2,3,4,5,6,7,8,9,10};
    private final int multiplicand[] =  new int[]{1,2,3,4,5,6,7,8,9,10};
    private final int length = 10;
    private int storeArray[] = new int[10];
    private int increment = 0;

    public static void main(String[] args) {
        MultiplicationTableV1 mt = new MultiplicationTableV1();
        mt.Multiply();
    }

    public void Multiply(){

        int product = 0;
        for(int index = 0; index < length; index++){
            product = multiplier[index] * multiplicand[increment];
            storeArray[index] = product;
        }
        System.out.println(Arrays.toString(storeArray));

        if(!storeArray.equals(null)){
            storeArray = null;
            storeArray = new int[10];
            multiplicand[increment] = increment++;
            if(increment < 0 || increment >= length){
                return;
            }
            Multiply();
        }
    }
}
