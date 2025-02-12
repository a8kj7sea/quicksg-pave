package me.a8kj.common.service;

public interface Service<T> {

    void serve(T t);

    default boolean canServe(T t) {
        return true;
    }
}
