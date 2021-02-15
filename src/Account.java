public abstract class Account {
    private String name1;
    private String name2;
    private int accountNumber;
    private int initialDeposit;

    // constructor for single owner account
    public Account(String firstName, int anAccountNumber, int anInitialDeposit) {
        this.name1 = firstName;
        this.accountNumber = anAccountNumber;
        this.initialDeposit = anInitialDeposit;
    }

    // constructor for joint-owner account
    public Account(String firstName, String secondName, int anAccountNumber, int anInitialDeposit) {
        this(firstName, anAccountNumber, anInitialDeposit);
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

    @Override
    public String toString() {
        /*
        if (this.name2 == null) {
          return "Account owner: " + name1 + "\nAccount Number: #" + accountNumber + "\nInitial Deposit $" + initialDeposit ;
        }
        return "Account owners: " + name1 + " and " + name2 + "\nAccount Number: #" + accountNumber + "\nInitial Deposit: $" + initialDeposit ;
        */
        return "Account owner(s): " + name1 + " and " + (name2 == null? "": getName2()) +
                "\nAccount Number: #" + accountNumber + "\nInitial Deposit: $";
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



}
