import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.util.Scanner;

import io.netty.channel.unix.Socket;

public class multimesgserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ServerSocket soc = null;
		OutputStream ops = null;
		DataOutputStream dop = null;
		InputStream ips = null;
		DataInputStream dis = null;
		Scanner s = null;

		try {
			soc = new ServerSocket(4000);
			System.out.println("server is ready to accept the req");
			java.net.Socket ssoc = soc.accept();
			System.out.println("request is accepted from the client side");
			ips = ssoc.getInputStream();
			dis = new DataInputStream(ips);
			ops = ssoc.getOutputStream();
			dop = new DataOutputStream(ops);

			s = new Scanner(System.in);
			for (;;) {
				String reply = dis.readUTF();
				System.out.println(reply);

				System.out.println("enter a mes");
				String msg = s.nextLine();
				dop.writeUTF(msg);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				soc.close();
				ops.close();
				dop.close();
				ips.close();
				dis.close();
				s.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
