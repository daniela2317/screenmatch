package com.aluracursos.screenmatch.models;

public class Serie extends Title {
    int seasons;
    int episodesPerSeason;
    int minutesPerEpisode;

    @Override
    public int getDuration() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
}
