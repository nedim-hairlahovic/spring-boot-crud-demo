package dev.nhairlahovic.crud.service;

import dev.nhairlahovic.crud.repository.PostRepository;
import dev.nhairlahovic.crud.filter.FilterCriteria;
import dev.nhairlahovic.crud.filter.FilterOperation;
import dev.nhairlahovic.crud.model.OperationCheck;
import dev.nhairlahovic.crud.model.Post;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService extends CrudService<Post, Long> {

    public PostService(PostRepository repository) {
        super(repository);
    }

    @Override
    public String getResourceType() {
        return "Post";
    }

    @Override
    public Optional<FilterCriteria> getFilterCriteria() {
        return Optional.of(new FilterCriteria("title", FilterOperation.LIKE));
    }

    @Override
    public OperationCheck isCreatable(Post resource) {
        return new OperationCheck(true, OPERATION_DENIED_MESSAGE);
    }

    @Override
    public OperationCheck isEditable(Post resource) {
        return new OperationCheck(true, OPERATION_DENIED_MESSAGE);
    }

    @Override
    public OperationCheck isDeletable(Post resource) {
        return new OperationCheck(true, OPERATION_DENIED_MESSAGE);
    }
}
