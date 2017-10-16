package com.udacitymovie.action.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Created by hanyuezi on 17/10/15.
 */
@JsonObject
public class MoviesModel {
//    "vote_count":2090,"id":346364,"video":false,"vote_average":7.4,"title":"It","popularity":771.460898,"poster_path":"\/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg",
//            "original_language":"en","original_title":"It","genre_ids":[12,18,27],"backdrop_path":"\/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg","adult":false,
//            "overview":"In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.",
//            "release_date":"2017-09-05"
    @JsonField
    private int vote_count;
    @JsonField
    private int id;
    @JsonField
    private boolean video;
    @JsonField
    private double vote_average;
    @JsonField
    private String title;
    @JsonField
    private double popularity;
    @JsonField
    private String poster_path;
    @JsonField
    private String original_language;
    @JsonField
    private String original_title;
    @JsonField
    private String genre_ids;
    @JsonField
    private String backdrop_path;
    @JsonField
    private boolean adult;
    @JsonField
    private String overview;
    @JsonField
    private String release_date;

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(String genre_ids) {
        this.genre_ids = genre_ids;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}