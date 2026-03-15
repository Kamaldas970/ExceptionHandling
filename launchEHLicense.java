import java.util.*;

class UnderAgeException extends java.lang.Exception{
    public UnderAgeException(String msg){
        super(msg);
        
    }

}

class OverAgeException extends java.lang.Exception{
     public OverAgeException(String msg){
        super(msg);
        
    }

}

class Applicant{
    int age;
   
   void input()  {
    System.out.println("Application is proceeding ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Kindly enter the age ");
    this.age=sc.nextInt();
   
   }
   void verify() throws UnderAgeException, OverAgeException{
    if(age>=18 && age<70){
        System.out.println("Application will proceed for further verification");
    }
    else if(age<18) {
        throw new UnderAgeException("Application will not further proceed, Minor");
    }
    else{
        throw new OverAgeException("Please be patience sir, will need some more time");
    }
   }

}

class License{

    void initiate(){
        Applicant ap=new Applicant();
       try{
         ap.input();
        ap.verify();
       }
       catch(UnderAgeException | OverAgeException t){
          try{
         ap.input();
        ap.verify();
       }
       catch(UnderAgeException | OverAgeException tt){
          try{
         ap.input();
        ap.verify();
       }
       catch(UnderAgeException | OverAgeException ttt){
        System.out.println("Blocked from govt");


       }


       }


       }
    }

}
public class launchEHLicense{
    public static void main(String args[]){

        License in= new License();
        in.initiate();
        
    }
}
