public class CheckingAccount extends DemandDeposit{



    public CheckingAccount (String firstName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName, anAccountNumber, anInitialDeposit, aTaxStatus);

    }

    // constructor for joint-owner account
    public CheckingAccount (String firstName, String secondName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit, aTaxStatus);

    }

}

