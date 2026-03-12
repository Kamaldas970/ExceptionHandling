import java.util.*;
public class Exception{
    public static void main(String args[]){
        System.out.println("calC is started");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator");
        int n=sc.nextInt();

        System.out.println("Enter the denomenator");
        int d=sc.nextInt();

        int res  =n/d;
        System.out.println("the result is "+ res + " ");
        System.out.println("The calC is terminated");


    }
}