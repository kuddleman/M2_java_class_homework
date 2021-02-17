// M2 HOMEWORK ENUM USE
public abstract class Account implements Comparable<Account> {
    private String name1;
    private String name2;
    private int accountNumber;
    private int initialDeposit;

    private TaxStatus taxStatus;

    private static int totalDepositsInAllAccounts = 0;

    // constructor for single owner account
    public Account(String firstName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        this.name1 = firstName;
        this.accountNumber = anAccountNumber;
        this.initialDeposit = anInitialDeposit;
        this.taxStatus = aTaxStatus;

        // M2 HOMEWORK STATIC
        Account.totalDepositsInAllAccounts += anInitialDeposit;
    }

    // constructor for joint-owner account
    public Account(String firstName, String secondName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        this(firstName, anAccountNumber, anInitialDeposit, aTaxStatus);
        this.name2 = secondName;

    }

    // Getters
    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    // M2 HOMEWORK STATIC
    public static int getTotalDepositsInAllAccounts() {
        return Account.totalDepositsInAllAccounts;
    }

    public static int decreaseTotalDepositsInAllAccounts(int withdrawl) {
        return Account.totalDepositsInAllAccounts -= withdrawl;
    }

    public static int increaseTotalDepositsInAllAccounts(int deposit) {
        return Account.totalDepositsInAllAccounts += deposit;
    }

    @Override
    public String toString() {
        /*
        if (this.name2 == null) {
          return "Account owner: " + name1 + "\nAccount Number: #" + accountNumber + "\nInitial Deposit $" + initialDeposit ;
        }
        return "Account owners: " + name1 + " and " + name2 + "\nAccount Number: #" + accountNumber + "\nInitial Deposit: $" + initialDeposit ;
        */
        return "Account owner(s): " + name1 + (name2 == null? "": " and " + getName2()) +
                "\nAccount Number: #" + accountNumber + "\nInitial Deposit: $" + initialDeposit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account otherAccount = (Account) obj;
            int otherAccountNumber = otherAccount.accountNumber;
            String otherName1 = otherAccount.name1;

            if(accountNumber == otherAccountNumber && name1.equalsIgnoreCase(otherName1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int compareTo(Account act) {
//        if(initialDeposit < act.initialDeposit) {
//            return -10;
//        } else if (initialDeposit > act.initialDeposit) {
//            return 10;
//        } else {
//            return 0;
//        }

        return Integer.compare(initialDeposit, act.initialDeposit);
    }



}
