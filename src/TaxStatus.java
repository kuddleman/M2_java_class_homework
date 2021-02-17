// M2 HOMEWORK ENUM
public enum TaxStatus {
    NO_WITHHOLDING_REQUIRED(false, true,
            true, true, "We are not required to withhold taxes on your account."),
    WITHOLDING_REQUIRED(true, false,
            false, false,
            "This account requires both state and federal witholding."),
    CA_STATE_TAX_FREE(true, true,
            false, false,
            "This account is CA state tax-free. However, we must still withhold federal taxes."),
    FED_TAX_FREE(true, false,
            true, false,
            "This account is free of federal taxes. However, we still must withhold CA state taxes."),
    CA_AND_FED_TAX_FREE(false, true,
            true, true,
            "This account is both state and federal tax-free. No witholding required.");


    private boolean witholdingRequired;
    private boolean caStateTaxFree;
    private boolean fedTaxFree;
    private boolean caAndFedTaxFree;
    private String displayTaxStatus;

    private TaxStatus (boolean witholdingRequired, boolean caStateTaxFree,
                       boolean fedTaxFree, boolean caAndFedTaxFree, String displayTaxStatus) {
        this.witholdingRequired = witholdingRequired;
        this.caStateTaxFree = caStateTaxFree;
        this.fedTaxFree = fedTaxFree;
        this.caAndFedTaxFree = caAndFedTaxFree;
        this.displayTaxStatus = displayTaxStatus;
    }


    public boolean isWithholdingRequired() {
        return witholdingRequired;
    }

    public boolean isCaStateTaxFree() {
        return caStateTaxFree;
    }

    public boolean isFedTaxFree() {
        return fedTaxFree;
    }

    public boolean isCaAndFedTaxFree() {
        return caAndFedTaxFree;
    }

    public String getDisplayTaxStatus() {
        return displayTaxStatus;
    }

    @Override
   public String toString() {
//        if(caAndFedTaxFree) {
//            return displayTaxStatus;
//        } else if (fedTaxFree) {
//            return displayTaxStatus;
//        } else if (caStateTaxFree) {
//            return displayTaxStatus;
//        } else if (witholdingRequired) {
//            return displayTaxStatus;
//        } else {
//            return "We are not required to withhold taxes on your account.";
//        }
          return displayTaxStatus;

    }





}
