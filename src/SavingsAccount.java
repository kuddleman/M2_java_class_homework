public class SavingsAccount extends DemandDeposit{

    public SavingsAccount (String firstName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName, anAccountNumber, anInitialDeposit, aTaxStatus);
    }

    // constructor for joint-owner account
    public SavingsAccount (String firstName, String secondName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit, aTaxStatus);
    }
}
