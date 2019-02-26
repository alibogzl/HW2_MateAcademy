package com.company.task1;

public class CheapRacketBuilder extends RacketBuilder {

    @Override
    void buildShaft() {
        racket.setShaft("Stiff");
    }

    @Override
    void buildBalance() {
        racket.setBalance("Head Light");
    }

    @Override
    void buildBrand() {
        racket.setBrand("Babolat");
    }

    @Override
    void buildPrice() {
        racket.setPrice(99);
    }
}
