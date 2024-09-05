import java.io.*;
import java.net.*;

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
