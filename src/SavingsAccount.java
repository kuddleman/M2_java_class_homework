public class SavingsAccount extends DemandDeposit{

    public SavingsAccount (String firstName, int anAccountNumber, int anInitialDeposit) {
        super(firstName, anAccountNumber, anInitialDeposit);
    }

    // constructor for joint-owner account
    public SavingsAccount (String firstName, String secondName, int anAccountNumber, int anInitialDeposit) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit);
    }
}
