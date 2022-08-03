package com.example.weiboclone.dto;

import com.example.weiboclone.model.Posts;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDto {

    private Long id;
    private String contents;
    private String username;
    private String imageFileName;

    @JsonProperty(value = "writer")
    private PostUserInfo userInfo;

    private String uploadImageUrl;

    private LocalDateTime createdAt;

    public PostResponseDto(Posts posts) {

        this.id = posts.getId();
        this.contents = posts.getContent();
        this.username = posts.getUsers().getUsername();
        this.imageFileName = posts.getImage();
        this.uploadImageUrl = posts.getImage();
        this.createdAt = posts.getCreatedAt();
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class PostUserInfo {

        private String nickname;
        private String username;
        private String profile;
    }
}
