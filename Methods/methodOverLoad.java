

public class methodOverLoad {
public static void main(String[] args) {
     // overloaded methods = methods that share the same name,
        //                                          but different parameters
        //                                          signature = name + parameters

        String pizza = bakePizza("flat-bread", "mozzarella", "pepperoni");  // call the function
        System.out.println(pizza);

    }
    // overloaded function with -- the same name-- bakePizza 
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
}    
}
