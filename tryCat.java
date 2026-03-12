import java.util.*;
public class tryCat{
    public static void main(String args[])
    {
        System.out.println("calC is startted");
Scanner sc=new Scanner(System.in);

System.out.println("Enter the numerator");
int n=sc.nextInt();
System.out.println("Enter the denomenator");
int d=sc.nextInt();
try{
    int res=n/d;
    System.out.println("The result is : " + res);
}
catch(ArithmeticException e){
    System.out.println("Ente the non-zero denominator");
}
    }
}