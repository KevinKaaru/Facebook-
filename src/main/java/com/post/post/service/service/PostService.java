package com.post.post.service.service;


import com.post.post.service.entity.Post;
import com.post.post.service.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    @Autowired
    PostRepo postRepo;

    public ArrayList<Post> submitPostToDB(Post postData) {
        postRepo.save(postData);
        ArrayList<Post> result = retrievePostFromDB();
        return result;
    }

    public ArrayList<Post> retrievePostFromDB() {
        ArrayList<Post> result = postRepo.findAll();
        return result;
    }

    public ArrayList<Post> deletePostFromDB(Long postID) {
        postRepo.deleteById(postID);
        ArrayList<Post> result = retrievePostFromDB();
        return result;
    }
}
