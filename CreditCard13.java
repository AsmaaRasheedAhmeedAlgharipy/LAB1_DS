public class CreditCard13 {
    private String customer;
    private String bank;
    private String account;
    private int balance;
    private int limit;

    public CreditCard13(String cust, String bk, String ac, int b, int lim) {
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
            CreditCard13[] wallet = new CreditCard13[3];
            wallet[0] = new CreditCard13("Asmaa Rasheed", "Bank of Sanaa", "123456789", 1000, 5000);
            wallet[1] = new CreditCard13("Afnan Mohamed", "Bank of Sanaa", "567890123", 2000, 2500);
            wallet[2] = new CreditCard13("Haroom Al_Rasheed", "Bank of Sanaa", "901234567", 3000, 3500);

            // Modify the for loop to target a specific card
            for (int val = 1; val <= 1700; val++) {
                wallet[1].charge(val);
            }

            for (CreditCard13 card : wallet) {
                System.out.println(card.getCustomer() + "'s balance is $" + card.getBalance());
                if (card.getBalance() > card.getLimit()) {
                    System.out.println(card.getCustomer() + "'s card is over the limit.");
                }
            }
        }
}

