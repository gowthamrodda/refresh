package banking;

/***
 *  Atm class should perform following transactions
 *  1. load bulk money on init
 *  2. perform withdraw
 *  3. perform deposit
 *  4. perform balance check
 */
public class Atm {

    private int balance = 0;

    public Atm(int i) {
     balance = i;
    }

    private void initialize() {

    }

    private void withdraw() {

    }

    private void deposit() {

    }

    public int balanceCal() {
        return balance;
    }
}
