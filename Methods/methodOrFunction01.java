

public class methodOrFunction01 {
    public static void main(String[] args) {
        
          // method =  a block of reusable code that is executed when called ()

        //   BELOW WE CALL AND PRINT THE FUNCTION.....
        happyBirthday("Spongebob", 30);
    
       System.out.println( square(3.5));
       System.out.println(cube(4.5));
       System.out.println(getFullName("kanok", "faisal"));
       System.out.println(23);
    }
//  we create other function outside the ---- main function --- as main function is static type,, so, as we create a new function ---which we call from --inside the (static type) main class--- that class type ---also be static... Other everything like : c++ 

/*
static Keyword (2:30): The necessity of using static for methods called from other static methods (like main).

Arguments and Parameters (3:37): How to pass information (arguments) to a method and how methods are set up to receive them (parameters). The importance of matching data types and order is highlighted (7:37).
Return Values (8:23): Methods can return a value, and the video demonstrates how to define a return type (e.g., double, String, boolean) and use the return keyword to send a value back to the calling location.

*/
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }

    }
}
