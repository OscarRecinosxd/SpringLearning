package com.oscarrecinos.todo_application.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();


    private static int todosCount = 0;

    static{
        todos.add(new Todo(++todosCount, "in28minutes", "Learn AWS", LocalDate.now().plusDays(2), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn Javascript", LocalDate.now().plusDays(3), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn DevOps", LocalDate.now().plusDays(4), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn Typescript", LocalDate.now().plusDays(25), false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done){
        Todo todo = new Todo(++todosCount, username, description, targetDate, done);
        todos.add(todo);

    }

    public void deleteTodo(int id){
        todos.removeIf( todo -> todo.getId() == id);
    }
    
}
