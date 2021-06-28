package com.example.myart.repository;

import java.util.Collection;

public interface Repository<T> {

    Collection<T> getData();
}
