import java.util.*;
public class five {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double x = sc.nextDouble();
        if(x%1 == 0){
            System.out.println("Entered number is a integer");
        }
        else {
            System.out.println("Entered number is not an integer");
        }
        sc.close();
    }
}
