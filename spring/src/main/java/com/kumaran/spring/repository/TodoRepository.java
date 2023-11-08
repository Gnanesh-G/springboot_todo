package com.kumaran.spring.repository;

import com.kumaran.spring.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Todo> findAll(){
        return jdbcTemplate.query("SELECT * FROM TODO",new BeanPropertyRowMapper<>(Todo.class));
    }

    public Todo findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM TODO WHERE ID=?",new Object[]{id},new BeanPropertyRowMapper<>(Todo.class));
    }

    public List<Todo> insert(Todo todo) {
        jdbcTemplate.update("INSERT INTO TODO(NAME,PASSWORD) VALUES(?,?)",new Object[]{todo.getName(),todo.getPassword()});
        return findAll();
    }

    public List<Todo> update(Todo todo) {
        jdbcTemplate.update("UPDATE TODO SET NAME=?,PASSWORD=? WHERE ID=?;",new Object[]{todo.getName(),todo.getPassword(),todo.getId()});
        return findAll();

    }

    public List<Todo> deleteById(int id) {
     jdbcTemplate.update("DELETE FROM TODO WHERE ID=?;",new Object[]{id});
     return  findAll();
    }
}
