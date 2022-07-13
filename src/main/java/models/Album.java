package models;

import java.io.Serializable;

public class Album implements Serializable {

    private long id;
    private String artist;
    private String name;
    private double sales;
    private String genre;
    private Integer releaseDate;

    public Album() {
    }
    public Album(long id, String artist, String name, double sales, String genre, Integer releaseDate){
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.sales = sales;
        this.genre = genre;
        this.releaseDate = releaseDate;

    }

    public long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public double getSales() {
        return sales;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }
}
