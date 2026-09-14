import java.util.*;

class MessWalletB7Q {
    private double balance;

    public MessWalletB7Q(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Negative opening balance. Starting at 0.");
            balance = 0;
        } else {
            balance = openingBalance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: invalid amount");
        } else {
            balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else if (amount <= 0) {
            System.out.println("Deduct rejected: invalid amount");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class HostelMessWalletM2R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double opening = sc.nextDouble();
        double topUpAmount = sc.nextDouble();
        double deductAmount = sc.nextDouble();

        MessWalletB7Q wallet = new MessWalletB7Q(opening);

        wallet.topUp(topUpAmount);
        wallet.deduct(deductAmount);

        System.out.println("Final balance: " + wallet.getBalance());
    }
}