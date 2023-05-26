package dev.joao.CodeGems.services.implservice;

import dev.joao.CodeGems.model.Post;
import dev.joao.CodeGems.repository.PostsRepository;
import dev.joao.CodeGems.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    PostsRepository postsRepository;

    @Override
    public List<Post> findAll() {
        return postsRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return postsRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return postsRepository.save(post);
    }

}
