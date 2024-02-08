package lesson9;


import lesson8.SalesTxn;
import lesson8.State;

import java.util.*;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();

        //Predicate get passed on object and returns a boolean
        Predicate<SalesTxn> massSales = t -> t.getState().equals(State.MA);

        System.out.println("\n Sales - Stream");

        tList.stream()
                .filter(massSales)
                .forEach(t -> t.printSummary());
    }
}
