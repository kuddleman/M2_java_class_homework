public abstract class DemandDeposit extends Account {
    // constructor for single owner account
    public DemandDeposit(String firstName, int anAccountNumber, int anInitialDeposit) {
        super(firstName, anAccountNumber, anInitialDeposit);
    }

    // constructor for joint-owner account
    public DemandDeposit(String firstName, String secondName, int anAccountNumber, int anInitialDeposit) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit);
    }

    public void withdraw(int amount){
        System.out.println("$" + amount + " has been withdrawn from your account.");
    }

    public void deposit(int amount) {
        System.out.println("$" + amount + " has been deposited your account.");
    }

}
