package com.example.myart.repository;

import com.example.myart.Genre;
import com.example.myart.ui.home.HomeFragment;

import java.util.Collection;
import java.util.List;

public interface Repository {

    void getGenre(HomeFragment.SetData lambda);
}
