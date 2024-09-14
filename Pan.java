package Project;

public class Pan {
    private String adharnumber;
    private String pannumber;
    private String inverstment;
    private String bankdetails;

    public Pan(String adharnumber, String bankdetails, String inverstment, String pannumber) {
        this.adharnumber = adharnumber;
        this.bankdetails = bankdetails;
        this.inverstment = inverstment;
        this.pannumber = pannumber;
    }

    public String getAdharnumber() {
        return adharnumber;
    }

    public void setAdharnumber(String adharnumber) {
        this.adharnumber = adharnumber;
    }

    public String getBankdetails() {
        return bankdetails;
    }

    public void setBankdetails(String bankdetails) {
        this.bankdetails = bankdetails;
    }

    public String getInverstment() {
        return inverstment;
    }

    public void setInverstment(String inverstment) {
        this.inverstment = inverstment;
    }

    public String getPannumber() {
        return pannumber;
    }

    public void setPannumber(String pannumber) {
        this.pannumber = pannumber;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "adharnumber='" + adharnumber + '\'' +
                ", pannumber='" + pannumber + '\'' +
                ", inverstment='" + inverstment + '\'' +
                ", bankdetails='" + bankdetails + '\'' +
                '}';
    }
}
