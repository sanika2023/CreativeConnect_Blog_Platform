package com.devSanika.CreativeConnect.services;

import com.devSanika.CreativeConnect.domain.CreatePostRequest;
import com.devSanika.CreativeConnect.domain.UpdatePostRequest;
import com.devSanika.CreativeConnect.domain.entities.Post;
import com.devSanika.CreativeConnect.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPost(UUID id);
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
    Post createPost(User user, CreatePostRequest createPostRequest);
    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);
    void deletePost(UUID id);
}
