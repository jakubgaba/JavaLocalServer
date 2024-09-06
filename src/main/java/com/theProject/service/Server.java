package com.theProject.service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private int port;

    public Server(int port) {
        this.port = port;
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("Client connected: " + socket.getInetAddress());
                
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Received: "+ line);
                    writer.println("Writer printed: "+ line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }           
}
}
