
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Client extends JFrame {

	private JPanel contentPane;
	private JTextField ip;
	private JTextField pn;
	private JTextField comp;
	private JTextField recieve;
	private JTextField sendT;
	private JButton send;
	Socket s = null;
	Socket s2 = null;
	ServerSocket ss = null;
	InputStream is = null;
	DataInputStream dis = null;
	OutputStream os = null;
	DataOutputStream dos = null;

	InputStream is2 = null;
	DataInputStream dis2 = null;
	OutputStream os2 = null;
	DataOutputStream dos2 = null;
	private JButton read;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Client() {

		try {

			ss = new ServerSocket(3000);

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ip = new JTextField();
		ip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ip.setBounds(143, 65, 220, 38);
		contentPane.add(ip);
		ip.setColumns(10);

		pn = new JTextField();
		pn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pn.setColumns(10);
		pn.setBounds(544, 65, 210, 38);
		contentPane.add(pn);

		JButton btnNewButton = new JButton("Connect");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Connect
				try {
					String ipa = ip.getText();
					int pnn = Integer.valueOf(pn.getText());
					s = new Socket(ipa, pnn);
					JOptionPane.showMessageDialog(contentPane, "sent Request");
					os = s.getOutputStream();
					dos = new DataOutputStream(os);
					is = s.getInputStream();
					dis = new DataInputStream(is);
					comp.setText(ipa + " " + pnn);

				} catch (Exception e) {
					JOptionPane.showMessageDialog(contentPane, "something went wrong");
				}

			}
		});
		btnNewButton.setBounds(366, 113, 136, 47);
		contentPane.add(btnNewButton);

		comp = new JTextField();
		comp.setColumns(10);
		comp.setBounds(332, 170, 220, 29);
		contentPane.add(comp);

		recieve = new JTextField();
		recieve.setColumns(10);
		recieve.setBounds(95, 374, 713, 98);
		contentPane.add(recieve);

		sendT = new JTextField();
		sendT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		sendT.setColumns(10);
		sendT.setBounds(95, 205, 713, 98);
		contentPane.add(sendT);

		send = new JButton("Send");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// send button
				try {

					String msg = recieve.getText();
					dos.writeUTF(msg);
					JOptionPane.showMessageDialog(contentPane, "Message Sent");
					sendT.setText("");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(contentPane, "server left the chat");
				}

			}
		});
		send.setFont(new Font("Tahoma", Font.PLAIN, 16));
		send.setBounds(743, 482, 136, 33);
		contentPane.add(send);

		JLabel lblNewLabel_1 = new JLabel("IP Address");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(41, 67, 85, 33);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Message From");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(229, 172, 102, 20);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Port No");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(467, 70, 85, 33);
		contentPane.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel = new JLabel("IP:LOCALHOST");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(103, 10, 260, 38);
		contentPane.add(lblNewLabel);

		JLabel lblPort = new JLabel("PORT: 3000");
		lblPort.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPort.setBounds(532, 10, 260, 38);
		contentPane.add(lblPort);

		JButton accept = new JButton("Accept");
		accept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// accept
					s2 = ss.accept();

					JOptionPane.showMessageDialog(contentPane, "Request Accepted");

					is2 = s2.getInputStream();
					dis2 = new DataInputStream(is);
					os2 = s2.getOutputStream();
					dos2 = new DataOutputStream(os);
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});
		accept.setFont(new Font("Tahoma", Font.PLAIN, 16));
		accept.setBounds(353, 10, 136, 47);
		contentPane.add(accept);

		read = new JButton("Read");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// read
				try {
					String msg = dis2.readUTF();
					sendT.setText(msg);

				}

				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		read.setFont(new Font("Tahoma", Font.PLAIN, 16));
		read.setBounds(718, 313, 136, 33);
		contentPane.add(read);
	}
}
