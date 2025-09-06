public class BankAccount {
    private final String accountHolder;
    private final int accountNumber;
    private final int pin;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, int pin, double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.pin=pin;
        this.balance=balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public boolean verifyPin(int pin){
       return this.pin==pin;
    }


    public double getBalance(){
        return balance;
    }

    public  int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder.toUpperCase();
    }

    public  void withdraw(double amount){
        if(amount>balance){
            System.out.println("insufficient balance");
        }else {
            balance -= amount;
            System.out.println("withdraw success. New balance: " + getBalance());
        }
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposit successful. New balance: " + getBalance());
        }else {
            System.out.println("Invalid amount");
        }
    }

}
