// package String;
import java.util.Scanner;
public class string01 {
   
        public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        //                         .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));     //  when 2 parameter --that take-- Inclusive--that means, Print also the index values 
            domain = email.substring(email.indexOf("@") + 1); // If we give only 1 parameter --- that is --starting index -- print till the end of the string .. 

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }

        scanner.close();
    
    }
}
