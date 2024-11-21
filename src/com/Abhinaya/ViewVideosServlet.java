package com.yourapp;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewVideos")  // Maps to /viewVideos in the application
public class ViewVideosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Assuming VideoStorage is a utility class to manage video files
        List<Video> videos = VideoStorage.getAllVideos();  // Retrieves all stored videos

        // Add the videos list to the request to be accessible in the JSP or HTML page
        request.setAttribute("videos", videos);

        // Forward the request to view_videos.html or another display page
        request.getRequestDispatcher("view_videos.html").forward(request, response);
    }
}
