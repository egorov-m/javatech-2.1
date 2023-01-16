package com.example.demoweb.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demoweb.model.Post;

@Service
public class PostService {
    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<Post>();
    }

    public List<Post> listAllPosts() {
        Random random = new Random();
        String text = "Random number: ";

        Calendar cal1 = Calendar.getInstance();
        cal1.set(2023, 01, 20);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2023, 01, 20);

        Calendar cal3 = Calendar.getInstance();
        cal3.set(2023, 01, 20);

        posts.add(new Post(text + random.nextInt(), cal1.getTime()));
        posts.add(new Post(text + random.nextInt(), cal2.getTime()));
        posts.add(new Post(text + random.nextInt(), cal3.getTime()));

        return posts;
    }

    public void create(String text) {
        Calendar cal = Calendar.getInstance();
        posts.add(new Post(text, cal.getTime()));
    }
}