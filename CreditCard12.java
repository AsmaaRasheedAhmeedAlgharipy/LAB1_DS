public class CreditCard12 {

    private String customer;
    private String bank;
    private String account;
    private int balance;
    private int limit;

    public CreditCard12(String cust, String bk, String ac, int b, int lim) {
        customer = cust;
        bank = bk;
        account = ac;
        balance = b;
        limit = lim;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public boolean charge(int price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment(int payment) {
        if (payment > 0) {
            balance -= payment;
        }
    }

    public void updateLimit(int newLimit) {
        limit = newLimit;
    }


    public static void main(String[] args) {
        CreditCard12 card = new CreditCard12("John Doe", "Bank of America", "123456789", 1000, 5000);

        // Make a valid payment
        card.makePayment(500);
        System.out.println("Balance after valid payment: " + card.getBalance());
        System.out.println("Note: We do not accept negative balance. ");
        // Attempt to make a negative payment (ignored)
        card.makePayment(-100);
        System.out.println("Balance after invalid payment: " + card.getBalance());
    }
}

