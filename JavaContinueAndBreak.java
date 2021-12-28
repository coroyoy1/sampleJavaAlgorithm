public class JavaContinueAndBreak {
    public static void main(String[] args) {
        int index = 0;
        while(index < 20){
            index++;
            if(index % 2 == 0){
                continue; //Skips each iteration if the number can be divisible by 2
            }
            System.out.print(index);
            if(index == 13){
                System.out.print("\t" + "Stop"); 
                break; //Break if the number is equal to 13
            }
            System.out.print("\t" + "Pass"); // Pass if the numbers are not divisible by 2 or equal to 13
            System.out.println();
        }
    }
}
