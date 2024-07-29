abstract class Deposit {
    public String name;
    public double balance;

    public Deposit(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public abstract void settle(double amount);
    public abstract void withdraw(double amount);
    public abstract void calculateMonthlyInterest();
}
class LongTermDeposit extends Deposit {

    public LongTermDeposit(String owner, double balance) {
        super(owner, balance);
    }

    public void settle(double amount) {
        System.out.println("Deposit is not allowed in long-term deposits.");
    }


    public void withdraw(double amount) {
        System.out.println("Withdrawal is not allowed in long-term deposits.");
    }


    public void calculateMonthlyInterest() {
        double annualInterestRate = 0.20;
        double monthlyInterest = balance * (annualInterestRate / 12);
        balance += monthlyInterest;
        System.out.println("Your monthly interest is: "+balance);
    }
}

class ShortTermDeposit extends Deposit {

    public ShortTermDeposit(String owner, double balance) {
        super(owner, balance);
    }

    public void settle(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount >= 2000) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal. Minimum balance should be 2000.");
        }
    }


    public void calculateMonthlyInterest() {
        double annualInterestRate = 0.10;
        double monthlyInterest = balance * (annualInterestRate / 12);
        balance += monthlyInterest;
        System.out.println("Your monthly interest is: "+balance);
    }
}

class SavingDeposit extends Deposit {

    public SavingDeposit(String owner, double balance) {
        super(owner, balance);
    }


    public void settle(double amount) {
        balance += amount;
    }


    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }


    public void calculateMonthlyInterest() {
        // No interest for saving accounts
    }
}

public class Main {
    public static void main(String[] args) {
        Deposit[] accounts = new Deposit[3];

        accounts[0] = new LongTermDeposit("Mona", 10000);
        accounts[1] = new ShortTermDeposit("Sara", 70000);
        accounts[2] = new SavingDeposit("Hanieh", 20000);

        for (Deposit account : accounts) {
            account.calculateMonthlyInterest();
            System.out.println("Owner: " + account.name + ", Balance: " + account.balance);
        }
    }
}