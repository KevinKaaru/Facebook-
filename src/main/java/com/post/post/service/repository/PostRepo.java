package com.post.post.service.repository;



import com.post.post.service.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface PostRepo extends JpaRepository<Post,Long> {

    ArrayList<Post> findAll();
    Post save(Post post);


    void deleteById(Long postID);
}
