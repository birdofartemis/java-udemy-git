package com.company.poo.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private final Date date = new Date();
    private String title, content;
    private Integer likes;

    private List<Comment> commentsList = new ArrayList();


    public Post(String title, String content, Integer likes) {
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return commentsList;
    }
// Functions
    public void addComment(Comment comment){
        commentsList.add(comment);
    }
    public void removeComment(Comment comment) {
        commentsList.removeIf(x -> x.equals(comment));
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(title).append("\n").append(likes).append(" Likes - ")
                .append(sdf.format(date)).append("\n")
                .append("Comments:").append("\n");
        for(Comment comment : commentsList){
            sb.append(comment.getText()).append("\n");
        }

        return sb.toString();
    }
}
