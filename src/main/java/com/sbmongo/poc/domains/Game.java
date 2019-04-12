package com.sbmongo.poc.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * GAME class
 */
@Document
public class Game implements Serializable {

    @Id
    private String gameHash;
    private String title;
    private String editor;
    private String description;
    private String imgUrl;
    private String videoUrl;
    private String engine;
    private String developer;
    private String reputationLevel;
    private Date publishedDate;
    private List<String> platformList;

    public Game() {
        this.title = "";
        this.editor = "";
        this.description = "";
        this.imgUrl = "";
        this.videoUrl = "";
        this.engine = "";
        this.developer = "";
        this.reputationLevel = "";
        this.publishedDate = null;
        this.platformList = null;
    }

    public Game(
            String title,
            String editor,
            String description,
            String imgUrl,
            String videoUrl,
            String engine,
            String developer,
            String reputationLevel,
            Date publishedDate,
            List<String> platformList
    ) {
        this.title = title;
        this.editor = editor;
        this.description = description;
        this.imgUrl = imgUrl;
        this.videoUrl = videoUrl;
        this.engine = engine;
        this.developer = developer;
        this.reputationLevel = reputationLevel;
        this.publishedDate = publishedDate;
        this.platformList = platformList;
    }

    public String getGameHash() {
        return gameHash;
    }

    public void setGameHash(String gameHash) {
        this.gameHash = gameHash;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public List<String> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<String> platformList) {
        this.platformList = platformList;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getReputationLevel() {
        return reputationLevel;
    }

    public void setReputationLevel(String reputationLevel) {
        this.reputationLevel = reputationLevel;
    }
}
