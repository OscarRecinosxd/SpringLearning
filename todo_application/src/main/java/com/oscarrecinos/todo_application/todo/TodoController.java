package com.oscarrecinos.todo_application.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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
    
}
