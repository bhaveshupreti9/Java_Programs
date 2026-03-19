import java.util.*;
public class one{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a+b+c)/3.0f;
        float cgpa = avg/9.5f;
        System.out.println("The CGPA is "+cgpa);
        sc.close();
    }
}
