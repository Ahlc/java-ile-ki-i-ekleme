import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;


abstract class ÜyeYazıcı{
    public static void ÜyeYazıcı(String name, String surname, String email){

    }
}
class ElitÜyeYazıcı extends ÜyeYazıcı {
    public static void ÜyeYazıcı(String name, String surname, String email) {
        try {
            // create a new file named "elitÜyeler" in the current directory
            FileWriter writer = new FileWriter("elitÜyeler", true);

            // write the name, surname, and email to the file
            writer.write(name + "_" + surname + "_" + email + "\n");

            // close the writer to free up resources
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
class GenelÜyeYazıcı extends ÜyeYazıcı{

     public static void ÜyeYazıcı(String name, String surname, String email) {
         try {
             // create a new file named "genelÜyeler" in the current directory
             FileWriter writer = new FileWriter("genelÜyeler", true);

             // write the name, surname, and email to the file
             writer.write(name + "_" + surname + "_" + email + "\n");

             // close the writer to free up resources
             writer.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
}



    public class Main {
        static String[] elitÜyeler = new String[50];
        static String[] genelÜyeler = new String[50];
        static int i, j;
        public static void main(String[] args) {
            System.out.println("1: elit üye ekleme");
            System.out.println("2: genel üye ekleme");
            System.out.println("3: mail gönderme");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            int choice1;
            String name;
            String surname;
            String email;
            if (choice == 1) {
                System.out.println("isim soyisim ve email giriniz");
                name = scanner.next();
                surname = scanner.next();
                email = scanner.next();
                elitÜyeler[i] = email;
               ElitÜyeYazıcı.ÜyeYazıcı(name,surname,email);
               i++;
            }
            if (choice == 2) {
                System.out.println("isim,soyisim ve email giriniz");
                name = scanner.next();
                surname = scanner.next();
                email = scanner.next();
                genelÜyeler[j] = email;
                GenelÜyeYazıcı.ÜyeYazıcı(name,surname,email);
                j++;
            }
            if (choice == 3) {
                System.out.println("1:elit üyelere mail");
                System.out.println("2:genel üyelere mail");
                System.out.println("3:bütün üyelere mail");
                choice1 = scanner.nextInt();
                if (choice1 == 1){

                }
            }
        }
    }

