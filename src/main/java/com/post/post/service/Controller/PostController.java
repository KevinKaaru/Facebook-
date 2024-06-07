package com.post.post.service.Controller;

import com.post.post.service.entity.Post;
import com.post.post.service.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/postService")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/save")

    public ArrayList<Post> submitPost(@RequestBody Post body) {
        ArrayList<Post> result = postService.submitPostToDB(body);
        return result;
    }

    @GetMapping("/getPost")
    public ArrayList<Post> retrieveAllPost() {
        ArrayList<Post> result = postService.retrievePostFromDB();
        return result;
    }

    @DeleteMapping("/delete/{postID}")
    public ArrayList<Post> deleteParticularPost(@PathVariable("postID") Long postID) {
        ArrayList<Post> result = postService.deletePostFromDB(postID);
        return result;


}



}
