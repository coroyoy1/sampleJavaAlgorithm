import java.util.Scanner;

enum CONVERT_TO_METER{

    CENTIMETER(0.01),
    INCH(0.0254),
    FOOT(0.3048),
    YARD(0.9144),
    MILE(0.0000254),
    KILOMETER(1000);

    public final double METER_VALUE;
    public double getValue(){
        return this.METER_VALUE; 
    }
    private CONVERT_TO_METER(double METER_VALUE){
        this.METER_VALUE = METER_VALUE;
    }
}

public class MeterConversion {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CONVERT_TO_METER[] byMeter = CONVERT_TO_METER.values();
        
        String name = "";
        double value = 0.00;
        double result = 0.00;

        System.out.println("Enter Measurement: ");
        name = input.nextLine();
        System.out.println("Enter how many meters: ");
        value = input.nextDouble();
        boolean isExists = false;

        for(CONVERT_TO_METER eachMeter : byMeter){
            if(eachMeter.name().toLowerCase().equals(name.toLowerCase())){
                result = eachMeter.getValue() * value;
                isExists = true;
            }
        }
        if(!isExists){
            System.out.println("Measurement doesn't exists!");
            return;
        }
        System.out.println();
        System.out.println(name.toUpperCase() + " " + "to METER: " +result);
    }
}
