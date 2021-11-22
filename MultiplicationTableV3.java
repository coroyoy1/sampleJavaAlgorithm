/*  Multiplication Table Version 3
    Using only [for loop]
*/

public class MultiplicationTableV3 {
    
    private int multiplier;
    private int multiplicand;
    private int product;
    private final int length = 10;
    
    public static void main(String[] args) {
        MultiplicationTableV3 mt = new MultiplicationTableV3();
        mt.Multiply();
    }

    public void Multiply(){
        for(multiplier = 1; multiplier <= length; multiplier++){
            for(multiplicand = 1; multiplicand <= length; multiplicand++){
                product = multiplier * multiplicand;
                System.out.print(product + "\t");
            }
            System.out.println();
        }
    }
}
