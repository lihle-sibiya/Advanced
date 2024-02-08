package lesson8;

import java.util.List;

public class A04ManyFilters {
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();

        System.out.println("CA transaction for ACME using two filter ");
        tList.stream()
                .filter(t -> t.getState().equals(State.CA))
                .filter(t -> t.getBuyerName()
                        .equals("Acme Electronics"))
                .forEach(SalesTxn::printSummary);




        System.out.println("\nCA transaction for Acme using one filter with logical operators");
        tList.stream()
                .filter(t -> (t.getState().equals(State.CA)) && (t.getBuyerName().equals("Acme Electronics")))
                        .forEach(t -> t.printSummary());

    }
}
