public class AccountApp {
    public static void main(String[] args) {
        Account account = new Account("ChildSaving", 1);
        System.out.println(account.getNr());

        account.insertAmount(200);

        System.out.println(account.getStatus());
        System.out.println(account.getBalance());

        account.withdrawAmount(100);

        System.out.println(account.getBalance());

        account.closeAccount();

        System.out.println(account.getStatus());

        account.setAccountType("Saving");

        System.out.println(account.getAccountType() + " " + account.getStatus() + " " + account.getBalance());

        account.withdrawAmount(100);

        System.out.println(account.getBalance());
    }
}
