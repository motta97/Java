import java.net.*;
import java.io.*;

public class Main_Client {
    Socket clinet = new Socket();
    DataInputStream is;
    DataOutputStream os;
    is = new DataInputStream(client.getInputStream());
    os= new DataOutputStream(client.getOutputSteam());
    
    String line = is.readLine();

}
