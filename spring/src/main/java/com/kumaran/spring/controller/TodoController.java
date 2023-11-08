package com.kumaran.spring.controller;

import com.kumaran.spring.model.Todo;
import com.kumaran.spring.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/show/all")
    public List<Todo> getAllDetails() {
        return todoRepository.findAll();
    }

    @GetMapping("/show/{id}")
    public Todo getTodoDetailsById(@PathVariable int id) {
        return todoRepository.findById(id);
    }
    @PostMapping("/show/add")
    public List<Todo> addDetails(@RequestBody Todo todo) {
        return todoRepository.insert(todo);
    }
    @PutMapping("/show")
    public List<Todo> updateDetails(@RequestBody Todo todo) {
        return todoRepository.update(todo);
    }
    @DeleteMapping("/show/{id}")
    public List<Todo> deleteDetails(@PathVariable int id) {
        return todoRepository.deleteById(id);
    }
}



