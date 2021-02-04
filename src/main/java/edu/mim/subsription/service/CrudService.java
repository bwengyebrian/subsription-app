package edu.mim.subsription.service;

import java.util.List;

public interface CrudService<T,K> {
    T save(T t);
    T findById(K id);
    List<T> findAll();
    void delete(T t);
    void deleteById(K id);
}
