package com.company.Task1;

public class ExpensiveRacketBuilder extends RacketBuilder {

    @Override
    void buildShaft() {
        racket.setShaft("Flexible");
    }

    @Override
    void buildBalance() {
        racket.setBalance("Head Heavy");
    }

    @Override
    void buildBrand() {
        racket.setBrand("Yonex");
    }

    @Override
    void buildPrice() {
        racket.setPrice(165);
    }
}
