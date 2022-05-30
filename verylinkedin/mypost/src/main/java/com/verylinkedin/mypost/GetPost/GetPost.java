package com.verylinkedin.mypost.GetPost;

import com.verylinkedin.mypost.PostRepository;
import com.verylinkedin.mypost.models.Post;
import org.springframework.data.mongodb.core.mapping.Document;

public record GetPost(GetPostRequest request, PostRepository postRepository) {
    public Document execute() {
        Document post = (Document) postRepository.findById(request.postId());
        return   post;
    }
}
