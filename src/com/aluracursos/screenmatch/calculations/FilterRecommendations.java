package com.aluracursos.screenmatch.calculations;

public class FilterRecommendations {
    public void filter(Classification classification){
        if (classification.getClassification() >= 4){
            System.out.println("Has great evaluations");
        } else if (classification.getClassification() >= 2){
            System.out.println("Popular at the moment");
        } else {
            System.out.println("Put it on your list");
        }
    }
}
