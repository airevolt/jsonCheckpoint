package com.example.jsonCheckpoint;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie {
    private String title;
    private String genre;
    private String description;
    private String year;
    private double rating;
    private double gross;
    private Integer minutes;
    private Integer votes;
    private Integer metaScore;
    private List<Person> credits;

    public Integer getMetaScore() {
        return metaScore;
    }

    @JsonProperty("MetaScore")
    public void setMetaScore(Integer metaScore) {
        this.metaScore = metaScore;
    }

    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    @JsonProperty("Genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    @JsonProperty("Year")
    public void setYear(String year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    @JsonProperty("Rating")
    public void setRating(double rating) {
        this.rating = rating;
    }

    @JsonProperty("gross")
    public double getGross() {
        return gross;
    }

    @JsonProperty("Gross")
    public void setGross(double gross) {
        this.gross = gross;
    }

    public Integer getMinutes() {
        return minutes;
    }

    @JsonProperty("Minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getVotes() {
        return votes;
    }

    @JsonProperty("Votes")
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public List<Person> getCredits() {
        return credits;
    }

    @JsonProperty("Credits")
    public void setCredits(List<Person> credits) {
        this.credits = credits;
    }
}
