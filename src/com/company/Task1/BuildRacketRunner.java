package com.company.Task1;

public class BuildRacketRunner {

    public static void runBuildRacket(){
        Director director1 = new Director();
        director1.setBuilder(new CheapRacketBuilder());
        Racket racket1 = director1.buildRacket();
        System.out.println(racket1 + "\n");


        Director director2 = new Director();
        director2.setBuilder(new ExpensiveRacketBuilder());
        Racket racket2 = director2.buildRacket();
        System.out.println(racket2);}

}
