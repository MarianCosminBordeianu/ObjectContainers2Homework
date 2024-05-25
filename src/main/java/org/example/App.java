package org.example;


public class App 
{
    public static void main( String[] args )
    {
        SalesRepresentative[] representatives = new SalesRepresentative[2];

        representatives[0] = new SalesRepresentative("Alex", 7,800);
        representatives[1] = new SalesRepresentative("Cosmin",10,500);

        for (SalesRepresentative salesRepresentative : representatives) {
            salesRepresentative.print();
        }

        System.out.println("----------------------------------------------------------------------");

        SortClass sortClass = new SortClass(representatives);
        SalesRepresentative[] sortedRepresentatives = sortClass.sort();
        for (SalesRepresentative sorted : sortedRepresentatives) {
            sorted.print();
        }
    }
}
