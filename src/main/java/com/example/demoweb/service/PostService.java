package com.example.demoweb.service;

import org.springframework.stereotype.Service;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demoweb.model.Post;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text) {
        Post post = new Post(null, text);
        postRepository.save(post);
    }
}
