import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankDatabase db = new BankDatabase();

        db.addAccount(new BankAccount("rupjyoti",123456789,1234,500));
        db.addAccount(new BankAccount("nitish",789456123,4321,100));

        ATM atm = new ATM(db);
        atm.start();
    }
}
