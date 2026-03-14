public class finally2{

   static class sum{

   
        int add(int a, int b){
            try{
            
              return a+b;
            }
            finally{ //we are not handling therefore, no need of catch block
              System.out.println("Sum is done");
            }
    }
    }

    public static void main(String args[]){
        finally2.sum s=new finally2.sum();
        int res=s.add(3,5);
        System.out.println(res);
    }
}