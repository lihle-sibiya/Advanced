package lesson9;

import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        //Consumer takes an object as input and return void
        Consumer<SalesTxn> buyerConsumer = t -> System.out.println("Id: " + t.getTxnId() + " Buyer: " + t.getBuyer().getName());
        tList.stream()
                .forEach(buyerConsumer);




    }
}
