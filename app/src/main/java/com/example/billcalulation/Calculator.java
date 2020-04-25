package com.example.billcalulation;

public class Calculator {

    private int nb;
    private double bill;
    private double totalBill;
    private double result;

    public Calculator(int nb, double bill, double totalBill) {
        this.nb = nb;
        this.bill = bill;
        this.totalBill = totalBill;
    }

    public Calculator() {
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double calTPS(){
        return Math.round(((this.bill * 0.05)*100)/100) ;
    }
    public double calTVQ(){
        return Math.round(((this.bill * 0.09975)*100)/100);
    }
    public double totalbill(double tps, double tvq){
        return this.bill + tps + tvq;
    }
    public double eachPerson(double total){
        return total / this.nb;
    }
}
