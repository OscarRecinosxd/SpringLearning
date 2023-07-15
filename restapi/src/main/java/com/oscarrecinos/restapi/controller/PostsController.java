package com.oscarrecinos.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.oscarrecinos.restapi.model.Entities.Post;
import com.oscarrecinos.restapi.model.Entities.User;
import com.oscarrecinos.restapi.service.PostRepository;
import com.oscarrecinos.restapi.service.UserRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PostsController {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/jpa/users/{id}/posts")
    public List<Post> getPostByUser(@PathVariable Long id)  {
        User user = userRepository.findById(id).orElse(null);

        var a = user.getPosts();
        System.out.println("a vale " + a);
        return user.getPosts();
    }

    @PostMapping(value="/jpa/users/{id}/posts")
    public Post createPostForUser(@PathVariable Long id,@Valid @RequestBody Post newPost) {
        User user = userRepository.findById(id).orElse(null);
        newPost.setUser(user);

        postRepository.save(newPost);
        
        return newPost;
    }
    
    

    
}
