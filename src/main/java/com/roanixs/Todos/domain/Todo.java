package com.roanixs.Todos.domain;

import javax.persistence.*;

/**
 * Created by coumaj on 03/05/2016.
 */
@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "value")
    private String value;

    @Column(name = "position")
    private long position;

    @Column(name = "done")
    private boolean done;

    protected Todo() {}

    public Todo(String value, long position) {
        this.value = value;
        this.position = position;
        this.done = false;
    }

    public String getValue() {
        return this.value;
    }

    public long getId() {
        return this.id;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public long getPosition() {
        return this.position;
    }

    public boolean getDone() {
        return this.done;
    }

    public void setDone() {
        this.done = true;
    }

    public void unDone() {
        this.done = false;
    }

}
