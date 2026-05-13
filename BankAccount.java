class BankAccount {

    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println(name + " Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount("Shyam", 5000);

        b.deposit(2000);
        b.withdraw(1000);

        b.display();
    }
}
