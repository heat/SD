package ap1;

import java.net.Socket;
import java.net.InetAddress;

import java.io.InputStream;
import java.io.OutputStream;

public class Ap1Tcp {


	public static void main(String[] args) throws Exception {
		Socket  server = new Socket(InetAddress.getLocalHost(), 300);

		OutputStream o = server.getOutputStream();
		InputStream i = server.getInputStream();

		String msg = "Olá";

		o.write(
			msg.getBytes());
	}
}