package com.codecool.placeholder.data;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;
    @Column(name="user_name")
    private  String userName;
    @Column(name="post_time")
    private LocalDateTime postTime;
    @Column(name="last_update")
    private LocalDateTime lastUpdated;
    @Column(name = "content")
    private String content;
//
    public Post(Long id, String userName, LocalDateTime postTime, LocalDateTime lastUpdated, String content) {
        this.id = id;
        this.userName = userName;
        this.postTime = postTime;
        this.lastUpdated = lastUpdated;
        this.content = content;
    }
    public Post() {
     this.postTime = LocalDateTime.now();
     this.lastUpdated = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getPostTime() {
        return postTime;
    }

    public void setPostTime(LocalDateTime postTime) {
        this.postTime = postTime;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
