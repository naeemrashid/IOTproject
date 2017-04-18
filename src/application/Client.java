package application;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public void createConnection() throws UnknownHostException, IOException{
		
		Socket client = new Socket("127.0.0.1", 2222);
		BufferedInputStream stream = new BufferedInputStream(client.getInputStream());
	}

}
