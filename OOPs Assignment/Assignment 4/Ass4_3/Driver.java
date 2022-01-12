import java.util.*;

class Account {
    String customerName;
    String accountNumber;
    String typeofAccount;

    Account(String customerName, String accountNumber, String typeofAccount) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.typeofAccount = typeofAccount;
    }
}

class Curr_Acct extends Account {
    double currBalance = 0.0;

    Curr_Acct(String customerName, String accountNumber, String typeofAccount) {
        super(customerName, accountNumber, typeofAccount);
    }

    void deposit(double d) {
        currBalance = currBalance + d;
        System.out.println("Amount of Rs: " + d + "/= is deposited to your account.");
    }

    void balance() {
        System.out.println("Current Balance: " + currBalance);
    }

    void withdrawn(double d) {
        if (d > currBalance) {
            System.out.println("Sorry!! Withdrawing money is not possible.");
        } else {
            System.out.println("Rs:" + d + "/=is withdrawn from your current account");
            currBalance = currBalance - d;
            if (currBalance < 1000 && currBalance > 100) {
                currBalance = currBalance - 100;
                System.out.println("Minimum Balancemust be <=1000");
            }
        }
    }
}

class Savn_Acct extends Account {
    double savingBalance = 0.0;
    double t;
    double r = 6 / 100;
    double n = 2;

    Savn_Acct(String customerName, String accountNumber, String typeofAccount) {
        super(customerName, accountNumber, typeofAccount);
    }

    void deposit(double d, int t) {
        savingBalance = savingBalance + d;
        System.out.println("Amount of Rs: " + d + "/= is deposited to your account.");
        interest(t);
    }

    void interest(int t) {
        double x = 1 + r / n;
        double y = Math.pow(x, n * t);
        savingBalance = savingBalance * y;
    }

    void balance() {
        System.out.println("Current Balance: " + savingBalance);
    }

    void withdrawn(double d) {
        if (d > savingBalance) {
            System.out.println("Sorry!! Withdrawing money is not possible.");
        } else {
            System.out.println("Rs:" + d + "/=is withdrawn from your saving account");
            savingBalance = savingBalance - d;
        }
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String cname = sc.nextLine();

        System.out.print("Enter Account Type[Savings Account[SA] or Current Account[CA]]:");
        String typeofAccount = sc.nextLine();

        System.out.print("Enter the Account Number:");
        String accountNumber = sc.nextLine();

        if (typeofAccount.equals("SA")) {
            Savn_Acct sa = new Savn_Acct(cname, accountNumber, typeofAccount);

            while (true) {
                System.out.println("*** Savings Account Options ***");
                System.out.println("1. Deposit");
                System.out.println("2. Balance");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.println("Enter Your Choice: ");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Enter the amount to be deposited: ");
                        double d = sc.nextDouble();

                        System.out.print("Enter the t value: ");
                        int t = sc.nextInt();

                        sa.deposit(d, t);
                        break;

                    case 2:
                        sa.balance();
                        break;
                    case 3:
                        System.out.println("Enter the amount to be withdraw: ");
                        double d1 = sc.nextDouble();
                        sa.withdrawn(d1);
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Wrong choice!!!");
                }
            }

        }

        if (typeofAccount.equals("CA")) {
            Curr_Acct ca = new Curr_Acct(cname, accountNumber, typeofAccount);

            while (true) {
                System.out.println("*** Savings Account Options ***");
                System.out.println("1. Deposit");
                System.out.println("2. Balance");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.println("Enter Your Choice: ");
                int option = sc.nextInt();
                switch (option) {

                    case 1:
                        System.out.print("Enter the amount to be deposited: ");
                        double d = sc.nextDouble();

                        ca.deposit(d);
                        break;

                    case 2:
                        ca.balance();
                        break;
                    case 3:
                        System.out.print("Enter the amount to be withdraw: ");
                        double d1 = sc.nextDouble();
                        ca.withdrawn(d1);
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Wrong choice!!!");
                }
            }
        }
    }
}