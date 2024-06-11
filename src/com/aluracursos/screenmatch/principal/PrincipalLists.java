package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalLists {
    public static void main(String[] args) {

        Movie myMovie = new Movie("Suspiria", 1977);
        myMovie.rate(9.5);
        var dansMovie = new Movie("Lord Of The Rings", 2001);
        dansMovie.rate(8.6);
        Serie houseOfDragon = new Serie("House of Dragon", 2022);

        ArrayList<Title> list = new ArrayList<>();
        list.add(dansMovie);
        list.add(myMovie);
        list.add(houseOfDragon);

        for (Title item: list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie) {
                System.out.println(movie.getClassification());
            }
        }

        ArrayList<String> artistsList = new ArrayList<>();
        artistsList.add("Javier Bardem");
        artistsList.add("Jane Fonda");
        artistsList.add("Paz Vega");
        artistsList.add("Germán Valdés");
        artistsList.add("Ana Martin");
        System.out.println("List of artists: " + artistsList);

        Collections.sort(artistsList);
        System.out.println("List of artists sort: " + artistsList);

        Collections.sort(list);
        System.out.println("Sort List : " + list);

        list.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("List sort by their release date: " + list);
    }
}
