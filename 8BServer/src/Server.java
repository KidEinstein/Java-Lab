import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws Exception {
			Scanner in = new Scanner(System.in);
			ServerSocket serverSocket = new ServerSocket(8000);
			Socket socket;
			socket = serverSocket.accept();
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			while (true) {
				System.out.println("Client says: " + dis.readUTF());
				System.out.print("Your message: ");
				String message = in.nextLine();
				dos.writeUTF(message);
				dos.flush();
			}
	}
	
}
