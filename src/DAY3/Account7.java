package DAY3;

public class Account7 {
        String name;
        double balance;

        Account7(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        void display() {
            System.out.println("Account Holder Name is " + this.name);
            System.out.println("Account Balance is " + this.balance);
        }

        public static void main(String[] args) {
            new Account7("TRISHA", 12498920).display();
        }
    }

