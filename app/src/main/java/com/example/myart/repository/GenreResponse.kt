package com.example.myart.repository;

import com.example.myart.Genre;

import java.util.ArrayList;
import java.util.List;

public class GenreResponse {

    private List<Genre> genres = new ArrayList<>();

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
