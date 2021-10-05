import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SendTextMySQL {
    static final String DB_URL = "jdbc:mysql://localhost/senttext";
    static final String USER = "root";
    static final String PASS = "1234";
    static SendTextMySQL sendtext = new SendTextMySQL();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        sendtext.selection();
    }

    private void selection(){
        for(int index = 0; index < 2; index++){
            System.out.println(); 
        }
        String text;
        int select = 0;
        System.out.println("Select option: ");
        select = scan.nextInt();
        switch(select){
            case 1: 
                System.out.println();
                System.out.println("Type your text: ");
                text = scan.next();
                text += scan.nextLine();
                insertText(text);
                sendtext.selection();
                break;
            case 2:
                System.out.println();
                displayText();
                sendtext.selection();
                break;
            case 3:
                System.out.println();
                System.out.println("Search text: ");
                text = scan.next();
                text += scan.nextLine();
                displaySpecificWord(text);
                sendtext.selection();
                break;
            default:
                System.out.println();
                System.out.println("Nothing to display");
                sendtext.selection();
                break;
        }
    }

    private static void insertText(String text){
     try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();) 
        {       
            String sql = "INSERT INTO text (text) VALUES ('"+text+"')";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void displayText(){
      String QUERY = "SELECT * FROM text";
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);) 
        {		      
            if(!rs.isBeforeFirst()){
                System.out.println("Empty");
            }
            else{
                while(rs.next()){
                    System.out.println(rs.getString("text"));
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    private static void displaySpecificWord(String word){
        String QUERY = "SELECT * FROM text";
        String text = "";
        boolean flag = false;
          try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(QUERY);) 
          {		      
              if(!rs.isBeforeFirst()){
                  System.out.println("Empty");
              }
              else{
                System.out.println();
                System.out.println("List of text: ");
                while(rs.next()){
                    text = rs.getString("text");
                    if(text.toUpperCase().contains(word.toUpperCase())){
                        System.out.println(rs.getString("text"));
                        flag = true;
                    }
                }
              }
            rs.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
          if(!flag){
            System.out.println("Not found");
          }
      }
}
