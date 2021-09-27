import java.util.Scanner;

public class personSetGetterMain {

    static personSetGet person = new personSetGet();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        person.setName(name);
        System.out.println("Your name is: "+ person.getName());
    }
}
