package com.shivam.ToDo;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDo)) return false;
        ToDo toDo = (ToDo) o;
        return name.equals(((ToDo) o).name);
    }

}
