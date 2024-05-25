package org.example;

public class SortClass {
    private final SalesRepresentative[] salesRepresentatives;
    public SortClass(SalesRepresentative[] salesRepresentatives){
        this.salesRepresentatives = salesRepresentatives;
    }
    public SalesRepresentative[] sort(){
        for (int i = 0; i < salesRepresentatives.length - 1; i++) {
            for (int j = 0; j < salesRepresentatives.length; j++) {
                if (salesRepresentatives[i].amountOfRevenueGeneratedViaSales() > salesRepresentatives[j].amountOfRevenueGeneratedViaSales()){
                    swap(salesRepresentatives[i], salesRepresentatives[j]);
                }
            }
        }
        return salesRepresentatives;
    }
    public void swap(SalesRepresentative a, SalesRepresentative b){
        String tempName;
        int tempQuota;
        int tempNumberOfSales;

        tempName = a.getName();
        a.setName(b.getName());
        b.setName(tempName);

        tempQuota = a.getQuota();
        a.setQuota(b.getQuota());
        b.setQuota(tempQuota);

        tempNumberOfSales = a.getNumberOfSales();
        a.setNumberOfSales(b.getNumberOfSales());
        b.setNumberOfSales(tempNumberOfSales);
    }
}
