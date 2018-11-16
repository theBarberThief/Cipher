import java.util.*;

public class ImitationGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to encrypt or decrypt you code? 1. Encrypt   2. Decrypt");
        int choice = scan.nextInt();

            System.out.println("Enter the word");
            scan.nextLine();
            String word = scan.nextLine();

            System.out.println("Choose key 1");
            int key1 = scan.nextInt();


            System.out.println("Choose key 2");
            int key2 = scan.nextInt();

            if(choice == 1) {


                Cipher ciph = new Cipher(word, key1, key2);
            }

            else{
                Decipher deciph = new Decipher(word, key1, key2);
            }



    }
}