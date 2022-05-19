package com.verylinkedin.mypost.LikePost;

import com.verylinkedin.mypost.PostRepository;
import com.verylinkedin.mypost.models.Post;

import java.util.ArrayList;

public record LikePost(LikePostRequest request, PostRepository postRepository) {
    public void execute() {
        Post post = (Post) postRepository.findById(request.postId());
        ArrayList<String> likes = post.getLikes();

        if(likes == null){
            likes = new ArrayList<String>();
        }

        if(!likes.contains(request.userId())){
            likes.add(request.userId());
            post.setLikes(likes);
            postRepository.save(post);
        }
    }
}
