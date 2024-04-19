import java.util.Scanner;

public class bank{

public static void main(String[]args){
Scanner input = new Scanner(System.in);
int acount_amount=1000;

int password =12345;
System.out.println("Enter you password :");
int enter_password =input.nextInt();
boolean step =true;
boolean agin =true;

if(enter_password==password){
do{
   do{
   System.out.println("---------------------------------------------------------------- ");
   
   System.out.println("welcome ,khalid ");
   System.out.println("  ");
   System.out.println("what service you want today : ");
   System.out.println("-Withdrawal ");
   System.out.println("-deposit");
   System.out.println("-transfer");
   System.out.println("-EXIT ");

   
   String prossing =input.next();
   if (prossing.equals("EXIT")){
   step=false;
   }
   if(prossing.equals("Withdrawal")){
   System.out.println("how much you want :");
   int Withdrawal_amount = input.nextInt();
      if(Withdrawal_amount<=acount_amount){
      acount_amount -=Withdrawal_amount;
      System.out.println("Your withdrawal has been successful, your balance is"+acount_amount);
      step=false;
      }else{
      System.out.println("The amount you want is more than your balance");
      step=false;
      }
   }
   
   if(prossing.equals("deposit")){
      System.out.println("How much amount do you want to deposit  your account?");
      int deposit_amount=input.nextInt();
      acount_amount +=deposit_amount;
      System.out.println("Your new balance is :"+acount_amount);
     step=false;
   
     }
     
   if(prossing.equals("transfer")){
   System.out.println("Do you want an international or local transfer ?");
   String transfer_type =input.next();
    
    if(transfer_type.equals("international")){
    System.out.println(" Type the account number you want to transfer to ");
    System.out.println("NOTE : A number consisting of ten digits :"); 
    int international_account =input.nextInt();
    String check_international_account =String.valueOf(international_account);
    int international_Attempts =0;
       while(international_Attempts<3 && check_international_account.length()==10){
       System.out.println(" How much amount do you want to transfer  ?");
       int transfer_international_amount = input.nextInt();
          if(transfer_international_amount<acount_amount){

          int after_international_transfer =acount_amount-transfer_international_amount;
          System.out.println(" The amount has been transferred. Your balance is new  :"+after_international_transfer);
          System.out.println("NOTE : International transfer takes three working days ");
          international_Attempts =4;
          }else{
           System.out.println("An amount greater than your balance ");
          }
       
   
       }
   
  
    
    }
   if(transfer_type.equals("localtransfer")){
      System.out.println(" Type the account number you want to transfer to ");
      System.out.println("NOTE : A number consisting of ten digits :");
      int local_transfer_account=input.nextInt();
      String local_transfer_account_string =String.valueOf(local_transfer_account);
         if(local_transfer_account_string.length()==10){
         System.out.println("How much amount do you want to transfer  ?");
         int local_transfer_amount=input.nextInt();
          acount_amount -=local_transfer_amount ;
         System.out.println("Your transfer has been successful, your balance is"+acount_amount);
         step=false;
          
         }else{
         System.out.println("Incorrect account number");
         }
      
      }
   }
   
   
   
   }while(step);
         System.out.println("do you want some thing else (yes /no) :");
         String want =input.next();
         if(want.equals("yes")){
         step=true;
         }else if(want.equals("no")){
         step=false;
         System.out.println("Thank you for using our service");

         }
         

}while(agin); 




}else{
System.out.println("you password wrong ");


}





}


}