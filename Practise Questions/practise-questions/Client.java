import java.io.*;
import java.net.*;

public class Client {
  public static void main(String[] args) throws IOException{
    Socket socket = new Socket("localhost",1234);

    PrintWriter out=new PrintWriter(socket.getOutputStream(),true);

    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    out.println("hello server");
    System.out.println("server"+in.readLine());
    socket.close();
  }
}
