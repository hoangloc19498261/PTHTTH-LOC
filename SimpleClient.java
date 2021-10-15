import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleClient {
//	public final static String SERVER_IP = "127.0.0.1";
//	public final static int SERVER_PORT = 9540;
	
	public static void main(String[] args) {
		try {
			
			Socket s = new Socket("127.0.0.1", 9540);
			System.out.println("Client da duoc tao");
		
			
			Scanner welcome = new Scanner(s.getInputStream());
			System.out.println("server: " + welcome.nextLine());
							
			String msg_out = "", msg_in = "";
			while(!msg_out.equals("bye") && !msg_in.equals("bye")) {
				
				PrintStream outToServer = new PrintStream(s.getOutputStream());	
				Scanner scan = new Scanner(System.in);
				msg_out = scan.nextLine();
				outToServer.println(msg_out);
				
				Scanner inFromServer = new Scanner(s.getInputStream());
				msg_in = inFromServer.nextLine();
				System.out.println("server: "+msg_in);
				
			}


			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}