package com.lylylog.api.controller;

import com.lylylog.api.request.PostCreate;
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
        // Case 1. 저장한 데이터 Entity -> response로 응답
        // Case 2. 저장한 데이터의 primary_id -> reponse로 응답
        //         Client에서는 수신한 id를 글 조회 API를 통해서 데이터를 수신받음
        // Case 3. 응답 필요없음 -> Client에서 모든 POST(글) 데이터 context를 관리함
        // Bad Case : 서버에서 -> 반드시 이렇게 한다 fix
        //          -> 서버에서 차라리 유연하게 대응하는 것이 좋음 -> 코드를 잘 짜자
        //          -> 한 번에 일괄적으로 잘 처리되는 케이스는 별로 없음 -> 잘 관리하는 형태가 중요
        postService.write(request);
    }

}
