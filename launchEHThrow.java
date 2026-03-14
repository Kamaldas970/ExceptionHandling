import java.util.*;

public class launchThrow{

static class demo{
    void divide(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator");
        int n=sc.nextInt();

        System.out.println("Enter the denominator");
        int d=sc.nextInt();
       int res=n/d;
       System.out.println("The result is : " + res);
        System.out.println("The calC is terminated");
    }

    void display(){
        demo d=new demo();
        try{
        d.divide();
        }
          catch(ArithmeticException e){
            System.out.println("kindly enter the non-Zero integer");
        }
    }
}

    public static void main(String args[]){
        launchThrow.demo d=  new launchThrow.demo();
       
        d.display();
        
      
    }
}