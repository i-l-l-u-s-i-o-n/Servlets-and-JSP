package com.shivam.ToDo;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Shivam on 22-02-2019.
 */
public class ToDoService {

    private static ArrayList<ToDo> list=new ArrayList<ToDo>();


    // We can't directly add elements here to the list, SO we need a static block for this.
    static {
        list.add(new ToDo("Learn Servlets and JSP ."));
        list.add(new ToDo("Learn Spring Framework"));
        list.add(new ToDo("Learn REST services."));
        list.add(new ToDo("Learn Node JS."));
    }

    public List<ToDo> getList(){
        return list;
    }

    public  void addToDo(String todo){
        list.add(new ToDo(todo));
    }

    public boolean removeTodo(String todo){

        return list.remove(new ToDo(todo));
    }
}
