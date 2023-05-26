package dev.joao.CodeGems.services;

import dev.joao.CodeGems.model.Post;

import java.util.List;

public interface BlogService {
    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);

}
