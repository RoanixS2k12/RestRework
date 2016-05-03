package com.roanixs.Todos.service;

import com.roanixs.Todos.domain.Todo;

import java.util.List;

/**
 * Created by coumaj on 03/05/2016.
 */
public interface TodoService {

    List<Todo> findAll();
    void save(Todo todo);
    Todo findOne(long id);
    Todo update(Todo todo);

    long size();

    void delete(long id);
    void deleteAll();
}
