package com.shivam.ToDo;

/**
 * created by Shivam on 22-02-2019.
 */
public class ToDo {

    String name;

    public ToDo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return getName();
    }
}
