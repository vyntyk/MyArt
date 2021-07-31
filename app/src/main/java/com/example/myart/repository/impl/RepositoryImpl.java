package com.example.myart.repository.impl;
import com.example.myart.repository.Repository;
import java.util.ArrayList;
import java.util.Collection;

public class RepositoryImpl implements Repository<String>  {

    @Override
    public Collection<String> getData() {
        Collection<String> data = new ArrayList<>();


        for (int i = 0; i < 50; i++) {
            data.add("Конь " + i);
        }
        return data;
    }
}




