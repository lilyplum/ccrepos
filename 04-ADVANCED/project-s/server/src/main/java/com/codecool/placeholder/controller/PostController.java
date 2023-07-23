package com.codecool.placeholder.controller;

import com.codecool.placeholder.data.Post;
import com.codecool.placeholder.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/posts")
public class PostController {
private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> findAllPost(){return postService.findAllPost();
    }

    @GetMapping("/{id}")
    public Optional<Post> findPostById(@PathVariable Long id){
        return postService.findPostById(id);
    }

    @PostMapping
    public Post savePost(@RequestBody Post post){
        return postService.savePost(post);
    }

    @PutMapping
    public Post updatePost(@RequestBody Post post){
        return postService.updatePost(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id){
        postService.deletePost(id);

    }



}
