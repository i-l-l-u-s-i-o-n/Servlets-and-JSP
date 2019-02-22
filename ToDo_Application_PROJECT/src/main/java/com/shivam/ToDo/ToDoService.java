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
        list.add(new ToDo("Learn Servlets and JSP .","Study"));
        list.add(new ToDo("Learn Spring Framework","Study"));
        list.add(new ToDo("Learn REST services.","Study"));
        list.add(new ToDo("Learn Node JS.","Study"));
    }

    public List<ToDo> getList(){
        return list;
    }

    public  void addToDo(String todo,String category){
        list.add(new ToDo(todo,category));
    }

    public boolean removeTodo(String todo,String category){

        return list.remove(new ToDo(todo,category));
    }
}
