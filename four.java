import java.util.*;
public class four {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in km: ");
        float km = sc.nextFloat();
        float dis = km/1.60934f;
        System.out.println("The distance in miles is "+dis);
        sc.close();
    }
}
