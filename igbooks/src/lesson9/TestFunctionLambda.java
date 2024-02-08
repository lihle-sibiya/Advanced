package lesson9;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestFunctionLambda {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        SalesTxn first = tList.get(0);
        Function<SalesTxn, String> buyerFunction = t -> t.getBuyer().getName();
        System.out.println("Buyer for first transaction " + buyerFunction.apply(first));

    }
}
