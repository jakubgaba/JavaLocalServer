package com.theProject;

import com.theProject.GUI.MyPrettyGUI;
import com.theProject.service.Server;

public class Daddy {
    public static void main(String[] args) {
        int port = 8080;
        MyPrettyGUI.launch(MyPrettyGUI.class, args);
        Server server = new Server(port);
        server.start();
 
    }
}