package com.example.dzlica.firstmysql.repositories;

import com.example.dzlica.firstmysql.model.Todo;
import com.sun.tools.doclets.formats.html.markup.HtmlStyle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TodoRepo extends CrudRepository<Todo, Long> {
    List<Todo> findAllByDoneIsFalse();
    List<Todo> findAllByTitleIsLike(String title);

}
