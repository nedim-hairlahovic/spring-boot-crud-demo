package dev.nhairlahovic.crud.mapper;

import dev.nhairlahovic.crud.dto.PostDto;
import dev.nhairlahovic.crud.dto.PostRequest;
import dev.nhairlahovic.crud.model.Post;
import org.springframework.stereotype.Component;

@Component
public class PostMapper implements ResourceMapper<Post, PostRequest, PostDto, Long> {

    @Override
    public PostDto mapToDto(Post post) {
        return new PostDto(post.getId(), post.getTitle());
    }

    @Override
    public Post mapToEntity(PostRequest request) {
        return new Post(null, request.getTitle());
    }

    @Override
    public Post updateEntity(Long id, PostRequest request) {
        return new Post(id, request.getTitle());
    }
}
