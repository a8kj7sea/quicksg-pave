package me.a8kj.common.service;

public interface Service<T> {

    void serve(T t);

    boolean canServe(T t);
}
