package com.example.dzlica.firstmysql.repositories;

import com.example.dzlica.firstmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TodoRepo extends CrudRepository<Todo, Long> {
    List<Todo> findAllByDoneIsFalse();

}
