package lesson8;

import java.util.List;
import java.util.function.Predicate;

public class A03MethodReference {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
//Save Predicate to a variable
        Predicate<SalesTxn> transCA = t -> t.getState().equals(State.CA);
        System.out.println("\nnCA transactions ");

        //Pass with Lambda
//        tList.stream()
//                .filter(t -> t.getState().equals(State.CA))
//                .forEach(t -> t.printSummary());

        //Pass with method reference
        tList.stream()
                .filter(transCA)
                .forEach(SalesTxn::printSummary);
    }
}
