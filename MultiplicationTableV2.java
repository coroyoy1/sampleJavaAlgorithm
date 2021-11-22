/*  Multiplication Table Version 2
    Without using Array for multiplier and multiplicand
*/

import java.util.Arrays;

public class MultiplicationTableV2 {

    private int multiplier = 1;
    private int multiplicand = 1;
    private int product = 0;
    private final int length = 10;
    private int storeArray[] = new int[10];

    public static void main(String[] args) {
        MultiplicationTableV2 mt = new MultiplicationTableV2();
        mt.Multiply();
    }

    public void Multiply(){
        
        for(int increment = 0; increment < length; increment++){
            product = multiplier * multiplicand;
            storeArray[increment] = product;
            multiplier++;
        }
        System.out.println(Arrays.toString(storeArray));

        if(!storeArray.equals(null)){
            storeArray = null;
            storeArray = new int[10];
            if(multiplier > length){
                multiplier = 1;
            }
            multiplicand++;
            if(multiplicand > length){
                return;
            }
            Multiply();
        }
    }
}
