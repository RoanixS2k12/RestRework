package com.roanixs.Todos.service;

import com.roanixs.Todos.domain.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by coumaj on 03/05/2016.
 */
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
