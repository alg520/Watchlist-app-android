package com.watchlist.searchresults;

import android.graphics.Bitmap;

/**
 * Created by VEINHORN on 02/12/13.
 */
public class SearchResultsItem {
    private String title;
    private String releaseDate;
    private String rating;
    private Bitmap poster;
    private String posterLink;
    private String votes;

    public SearchResultsItem() {
    }

    public SearchResultsItem(String title, String releaseDate, String rating, Bitmap poster, String posterLink, String votes) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.poster = poster;
        this.posterLink = posterLink;
        this.votes = votes;
    }

    public Bitmap getPoster() {
        return poster;
    }

    public void setPoster(Bitmap poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPosterLink() {
        return posterLink;
    }

    public void setPosterLink(String posterLink) {
        this.posterLink = posterLink;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "SearchResultsItem{" +
                "title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating='" + rating + '\'' +
                ", poster=" + poster +
                ", posterLink='" + posterLink + '\'' +
                ", votes='" + votes + '\'' +
                '}';
    }
}