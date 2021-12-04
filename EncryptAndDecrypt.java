import java.util.ArrayList;
import java.util.Scanner;

public class EncryptAndDecrypt {

    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        EncryptAndDecrypt ed = new EncryptAndDecrypt();
        final int KEY = 10000;
        
        String text = ed.inputString();

        ed.insertLine();
        System.out.println("Encrypt: " + ed.Encrypt(text, KEY));
        ed.insertLine();
        String encryptString = ed.Encrypt(text, KEY);
        System.out.println("Decrypt: " + ed.Decrypt(encryptString, KEY));
        ed.insertLine();
    }

    private String inputString(){
        System.out.println("Enter Text: ");
        String text = input.next();
        text += input.nextLine();
        return text;
    }

    private String Encrypt(String text, int KEY){
        ArrayList<String> encryptString = new ArrayList<String>();
        char[] eachText = text.toCharArray();
        for(char letter : eachText){
            letter += KEY;
            encryptString.add(String.valueOf(letter));
        }
        String joinEncrypt = String.join("", encryptString);
        return joinEncrypt;
    }

    private String Decrypt(String joinEncrypt, int KEY){
        ArrayList<String> decryptString = new ArrayList<String>();
        char[] eachText = joinEncrypt.toCharArray();
        for(char letter : eachText){
            letter -= KEY;
            decryptString.add(String.valueOf(letter));
        }
        String joinDecrypt = String.join("", decryptString);
        return joinDecrypt;
    }

    public void insertLine(){
        for(int index = 0; index < 5; index++){
            System.out.println();
        }
    }
}
