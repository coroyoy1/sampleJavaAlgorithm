import java.util.ArrayList;

public class FindNotEqualNumbers {
    
    private int targetNumber = 0;
    
    public static void main(String args[]) {
        FindNotEqualNumbers callClass = new FindNotEqualNumbers();
        callClass.targetNumber = callClass.generateNumber();
        System.out.println(callClass.targetNumber + ": Target Number");
        System.out.println("---");
        callClass.resulter();
    }
    
    private int generateNumber(){
        int generate = (int)(Math.random() * 2);
        return generate;
    }
    
    private ArrayList<Integer> storeNumbers(){
        FindNotEqualNumbers myClass = new FindNotEqualNumbers();
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        for(int index = 0; index < 1000; index++){
            listNumbers.add(myClass.generateNumber());
        }
        return listNumbers;
    }
    
    private void resulter(){
        try{
            FindNotEqualNumbers myClass = new FindNotEqualNumbers();
            ArrayList<Integer> listOfStoreNumbers = myClass.storeNumbers();
            for(int generatedNumber : listOfStoreNumbers){
              if(generatedNumber == targetNumber){
                  System.out.println(generatedNumber + ": Duplicate detected");
                  myClass.generateNumber();
              }
              else{
                System.out.println("---");
                System.out.println(generatedNumber + ": Success - No duplicate number");
                return;
              }
            }
            System.out.println("Faild to catch");
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
