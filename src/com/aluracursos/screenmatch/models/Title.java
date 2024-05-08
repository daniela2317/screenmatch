package com.aluracursos.screenmatch.models;

public class Title {

    private String name;
    private int releaseDate;
    private int duration;
    private boolean includedInPlan;
    private double sumOfTheGrades;
    private int totalOfGrades;

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public boolean getIsIncludedInPlan() {
        return includedInPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public int getTotalOfGrades(){
        return totalOfGrades;
    }

    public void showFilmDataSheet() {
        System.out.println("The name of the movie is " + name);
        System.out.println("The release date is " + releaseDate);
        System.out.println("The duration of the movie is " + getDuration());
    }

    public void rate(double grade) {
        sumOfTheGrades += grade;
        totalOfGrades++;
    }

    public double calculateAverage() {
        return sumOfTheGrades / totalOfGrades;
    }
}
