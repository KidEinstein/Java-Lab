import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		Socket socket = new Socket("localhost", 8000);
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		
		while (true) {
			System.out.print("Your message: ");
			String message = in.nextLine();
			dos.writeUTF(message);
			dos.flush();
			System.out.println("Server says: " + dis.readUTF());
		}
	}
}
