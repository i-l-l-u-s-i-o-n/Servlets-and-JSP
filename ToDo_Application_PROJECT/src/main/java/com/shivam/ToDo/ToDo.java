package com.shivam.ToDo;


/**
 * created by Shivam on 22-02-2019.
 */
public class ToDo {

    String name;
    String category;

    public ToDo(String name,String category) {
        this.name = name;
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
