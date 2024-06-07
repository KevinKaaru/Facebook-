package com.post.post.service.response;


import com.post.post.service.entity.Post;

public class PostResponse {
    private long postID;
    private String imageURL;
    private String description;
    private String postImgURL;

    public PostResponse(Post post) {
        this.postID= post.getPostID();
        this.imageURL=post.getImageURL();
        this.description=post.getDescription();
        this.postImgURL=post.getPostImgURL();
    }

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostImgURL() {
        return postImgURL;
    }

    public void setPostImgURL(String postImgURL) {
        this.postImgURL = postImgURL;
    }
}
