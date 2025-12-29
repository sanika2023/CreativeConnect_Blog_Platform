package com.devSanika.CreativeConnect.repositories;

import com.devSanika.CreativeConnect.domain.PostStatus;
import com.devSanika.CreativeConnect.domain.entities.Category;
import com.devSanika.CreativeConnect.domain.entities.Post;
import com.devSanika.CreativeConnect.domain.entities.Tag;
import com.devSanika.CreativeConnect.domain.entities.User;
import com.devSanika.CreativeConnect.services.PostService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
    List<Post> findAllByStatusAndCategoryAndTagsContaining(PostStatus status, Category category, Tag tag);
    List<Post> findAllByStatusAndCategory(PostStatus status, Category category);
    List<Post> findAllByStatusAndTagsContaining(PostStatus postStatus, Tag tag);
    List<Post> findAllByStatus(PostStatus status);
    List<Post> findAllByAuthorAndStatus(User author, PostStatus status);
}
