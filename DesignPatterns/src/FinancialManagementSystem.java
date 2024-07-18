public class FinancialManagementSystem {
    public static void main(String[] args) {

        Bank.banco();
 

        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();



        Account savings = AccountFactory.getAccount("SAVINGS");
        savings.accountType();

        Account checking = AccountFactory.getAccount("CHECKING");
        checking.accountType();



        AccountSubject account = new AccountSubject();
        Client client1 = new Client("Felipe");
        Client client2 = new Client("Pedro");

        account.addObserver(client1);
        account.addObserver(client2);


        account.performTransaction("Depósito de $1500");



        AccountContext accountContext = new AccountContext();

        accountContext.setInterestStrategy(new RegularInterestStrategy());
        System.out.println("Juros Regular: " + accountContext.calculateInterest(1500));
        System.out.println("--------------------------------------------");

        accountContext.setInterestStrategy(new HighInterestStrategy());
        System.out.println("Juros Alto: " + accountContext.calculateInterest(1500));


        dbConnection.disconnect();
    }
}