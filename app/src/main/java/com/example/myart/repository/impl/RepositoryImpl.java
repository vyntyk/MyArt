package com.example.myart.repository.impl;

import com.example.myart.repository.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class RepositoryImpl implements Repository<String> {

    @Override
    public Collection<String> getData() {
        Collection<String> data = new ArrayList<>(Arrays.asList("Horse", "Cow", "Camel", "Sheep", "Goat"));
        for (int i = 0; i < 40; i++) {
            data.add("Horse " + i);
        }
        return data;
    }
}
