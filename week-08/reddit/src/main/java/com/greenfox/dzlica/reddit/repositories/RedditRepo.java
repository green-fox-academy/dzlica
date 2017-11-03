package com.greenfox.dzlica.reddit.repositories;

import com.greenfox.dzlica.reddit.model.Reddit;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepo extends CrudRepository<Reddit, Long> {

}
