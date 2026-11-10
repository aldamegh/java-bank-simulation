/** Fictional clients and balances, added for the portfolio demonstration. */
public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank(5);
        bank.addClient("DemoAlice", 1000);
        bank.addClient("DemoBob", 500);
        System.out.println("Fictional starting balances");
        bank.display("DemoAlice");
        bank.display("DemoBob");
        System.out.println("\nDeposit 200 to DemoAlice: " + bank.deposit("DemoAlice", 200));
        System.out.println("Transfer 300 to DemoBob: " + bank.transfer("DemoAlice", "DemoBob", 300));
        System.out.println("Withdraw 900 from DemoBob: " + bank.withdraw("DemoBob", 900));
        System.out.println("\nFinal balances");
        bank.display("DemoAlice");
        bank.display("DemoBob");
        System.out.println("\nThe withdrawal is rejected: insufficient balance.");
    }
}
