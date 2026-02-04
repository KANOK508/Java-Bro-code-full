import java.util.Arrays;
public class array01 {
public static void main(String[] args) {
    // How to declare an array in java....
    String[] frutes = { "apple","banana","mango"};  


    // System.out.println(frutes);    --  array is an object --so ---it print the reference or string address... (as string array)
    //  [Ljava.lang.String;@372f7a8d   
     
    // -------------------------------
    System.out.println(frutes[2]);

    frutes[2] ="Piyara"; // java array is mutable 
    System.out.println(frutes[2]);
    for (int i=0;i<frutes.length;i++){             //  for find a length --- use arrName.length  function only...k
        System.out.println(frutes[i]);
    }

    Arrays.sort(frutes);
    for (String str : frutes){
        System.out.print(str + " ");
    }
System.out.println();
    // Arrays.fill(args, frutes);
    Arrays.fill(frutes,"pineApple");

    for (String str: frutes){
        System.out.print(str+" ");
    }

    String[] food = new String[3];   //  create  x size string 
    food[0]="potato";
    food[1] = "Alu";
    food[2] = "onion";
    for (String fod : food){
        System.out.println(fod+ " ");
    }
}    
}
