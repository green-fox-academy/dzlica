package com.example.dzlica.firstmysql.repositories;

import com.example.dzlica.firstmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepo extends CrudRepository<Todo, Long> {

}
