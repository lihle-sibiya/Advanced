package lesson8;

import java.util.List;

public class A01OldStyleFor {
    public static void main(String[] args) {
List<SalesTxn> tList = SalesTxn.createTxnList();

        System.out.println("\nPrint List with for loop: ");
        for (SalesTxn t: tList){
         t.printSummary();
        }

    }
}
