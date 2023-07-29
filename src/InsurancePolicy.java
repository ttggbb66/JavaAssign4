public class InsurancePolicy {
    public int idPolicy;
    public String namePolicy;
    public String typePolicy;
    public String amountPolicy;

    public InsurancePolicy() {
    }

    public InsurancePolicy(int idPolicy, String namePolicy, String typePolicy, String amountPolicy) {
        this.idPolicy = idPolicy;
        this.namePolicy = namePolicy;
        this.typePolicy = typePolicy;
        this.amountPolicy = amountPolicy;
    }

    public int getIdPolicy() {
        return idPolicy;
    }

    public void setIdPolicy(int idPolicy) {
        this.idPolicy = idPolicy;
    }

    public String getNamePolicy() {
        return namePolicy;
    }

    public void setNamePolicy(String namePolicy) {
        this.namePolicy = namePolicy;
    }

    public String getTypePolicy() {
        return typePolicy;
    }

    public void setTypePolicy(String typePolicy) {
        this.typePolicy = typePolicy;
    }

    public String getAmountPolicy() {
        return amountPolicy;
    }

    public void setAmountPolicy(String amountPolicy) {
        this.amountPolicy = amountPolicy;
    }


}

