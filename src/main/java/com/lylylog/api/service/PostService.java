package com.lylylog.api.service;

import com.lylylog.api.domain.Post;
import com.lylylog.api.repository.PostRepository;
import com.lylylog.api.request.PostCreate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor // 초기화 되지않은 final 필드나, @NonNull 이 붙은 필드에 대해 생성자를 생성
public class PostService {

    private final PostRepository postRepository;
    public void write(PostCreate postCreate){
        // postCreate -> Entity
        Post post = new Post(postCreate.getTitle(), postCreate.getContent());
        postRepository.save(post);
    }
}
