import java.util.Scanner;

public class ATM {

    private BankDatabase bankDatabase;
    public  ATM(BankDatabase bankDatabase){
        this.bankDatabase=bankDatabase;
    }


    Scanner sc = new Scanner(System.in);
    public void start(){
        System.out.println("WELCOME TO ATM SYSTEM");
        System.out.println("PRESS 0 TO SHUTDOWN THE SYSTEM");

        System.out.println();

        while (true){

            System.out.println("Enter your account number");
            int accNum = sc.nextInt();
            if(accNum == 0){
                return;
            }


            BankAccount account = bankDatabase.getAccount(accNum);
            if(account == null){
                System.out.println("Account not found");
                continue;
            }
                System.out.println("Enter your pin");
                int pin = sc.nextInt();

                if(!account.verifyPin(pin)) {
                    System.out.println("Invalid pin");
                    continue;
                }


                boolean isLoggedIn = true;
                while (isLoggedIn){
                    System.out.println("HELLO " + account.getAccountHolder());
                    System.out.println("PLEASE CHOOSE AN OPTION ");
                    System.out.println(
                            "1: CHECK BALANCE \n" +
                                    "2: WITHDRAW AMOUNT \n" +
                                    "3: DEPOSIT AMOUNT \n" +
                                    "4: INFO \n" +
                                    "5: EXIT");
                    int opt = sc.nextInt();

                    switch (opt){
                        case 1:
                            System.out.println("BALANCE: " + account.getBalance());
                            break;

                        case 2:
                            System.out.println("ENTER THE WITHDRAW AMOUNT: ");
                            double withdrawAmount = sc.nextDouble();
                            account.withdraw(withdrawAmount);
                            break;

                        case 3:
                            System.out.println("ENTER TEH DEPOSIT AMOUNT: ");
                            double depositAmount = sc.nextDouble();
                            account.deposit(depositAmount);
                            break;

                        case 4:
                            System.out.println(account.toString());
                            break;


                        case 5:
                            System.out.println("THANK YOU VISIT AGAIN");
                            isLoggedIn=false;
                            break;

                        default:
                            System.out.println("INVALID INPUT. TRY AGAIN");
                    }


                }





        }
    }
}
