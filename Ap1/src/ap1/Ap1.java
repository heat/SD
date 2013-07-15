/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ap1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author OnezinoGabriel
 */
public class Ap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        
        String msg = "Olá";
        
        byte[] buf = msg.getBytes();
        
        DatagramPacket p = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 2222);
        
        datagramSocket.send(p);
        
        buf = new byte[100];
        p = new DatagramPacket(buf, buf.length);
        
        datagramSocket.receive(p);
        
        System.out.println(new String(p.getData()));
        
    }
}
