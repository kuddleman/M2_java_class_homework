public class CertificateOfDeposit extends Account {

    private String endDate;  // date funds in CD can be withdrawn

    // constructor for single owner account
    public CertificateOfDeposit (String firstName, int anAccountNumber, int anInitialDeposit, String anEndDate) {
        super(firstName, anAccountNumber, anInitialDeposit);
        this.endDate = anEndDate;
    }

    // constructor for joint-owner account
    public CertificateOfDeposit (String firstName, String secondName, int anAccountNumber, int anInitialDeposit, String anEndDate) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit);
        this.endDate = anEndDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    @Override
    public String toString() {


        String s = super.toString();
        return s += "\nInitial Deposit: $" + getInitialDeposit() + "\nEnd Date: " + getEndDate() ;

    }

    public void extendTermOfCd(String newDate) {
        this.endDate = newDate;
        System.out.println("Your Certificate of Deposit has been extended to " + newDate);

    }
}
