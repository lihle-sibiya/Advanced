package lesson9;


import java.util.List;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        SalesTxn first = tList.get(0);
        UnaryOperator<String> unaryStr = s -> s.toUpperCase();

        System.out.println(unaryStr.apply(first.getBuyer().getName()));
    }
}
