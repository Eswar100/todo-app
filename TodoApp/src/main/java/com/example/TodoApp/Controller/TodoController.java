package com.example.TodoApp.Controller;

import com.example.TodoApp.Module.module;
import com.example.TodoApp.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/list")
    public List<module> getAllTodo(){
        return todoService.getAllTodo();
    }
    @PostMapping("/list")
    public module addTodo(@RequestBody module todo){
       return todoService.addTodo(todo);
    }
    @PutMapping("/{id}")
    public module updateTodo(@PathVariable int id,
                             @RequestBody module updatedTodo) {
        return todoService.updateTodo(id, updatedTodo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable int id){
        todoService.deleteTodo(id);
    }
}
