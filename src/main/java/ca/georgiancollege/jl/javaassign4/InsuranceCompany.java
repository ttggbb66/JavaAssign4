public class InsuranceCompany {

    public int idCompany;
    public String nameCompany;
    public String addressCompany;
    public String contactCompany;
    public String phoneCompany;
    public String emailCompany;

    public InsuranceCompany() {
    }

    public InsuranceCompany(int idCompany, String nameCompany, String addressCompany, String contactCompany, String phoneCompany, String emailCompany) {
        this.idCompany = idCompany;
        this.nameCompany = nameCompany;
        this.addressCompany = addressCompany;
        this.contactCompany = contactCompany;
        this.phoneCompany = phoneCompany;
        this.emailCompany = emailCompany;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getAddressCompany() {
        return addressCompany;
    }

    public void setAddressCompany(String addressCompany) {
        this.addressCompany = addressCompany;
    }

    public String getContactCompany() {
        return contactCompany;
    }

    public void setContactCompany(String contactCompany) {
        this.contactCompany = contactCompany;
    }

    public String getPhoneCompany() {
        return phoneCompany;
    }

    public void setPhoneCompany(String phoneCompany) {
        this.phoneCompany = phoneCompany;
    }

    public String getEmailCompany() {
        return emailCompany;
    }

    public void setEmailCompany(String emailCompany) {
        this.emailCompany = emailCompany;
    }


}
