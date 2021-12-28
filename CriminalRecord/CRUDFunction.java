package CriminalRecord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CRUDFunction{

    private File path = new File("D:/Users/Coroy/Documents/2samplecode/sampleJava/CriminalRecord/file/CriminalRecordDatabase.txt");
    private File tempPath = new File("D:/Users/Coroy/Documents/2samplecode/sampleJava/CriminalRecord/file/CriminalRecordDatabase_temp.txt");
    private Scanner input = new Scanner(System.in);
    private String getToken[] = new String[5];
    private String criminalName, criminalDate, criminalCharge, criminalConvict;
    private int criminalNumber;

    public void AddRecord() throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
        criminalNumber = (int)(Math.random() * 99999999);
        System.out.println("Name of the Criminal?: ");
        criminalName = input.nextLine();
        System.out.println("Date arrested?: ");
        criminalDate = input.nextLine();
        System.out.println("Criminal Charge?: ");
        criminalCharge = input.nextLine();
        System.out.println("Criminal Conviction?: ");
        criminalConvict = input.nextLine();

        bufferedWriter.write(criminalNumber+","+criminalName+","+criminalDate+","+criminalCharge+","+criminalConvict);
        bufferedWriter.flush();
        bufferedWriter.newLine();
        bufferedWriter.close();
        System.out.println("Successfully Add New Record!");
        loopLine();
    }

    public void ViewRecord() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String record;
        StringTokenizer stringTokenizer;
        loopLine();
        while((record = bufferedReader.readLine()) != null){
            stringTokenizer = new StringTokenizer(record, ",");
            for(int index = 0; index < getToken.length; index++){
                getToken[index] = stringTokenizer.nextToken();
                System.out.print(getToken[index] + "\t");
            }
            System.out.println();
        }
        loopLine();
        bufferedReader.close();
    }

    public void UpdateRecord() throws IOException{
        int criminalNumber = 0;
        String criminalName, criminalDate, criminalCharge, criminalConvict;
        boolean isExists = false;
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String record, record2;
        StringTokenizer stringTokenizer;

        System.out.println("Enter Criminal Number: ");
        criminalNumber = input.nextInt();
        loopLine();
        while((record = bufferedReader.readLine()) != null){
            if(record.contains(String.valueOf(criminalNumber))){
                stringTokenizer = new StringTokenizer(record, ",");
                for(int index = 0; index < getToken.length; index++){
                    getToken[index] = stringTokenizer.nextToken();
                    System.out.print(getToken[index] + "\t");
                }
                System.out.println();
                isExists = true;
            }
        }
        loopLine();
        bufferedReader.close();
        if(isExists == false){
            System.out.println("This Criminal Number is not exists!");
            return;
        }
        input.nextLine();
        System.out.println("Update Criminal Name: ");
        criminalName = input.nextLine();
        System.out.println("Update Date Arrested: ");
        criminalDate = input.nextLine();
        System.out.println("Update Criminal Charge: ");
        criminalCharge = input.nextLine();
        System.out.println("Update Criminal Convict: ");
        criminalConvict = input.nextLine();

        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(path));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempPath));

        while((record2 = bufferedReader2.readLine()) != null){
            if(record2.contains(String.valueOf(criminalNumber))){
                bufferedWriter.write(criminalNumber+","+criminalName+","+criminalDate+","+criminalCharge+","+criminalConvict);
            }
            else{
                bufferedWriter.write(record2);
            }
            bufferedWriter.flush();
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader2.close();
        path.delete();
        boolean success = tempPath.renameTo(path);
        loopLine();
        if(success == true){
            System.out.println("Successfully Update Record");
        }
        loopLine();
    }

    public void SearchRecord() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String record;
        StringTokenizer stringTokenizer;
        boolean isExists = false;

        System.out.println("Enter a Criminal Number: ");
        criminalNumber = input.nextInt();
        
        loopLine();
        while((record = bufferedReader.readLine()) != null){
            stringTokenizer = new StringTokenizer(record, ",");
            if(record.contains(String.valueOf(criminalNumber))){
                for(int index = 0; index < getToken.length; index++){
                    getToken[index] = stringTokenizer.nextToken();
                    System.out.print(getToken[index] + "\t");
                }
                System.out.println();
                isExists = true;
            }
        }
        bufferedReader.close();
        if(isExists == false){
            System.out.println("This Criminal Number in the Record is not found");
        }
        loopLine();
    }

    public void DeleteRecord() throws IOException{
        String record, accept = "y";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempPath));
        boolean isExists = false;
        
        loopLine();
        System.out.println("Enter a Criminal Record: ");
        criminalNumber = input.nextInt();
        while((record = bufferedReader.readLine()) != null){
            if(record.contains(String.valueOf(criminalNumber))){
                isExists = true;
                input.nextLine();
                System.out.println("Do you want to delete the record? (Y/N)");
                accept = input.nextLine();
                if(accept.equalsIgnoreCase("y")){
                    System.out.println("Criminal Number with Record is successfully deleted!");
                    continue;
                }
            }
            bufferedWriter.write(record);
            bufferedWriter.flush();
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
        path.delete();
        tempPath.renameTo(path);
        if(isExists == false){
            System.out.println("This Criminal Number does not exists in the Record");
        }
        loopLine();
    }

    public void loopLine(){
        for(int index = 0; index < 2; index++){
            System.out.println();
        }
    }
}
