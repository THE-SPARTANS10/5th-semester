class BankAccount {
    String nameOfTheDepositor;
    int accountNumber;
    String typeOfAccount;
    int accountBalance;

    void initVariables(String nameOfTheDepositor, int accountNumber, String typeOfAccount, int accountBalance) {
        this.nameOfTheDepositor=nameOfTheDepositor;
        this.accountBalance=accountBalance;
        this.typeOfAccount=typeOfAccount;
        this.accountBalance=accountBalance;
    }

    void deposite(int amount) {
        accountBalance=accountBalance+amount;
    }

    void withdraw(int amount) {
        System.out.println("Current balance: "+accountBalance);
        accountBalance=accountBalance-amount;
        if(accountBalance<0) {
            System.out.println("Balance can't be negative");
        } else {
            System.out.println("Currently balance after widrawing: "+accountBalance);
        }
    }

    void show() {
        System.out.println("Name: "+nameOfTheDepositor+"\nBalance: "+accountBalance);
    }
}

class Test {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.initVariables("Supratim Bhattacharjee",123456789,"Savings",678);
        ba.show();
        System.out.println("Current balance: "+ba.accountBalance);
        ba.deposite(180);
        ba.withdraw(34);
    }
}