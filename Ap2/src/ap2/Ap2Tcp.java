package ap2;

import java.net.*;
import java.io.*;

public class Ap2Tcp {

	public static void main(String[] args) 
		throws Exception {
		ServerSocket ss = new ServerSocket(300);

		Socket s = ss.accept();

		OutputStream o = s.getOutputStream();
		InputStream i = s.getInputStream();

		byte[] buff = new byte[10];

		i.read(buff);

		String msg = new String(buff);

		System.out.println(msg);
	}
}