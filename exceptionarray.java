import java.util.*;
public class exceptionarray{
    public static void main(String args[]){
        System.out.println("calC is started");
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter the numerator");
        int n=sc.nextInt();

        System.out.println("Enter the denomenator");
        int d=sc.nextInt();

        int res  =n/d;
        System.out.println("the result is "+ res + " ");
        }
         catch(ArithmeticException e){
        System.out.println("Kindly enter the non-zero denomenator");
       }
     
      
        System.out.println("The calC is terminated");

        try{
        System.out.println("Enter the size of an array");
       int size=sc.nextInt();

       System.out.println("Enter the data");
       int arr[]=new int[size];
       int data=sc.nextInt();
       

       System.out.println("Enter the position of index");
       int index=sc.nextInt();
       
       arr[index]=data;
       }
      

       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Kindly enter the position wrt size");
       }
         catch(NegativeArraySizeException e){
        System.out.println("Kindly enter the positive integer");
       }
         System.out.println("The APP is terminated");
        



    }
}
