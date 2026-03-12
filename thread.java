public class thread{
    public static void main(String args[]){
        System.out.println("Hello World");
        try{
            Thread.sleep( 5000);
        }
        catch(InterruptedException e){
            System.out.println("Something is happened");
        }
         System.out.println("Hello World");

    }
}