package com.company.task1;

public abstract class RacketBuilder {
    Racket racket;

    void createRacket() {
        racket = new Racket();
    }

    abstract void buildShaft();

    abstract void buildBalance();

    abstract void buildBrand();

    abstract void buildPrice();

    Racket getRacket() {
        return racket;
    }

}
