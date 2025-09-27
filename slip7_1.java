class Bank {
    int bal;

    Bank(int bal) {
        this.bal = bal;
    }

    int withDraw(int amt) {
        if (amt < bal) {
            bal -= amt;
            return amt;
        }

        return -1;
    }

    int checkBal() {
        return bal;
    }
}

public class slip7_1 {
    public static void main(String args[]) {
        Bank acc = new Bank(1000);

        System.out.println("Check balance" + acc.checkBal());
        System.out.println("Withdraw more ammount" + acc.withDraw(10000));
        System.out.println("Withdraw less ammount" + acc.withDraw(100));
        System.out.println("New balance" + acc.checkBal());
    }
}
