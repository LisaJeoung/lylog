package com.lylylog.api.controller;

import com.lylylog.api.domain.Post;
import com.lylylog.api.request.PostCreate;
import com.lylylog.api.response.PostResponse;
import com.lylylog.api.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping("/posts")
    public void post(@RequestBody @Valid PostCreate request) {
        postService.write(request);
    }

    @GetMapping("/posts/{postId}") // 글 하나 조회
    public PostResponse get(@PathVariable Long postId){
        return postService.get(postId);
    }

    @GetMapping("/posts") // 글 여러개 조회
    public List<PostResponse> getList(){
        return postService.getList();
    }
}
