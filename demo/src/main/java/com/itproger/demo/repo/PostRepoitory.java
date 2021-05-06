package com.itproger.demo.repo;

import com.itproger.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepoitory extends CrudRepository<Post,Long> {

}
