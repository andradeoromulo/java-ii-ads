package javachat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	
	public static void main(String[] args) {
		
		try {
			
			ServerSocket server = new ServerSocket(10000);
			System.out.println("Aguardando conexão do cliente na porta 10000");
			
			Socket client = server.accept();
			System.out.println("Conexão do cliente: " + client.getInetAddress());
			
			Scanner s = new Scanner(client.getInputStream());
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
			
			s.close();
			client.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
