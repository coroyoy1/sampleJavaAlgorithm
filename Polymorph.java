public class Polymorph {
    public static void main(String[] args) {
        Polymorph polymorph = new Polymorph();
        System.out.println("Integer: " + polymorph.Add(1, 2));
        System.out.println("Float: " + polymorph.Add(1.9, 2.5));
        System.out.println("Double: " + polymorph.Add(1.91, 2.55));
    }

    //Float
    public float Add(float number1, float number2){
        float result = number1 + number2;
        return result;
    }

    //Integer
    public int Add(int number1, int number2){
        int result = number1 + number2;
        return result;
    }

    //Double
    public double Add(double number1, double number2){
        double result = number1 + number2;
        return result;
    }
}
