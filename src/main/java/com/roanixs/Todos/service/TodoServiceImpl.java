package com.roanixs.Todos.service;

import com.roanixs.Todos.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by coumaj on 03/05/2016.
 */
@Service
@Transactional
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> findAll() {
        return (List<Todo>) todoRepository.findAll();
    }

    @Override
    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public Todo findOne(long id) {
        return todoRepository.findOne(id);
    }

    @Override
    public void delete(long id) {
        todoRepository.delete(id);
    }

    @Override
    public void deleteAll() {
        todoRepository.deleteAll();
    }

    @Override
    public Todo update(Todo todo) {
        todoRepository.save(todo);
        return this.findOne(todo.getId());
    }

    @Override
    public long size() {
        return todoRepository.count();
    }
}
