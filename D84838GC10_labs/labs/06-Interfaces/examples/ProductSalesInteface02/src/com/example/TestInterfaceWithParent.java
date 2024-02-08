package com.example;

import com.example.WidgetSalesCalcs;
//parent of WidgetSalesCalcs abstract method must be implemented too
public  class TestInterfaceWithParent implements WidgetSalesCalcs {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double calcSalesPrice() {
        return 0;
    }

    @Override
    public double calcCost() {
        return 0;
    }

    @Override
    public double calcProfit() {
        return 0;
    }

    @Override
    public String getWidgetType() {
        return null;
    }
}
