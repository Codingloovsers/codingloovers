package com.yourapp;

public class Video {
    private String title;
    private String filePath;
    private String description;  // Optional: add a description for the video
    private String uploader;     // Optional: name of the person who uploaded the video

    // Constructor
    public Video(String title, String filePath, String description, String uploader) {
        this.title = title;
        this.filePath = filePath;
        this.description = description;
        this.uploader = uploader;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    // Additional fields and methods can be added as needed
}
