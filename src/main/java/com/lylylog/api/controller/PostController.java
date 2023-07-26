package com.lylylog.api.controller;

import com.lylylog.api.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
public class PostController {
    // Http Method
    // GET POST PUT PATCH DELETE OPTIONS HEAD TRACE CONNECT
    // 글등록

    // 방법 1
//    @PostMapping("/posts")
//    public String post(@RequestParam String title, @RequestParam String content){
//        log.info("title={}, content={}", title, content);
//        return "Hello World!";
//    }
    // 방법 2
//    @PostMapping("/posts")
//    public String post(@RequestParam Map<String, String> params){
//        log.info("params={}", params);
//        return "Hello World!";
//    }
    // 방법 3
//    @PostMapping("/posts")
//    public String post(@ModelAttribute PostCreate params){
//        log.info("params={}", params);
//        return "Hello World!";
//    }
    // 방법 4 - json
    @PostMapping("/posts")
    public String post(@RequestBody PostCreate params){
        log.info("params={}", params);
        return "Hello World!";
    }

}
