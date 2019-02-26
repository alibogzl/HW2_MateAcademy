package com.company.Task1;

public class Director {
    RacketBuilder builder;

    public void setBuilder(RacketBuilder builder) {
        this.builder = builder;
    }

    Racket buildRacket() {
        builder.createRacket();
        builder.buildBalance();
        builder.buildBrand();
        builder.buildPrice();
        builder.buildShaft();

        Racket racket = builder.getRacket();
        return racket;
    }
}
