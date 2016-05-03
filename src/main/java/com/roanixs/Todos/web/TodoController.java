package com.roanixs.Todos.web;

import com.roanixs.Todos.domain.Todo;
import com.roanixs.Todos.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by coumaj on 03/05/2016.
 */
@RestController
@RequestMapping(path = "/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Todo> findAll() {
        return this.todoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Todo create(@RequestBody Todo todo){

        long position = this.todoService.size() + 1;

        Todo t = new Todo(todo.getValue() + " " + position, position);

        this.todoService.save(t);
        return t;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void cleanUp() {
        this.todoService.deleteAll();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void deleteTodo(@PathVariable long id) {
        this.todoService.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Todo update(@RequestBody Todo todo) {
        this.todoService.save(todo);
        return todo;
    }

}
