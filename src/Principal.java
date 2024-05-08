import com.aluracursos.screenmatch.calculations.FilterRecommendations;
import com.aluracursos.screenmatch.calculations.TimeCalculator;
import com.aluracursos.screenmatch.models.Episodes;
import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Suspiria");
        myMovie.setDuration(130);
        myMovie.setReleaseDate(1977);
        myMovie.setIncludedInPlan(true);

        myMovie.showFilmDataSheet();
        myMovie.rate(9.6);
        myMovie.rate(8.9);
        System.out.println(myMovie.getTotalOfGrades());
        System.out.println(myMovie.calculateAverage());

        Serie houseOfDragon = new Serie();
        houseOfDragon.setName("House of Dragon");
        houseOfDragon.setReleaseDate(2022);
        houseOfDragon.setSeasons(1);
        houseOfDragon.setMinutesPerEpisode(50);
        houseOfDragon.setEpisodesPerSeason(10);
        houseOfDragon.showFilmDataSheet() ;
        System.out.println(houseOfDragon.getDuration());

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(houseOfDragon);
        System.out.println(calculator.getTotalTime());

        FilterRecommendations filterRecommendations = new FilterRecommendations();
        filterRecommendations.filter(myMovie);

        Episodes episodes = new Episodes();
        episodes.setNumber(1);
        episodes.setName("House Targaryen");
        episodes.setSerie(houseOfDragon);
        episodes.setTotalViews(300);

        filterRecommendations.filter(episodes);
    }
}
