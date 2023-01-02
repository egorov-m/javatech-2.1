package com.example.demoweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demoweb.model.Post;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        Random random = new Random();
        String text = "Random number: ";

        ArrayList<Post> list = new ArrayList<Post>();
        new Post(text + random.nextInt());
        new Post(text + random.nextInt());
        new Post(text + random.nextInt());

        return list;
    }
}