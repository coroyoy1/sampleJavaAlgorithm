public class _code_sample {

    static String[] numbers = {"1", "2", "3", "4", "5"};
    static boolean exists = false;
    public static void main(String[] args) {
        String find = "4";
        found(find);
    }   
    private static void found(String find){
        for(String x : numbers){
            if(x == find){
                exists = true;
                break;
            }
        }
        if(exists == true){
            System.out.println("Found: "+find);
        }
        else{
            System.out.println("Not found");
        }
    }
}