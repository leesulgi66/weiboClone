package com.example.weiboclone.dto.responsedto;

import com.example.weiboclone.model.Posts;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDto {

    private Long postid;

    private String contents;

    private String username;

    private String profileimage;

    private String images;

    private LocalDateTime date;

    private Long commentcount;

    private Long like;

    private boolean likestate;

    public PostResponseDto(Posts posts) {

        this.postid = posts.getId();
        this.contents = posts.getContent();
        this.username = posts.getUsers().getUsername();
        this.profileimage = posts.getUsers().getUserProfileImage();
        this.images = posts.getImage();
        this.date = posts.getCreatedAt();
        this.commentcount = posts.getCommentcount();
        this.like = posts.getLikescount();
        this.likestate = posts.isLikestate();
    }

//    @Data
//    @NoArgsConstructor
//    @AllArgsConstructor
//    static class PostUserInfo {
//
//        private String username;
//        private String profile;
//    }
}
