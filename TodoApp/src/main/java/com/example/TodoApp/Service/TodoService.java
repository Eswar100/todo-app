package com.example.TodoApp.Service;

import com.example.TodoApp.Module.module;
import com.example.TodoApp.Repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;

    public List<module> getAllTodo(){
        return todoRepo.findAll();
    }


    public module addTodo(module todo) {
        return   todoRepo.save(todo);
    }

/*    public module updateTodo(int id, module updatedTodo) {

        module existingTodo = todoRepo.findById(id).orElse(null);

        if (existingTodo != null) {
            existingTodo.setName(updatedTodo.getName());
            existingTodo.setCompleted(updatedTodo.isCompleted());

            return todoRepo.save(existingTodo);
        }

        return null;
    }*/
public module updateTodo(int id, module todo) {
    return todoRepo.save(todo);
}
    public void deleteTodo(int id) {
        todoRepo.deleteById(id);
    }
}
