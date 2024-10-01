package dev.nhairlahovic.crud.controller;

import dev.nhairlahovic.crud.dto.PostDto;
import dev.nhairlahovic.crud.dto.PostRequest;
import dev.nhairlahovic.crud.mapper.PostMapper;
import dev.nhairlahovic.crud.model.Post;
import dev.nhairlahovic.crud.service.PostService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController extends CrudController<Post, PostRequest, PostDto, Long> {

    public PostController(PostService postService, PostMapper postMapper) {
        super(postService, postMapper);
    }
}
