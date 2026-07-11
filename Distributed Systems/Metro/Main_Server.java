import java.net.*;
import java.io.*;

public class Main_Server {
    public static void main(String[] args) { // Fixed main signature
        try (ServerSocket server = new ServerSocket(80)) {
            System.out.println("Server is listening on port 80...");
            
            while (true) { // Keep server running
                Socket client = server.accept();
                
                // Using BufferedReader for reliable text reading
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                PrintWriter out = new PrintWriter(client.getOutputStream(), true);

                // 1. Receive "Connect"
                String line = in.readLine();
                if (line != null && line.equalsIgnoreCase("Connect")) {
                    
                    // 2. Server sends implicit ACK/Ready (Optional based on diagram)
                    // 3. Receive "Request(station, id...)"
                    line = in.readLine(); 
                    if (line != null && line.startsWith("Request")) {
                        
                        // [Do some processing here]
                        System.out.println("Processing data: " + line);
                        
                        // 4. Send "Response(Recommendation, emergency, arrival times)"
                        out.println("Response(Proceed, None, 10:30)");
                        
                        // 5. Wait for ACK from Client
                        line = in.readLine();
                        if (line != null && line.equalsIgnoreCase("ACK")) {
                            System.out.println("Client acknowledged. Closing connection.");
                            client.close(); // 6. Close (until next Req)
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}