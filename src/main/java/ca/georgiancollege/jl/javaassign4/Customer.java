
public class Customer {
    public String nameCustomer;
    public String sexCustomer;
    private String addressCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    private String passwordCustomer;
    private int idCustomer;
    private int idCompany;
    private int idPolicy;

    public Customer() {
    }


    public Customer(String nameCustomer, String sexCustomer, String addressCustomer, String phoneCustomer, String emailCustomer, String passwordCustomer, int idCustomer, int idCompany, int idPolicy) {
        this.nameCustomer = nameCustomer;
        this.sexCustomer = sexCustomer;
        this.addressCustomer = addressCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.passwordCustomer = passwordCustomer;
        this.idCustomer = idCustomer;
        this.idCompany = idCompany;
        this.idPolicy = idPolicy;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getSexCustomer() {
        return sexCustomer;
    }

    public void setSexCustomer(String sexCustomer) {
        this.sexCustomer = sexCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getPasswordCustomer() {
        return passwordCustomer;
    }

    public void setPasswordCustomer(String passwordCustomer) {
        this.passwordCustomer = passwordCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public int getIdPolicy() {
        return idPolicy;
    }

    public void setIdPolicy(int idPolicy) {
        this.idPolicy = idPolicy;
    }

}
