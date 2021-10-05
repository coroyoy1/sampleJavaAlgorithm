public class stringDisplayJava {

    private int distance = 25;
    public static void main(String[] args) {
        stringDisplayJava sd = new stringDisplayJava();
        System.out.println(sd.displayString());
    }

    String displayString(){
        return "Driven "+distance+" meters";
    }
}
