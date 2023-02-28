public class Account {

    private int nr;
    private int balance;
    private String accountType;
    private String status;

    public Account(String accountType, int nr) {
        this.accountType = accountType;
        this.nr = nr;
        this.balance = 0;
        this.status = "Open";
    }

    public void insertAmount(int amount) {
        if (status.equals("Open"))
            balance += amount;
    }

    public void withdrawAmount(int amount) {
        if (status.equals("Open") && balance > 0)
            balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getStatus() {
        return status;
    }

    public void closeAccount() {
        status = "Closed";
    }
}
