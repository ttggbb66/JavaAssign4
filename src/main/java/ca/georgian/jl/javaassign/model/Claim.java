package ca.georgian.jl.javaassign.model;

import java.util.Date;

public class Claim {

    public int idClaim;
    public int idCustomer;
    public int idPolicy;
    public String amountClaim;
    public Date dateClaim;
    public String statusClaim;

    public Claim() {
    }

    public Claim(int idClaim, int idCustomer, int idPolicy, String amountClaim, Date dateClaim, String statusClaim) {
        this.idClaim = idClaim;
        this.idCustomer = idCustomer;
        this.idPolicy = idPolicy;
        this.amountClaim = amountClaim;
        this.dateClaim = dateClaim;
        this.statusClaim = statusClaim;
    }


    public int getIdClaim() {
        return idClaim;
    }

    public void setIdClaim(int idClaim) {
        this.idClaim = idClaim;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdPolicy() {
        return idPolicy;
    }

    public void setIdPolicy(int idPolicy) {
        this.idPolicy = idPolicy;
    }

    public String getAmountClaim() {
        return amountClaim;
    }

    public void setAmountClaim(String amountClaim) {
        this.amountClaim = amountClaim;
    }

    public Date getDateClaim() {
        return dateClaim;
    }

    public void setDateClaim(Date dateClaim) {
        this.dateClaim = dateClaim;
    }

    public String getStatusClaim() {
        return statusClaim;
    }

    public void setStatusClaim(String statusClaim) {
        this.statusClaim = statusClaim;
    }



}
