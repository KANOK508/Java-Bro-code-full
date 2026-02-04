import java.util.Scanner;

public class userInputInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*    String[] food = new String[3];   //  create  x size string  ( the size is given here .. )
    food[0]="potato";
    food[1] = "Alu";
    food[2] = "onion";
    for (String fod : food){
        System.out.println(fod+ " ");
    }
         */

    // we create a string that can take --- using given size input and work --- 
        String[] foods;
        int size;

        System.out.print("What number  of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();  // ----------that line clear the input buffer line----- (when we take integer value and then Sting value... After take integer value--use >>>>>   scanner.nextLine() for ---clear the input buffer ---- for ex:   1 and enter ....)

        foods = new String[size];    //  dynamically give the size 

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
