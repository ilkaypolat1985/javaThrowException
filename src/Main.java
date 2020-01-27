public class Main {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();

        System.out.println("Account = " + manager.getBalance());

        manager.deposit(100);
        System.out.println("Account = " + manager.getBalance());

        try {
            manager.withdraw(90);
            System.out.println("Account = " + manager.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            manager.withdraw(20);
            System.out.println("Account = " + manager.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Account = " + manager.getBalance());
    }
}
