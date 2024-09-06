package com.theProject;

import com.theProject.GUI.MyPrettyGUI;
import com.theProject.service.Server;

public class Daddy {
    public static void main(String[] args) {
        int port = 8080;

        // Start the server in a new thread
        Thread serverThread = new Thread(() -> {
            Server server = new Server(port);
            server.start();
        });

        serverThread.start();  // Start the server thread

        // Launch the JavaFX application on the JavaFX Application Thread
        MyPrettyGUI.launch(MyPrettyGUI.class, args);
    }
}
