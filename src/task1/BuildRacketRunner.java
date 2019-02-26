package com.company.task1;

public class BuildRacketRunner {

    public static Racket runBuildRacket() {
        Director director = new Director();
        director.setBuilder(new CheapRacketBuilder());
        Racket racket = director.buildRacket();
        System.out.println(racket+ "\n");
        return racket;
    }
}
