package com.aktway.services.profile.api.response;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by rames on 04-08-2019.
 */
@Component
public class MyPrivatePostData {
    private String postName;
    private List<String> tagList;
    private String postId;
    private String postedDate;
    private String postPicture;

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public String getPostPicture() {
        return postPicture;
    }

    public void setPostPicture(String postPicture) {
        this.postPicture = postPicture;
    }
}
