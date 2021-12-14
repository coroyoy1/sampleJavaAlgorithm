package CriminalRecord;

import java.io.IOException;
import java.util.Scanner;

public class MainClass{

    private static CRUDFunction crud = new CRUDFunction();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String choice, cont = "y";
        while(cont.equalsIgnoreCase("y")){
            crud.loopLine();
            System.out.println("===Criminal Records===");
            System.out.println("1 ==> Add Record");
            System.out.println("2 ==> View Record");
            System.out.println("3 ==> Update Record");
            System.out.println("4 ==> Delete Record");
            System.out.println("5 ==> Search Record");
            System.out.println();
            System.out.println("Enter your choice: ");
            choice = input.nextLine();
            if(choice.equals("1")){
                crud.AddRecord();
            }
            else if(choice.equals("2")){
                crud.ViewRecord();
            }
            else if(choice.equals("3")){
                crud.UpdateRecord();
            }
            else if(choice.equals("4")){
                crud.DeleteRecord();
            }
            else if(choice.equals("5")){
                crud.SearchRecord();
            }
            System.out.println("Do you want to continue?");
            cont = input.nextLine();
            crud.loopLine();
        }
    }
}
