// package java input;

import java.util.Scanner; 
//  a-- java package all wrods are lower-case

// No difference between using intellij or VS code 
//------------------------------------------------------------------------
//  The class --- name must be same as : file name 
public class input_01 {
    
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);      // ------Create a Object or Class or A thing ... Below we get it's attributes... 
    // class    object

       System.out.print("What is your gpa: ");
       double gpa = scanner.nextDouble();
       // When we take 5 and hit Enter... that is "\n"  --- Actually it takes ---the [ nextLine() --which take string input,, as "\n" is also, a string...
       //  for solve the problem : we add an extra ,   scanner.nextLine() -- so, that --take, the "\n"... And --not any white space remain.... 
       //]
       scanner.nextLine();   // it takes  "\n"
       
     // Before --- taking string input using [ nextLine() -- ]--  use scanner.nextLine() .... for skip white spaces... 
       System.out.print("Enter your name: ");
       String name = scanner.nextLine();            //  nextLine is for take string input

       System.out.print("Enter your age: ");
       int age = scanner.nextInt();                  //  nextInt for , integer input ..

       

       System.out.println("Are you a student? (true/false): ");
       boolean isStudent = scanner.nextBoolean();

       System.out.println("Hello " + name);
       System.out.println("You are " + age + " years old");
       System.out.println("Your gpa is: " + gpa);

       if(isStudent){
           System.out.println("You are enrolled in classes");
       }
       else{
           System.out.println("You are NOT enrolled in classes");
      }

       scanner.close();   // close the object after work
   }
}

