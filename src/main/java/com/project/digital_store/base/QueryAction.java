package com.project.digital_store.base;


import java.util.List;

@FunctionalInterface
public interface QueryAction<T> {

    public List<T> query();
}
