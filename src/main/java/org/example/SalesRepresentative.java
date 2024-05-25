package org.example;

public class SalesRepresentative {
    private String name;
    private int numberOfSales;
    private int quota;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public SalesRepresentative(String name, int numberOfSales, int quota) {
        this.name = name;
        this.numberOfSales = numberOfSales;
        this.quota = quota;
    }

    public int amountOfRevenueGeneratedViaSales(){
        return numberOfSales*quota;
    }

    public void print(){
        System.out.println(name + " has " + numberOfSales + " with a quota of " + quota + "$. He has achieved " + amountOfRevenueGeneratedViaSales() + "$ worth of sales");
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public int getQuota() {
        return quota;
    }
}
