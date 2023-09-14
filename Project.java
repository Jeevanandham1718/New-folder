import java.util.Scanner;
class Account{
       Scanner s=new Scanner(System.in);
       int pin=0;
       double cash=0;
       int pin1=1010;
       double wd=0;
    int deposit(){
        System.out.println("Enter your pin number");
        pin=s.nextInt();
         
        if(pin==pin1){
        System.out.println("Enter the amount to be deposit");
        double d=s.nextDouble();
        cash=cash+d;
        System.out.println("Amount deposited successfully");
        }
        else{
            System.out.println("Enter correct pin number");
        }
         


        return 0;
        
    }
    int check(){
        System.out.println("Enter the pin number");
        pin=s.nextInt();
        if(pin==pin1){
            System.out.println(cash-wd);
        }
        return 0;
    }
    int withdraw(){
        System.out.println("Enter the pin number");
           pin=s.nextInt();
        if(pin==pin1){
             System.out.println("Enter the amount to be withdrawn");
              wd=s.nextDouble();
             if(cash>=wd){
                System.out.println("Your amount has been withdrawn");
             }
             else{
                System.out.println("Insufficient Balance");
             }
             
        }
         return 0;

    }
}



public class Project {
    public static void main(String[] args) {
      Account s1=new Account();
      s1.deposit();
      s1.check();
      s1.withdraw();
        
    }
}
