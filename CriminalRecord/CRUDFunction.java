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
        criminalNumber = (int)(Math.random() * 1000000);
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
            getToken[0] = stringTokenizer.nextToken();
            getToken[1] = stringTokenizer.nextToken();
            getToken[2] = stringTokenizer.nextToken();
            getToken[3] = stringTokenizer.nextToken();
            getToken[4] = stringTokenizer.nextToken();
            System.out.println(getToken[0] + "\t\t" +getToken[1]+"\t\t"+
            getToken[2]+"\t\t"+getToken[3]+"\t\t"+getToken[4]);
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
            stringTokenizer = new StringTokenizer(record, ",");
            if(record.contains(String.valueOf(criminalNumber))){
                getToken[0] = stringTokenizer.nextToken();
                getToken[1] = stringTokenizer.nextToken();
                getToken[2] = stringTokenizer.nextToken();
                getToken[3] = stringTokenizer.nextToken();
                getToken[4] = stringTokenizer.nextToken();
                System.out.println(getToken[0] + "\t\t" +getToken[1]+"\t\t"+
                getToken[2]+"\t\t"+getToken[3]+"\t\t"+getToken[4]);
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

    public void loopLine(){
        for(int index = 0; index < 2; index++){
            System.out.println();
        }
    }
}
