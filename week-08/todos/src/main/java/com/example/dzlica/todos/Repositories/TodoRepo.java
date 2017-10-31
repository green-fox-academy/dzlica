package com.example.dzlica.todos.Repositories;

import com.example.dzlica.todos.Model.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepo extends CrudRepository<Todo, Long> {

}
