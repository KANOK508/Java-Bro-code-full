import java.util.Scanner;

public class math03 {
     public static void main(String[] args) {
  
         // ---------Evaluate the Math Formula using --- Math class.......

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm²\n", area);
        System.out.printf("The volume is: %.1fcm³\n", volume);

       System.out.println(Math.sin(60));
        scanner.close();
    }
}
