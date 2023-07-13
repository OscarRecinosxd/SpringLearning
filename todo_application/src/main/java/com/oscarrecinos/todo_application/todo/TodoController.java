package com.oscarrecinos.todo_application.todo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch.qos.logback.core.model.Model;

@Controller
@SessionAttributes("username")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public String listAllTodos(ModelMap model){
        model.put("todos", todoService.findByUsername("in28minutes"));
        System.out.println(todoService.findByUsername("in28minutes"));
        return "listTodos";
    }

    @GetMapping("/add-todo")
    public String showNewTodoPage(){


        return "todo";
    }

    @PostMapping("/add-todo")
    public String addTodo(ModelMap model, Todo todo){
        String username = (String)model.get("username");
        todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
        return "redirect:todos";
    }
    
    @GetMapping("delete-todo")
    public String deleteTodo(@RequestParam int id){
       todoService.deleteTodo(id);
        return "redirect:todos";
    }

    @GetMapping(value="update-todo")
    public String showUpdateTodoPageString(@RequestParam int isDone) {
        return "todo";
    }
    

}
