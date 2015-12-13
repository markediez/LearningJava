/* 
 * Author: Mark Diez
 * Date: 11 December 2015
 * Ex. 5.30
 * AutoPolicy mod -- validating using conditionals
 */

public class AutoPolicyMod {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy (int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // set
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // get
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        if(getState().equals("CT") || getState().equals("MA") 
            ||  getState().equals("ME") || getState().equals("NH")
            ||  getState().equals("NJ") || getState().equals("NY")
            ||  getState().equals("PA") || getState().equals("VT"))
            this.state = state;
        else
            System.out.printf("%s is not a valid state%n", state);
    }

    public String getState() {
        return state;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;

        switch(getState()) {
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }
}