package com.yourapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VideoStorage {
    private static final String VIDEO_DIRECTORY = "web/videos"; // Directory to store uploaded videos

    // List to store video metadata (could be replaced with a database)
    private static List<Video> videoList = new ArrayList<>();

    // Save video file to the directory and add metadata
    public static boolean saveVideo(byte[] videoData, String title, String description, String uploader) {
        try {
            // Create directory if it doesn't exist
            File directory = new File(VIDEO_DIRECTORY);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            // Create file and write video data
            String filePath = VIDEO_DIRECTORY + "/" + title + ".mp4"; // Customize file format if needed
            File videoFile = new File(filePath);
            try (FileOutputStream fos = new FileOutputStream(videoFile)) {
                fos.write(videoData);
            }

            // Add video metadata to the list
            Video video = new Video(title, filePath, description, uploader);
            videoList.add(video);

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Retrieve list of all stored videos
    public static List<Video> getAllVideos() {
        return new A
