public abstract class DemandDeposit extends Account {

    // constructor for single owner account
    public DemandDeposit(String firstName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName, anAccountNumber, anInitialDeposit, aTaxStatus);


    }

    // constructor for joint-owner account
    public DemandDeposit(String firstName, String secondName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit, aTaxStatus);

    }

    public void withdraw(int amount){
        System.out.println("$" + amount + " has been withdrawn from your account.");
        Account.increaseTotalDepositsInAllAccounts(amount);

    }

    public void deposit(int amount) {
        System.out.println("$" + amount + " has been deposited your account.");
        Account.increaseTotalDepositsInAllAccounts(amount);
    }

}
