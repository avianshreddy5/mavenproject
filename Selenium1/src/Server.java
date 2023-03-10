import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.util.Scanner;
import java.util.Set;

import io.netty.channel.unix.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try {
			ServerSocket soc = new ServerSocket(4000);
			System.out.println("server socket is created ready to accept the request");
			java.net.Socket s = soc.accept();
//			OutputStream ops=soc.getOutputStream();
//			DataOutputStream dop=new DataOutputStream(ops);
//			Scanner s=new Scanner(System.in);
//			System.out.println("enter a mes");
//			String  msg=s.nextLine();
//			dop.writeUTF(msg);
			InputStream ips = s.getInputStream();
			DataInputStream dis = new DataInputStream(ips);
			String msg = dis.readUTF();
			System.out.println(msg);
			OutputStream ops = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(ops);
			Scanner s1 = new Scanner(System.in);
			System.out.println("enter a msg");
			String msg1 = s1.nextLine();
			dos.writeUTF(msg1);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
