/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author OnezinoGabriel
 */
public class Ap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        DatagramSocket datagramSocket = new DatagramSocket(2222);
        
        String line = null;
        do {
        byte[] buf = new byte[100];
        
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        
       datagramSocket.receive(datagramPacket);
       
        System.out.println(new String(
                datagramPacket.getData()));
                
        buf = (nome + ":" + sc.nextLine()).getBytes();
        
        datagramPacket = new DatagramPacket(buf, buf.length, datagramPacket.getAddress(), datagramPacket.getPort());
        
        datagramSocket.send(datagramPacket);
        } while (true);
    }
}
