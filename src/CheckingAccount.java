public class CheckingAccount extends DemandDeposit{

    public CheckingAccount (String firstName, int anAccountNumber, int anInitialDeposit) {
        super(firstName, anAccountNumber, anInitialDeposit);
    }

    // constructor for joint-owner account
    public CheckingAccount (String firstName, String secondName, int anAccountNumber, int anInitialDeposit) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit);
    }

}

