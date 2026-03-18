import java.util.*;
public class one{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The sum of the 3 entered numbers is "+(a+b+c));
        sc.close();
    }
}