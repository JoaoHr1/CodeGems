package dev.joao.CodeGems.repository;

import dev.joao.CodeGems.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Post ,Long> {
}
