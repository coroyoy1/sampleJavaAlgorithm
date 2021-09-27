
public class staticAndNonStatic {

    public static void main(String[] args) {     
        staticMethod();

        staticAndNonStatic getNonStat = new staticAndNonStatic();
        getNonStat.nonStatMethod();
    }

    public void nonStatMethod(){
        System.out.println("Non-Static Method");
    }

    public static void staticMethod(){
        System.out.println("Static Method");
    }
    
}