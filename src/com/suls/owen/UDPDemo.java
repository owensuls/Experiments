package com.suls.owen;

import java.net.*;
import java.util.Objects;

public class UDPDemo {
	public static int clientPort = 10014;
	public static int serverPort = 10015;
	public static int bufferSize = 1024;
	public static byte[] buffer = new byte[bufferSize];
	public static DatagramSocket socket;

	public static void main(String[] args) throws Exception {
		
		if (Objects.equals(args[0], "server")) {
			runMyServer();
		}
		else {
			runMyClient();
		}
	}

	private static void runMyServer () throws Exception {
		System.out.println("Executing server.");
		
		socket = new DatagramSocket(serverPort);
		
		socket.setReuseAddress(true);
		
		while (true) 
		{
			DatagramPacket packet = new DatagramPacket(buffer, bufferSize);

			socket.receive(packet);

			System.out.println(new String(packet.getData(), 0, packet.getLength()));
		}
	}
	
	private static void runMyClient () throws Exception {
		System.out.println("Executing client.");

		socket = new DatagramSocket(clientPort);

		socket.setReuseAddress(true);

		int position = 0;

		while (true) {

			int c = System.in.read();

			switch (c) {
			case -1:
				System.out.println("Exiting client.");
			case '\r':
				break;
			case '\n':
				DatagramPacket packet = new DatagramPacket(buffer, 0, bufferSize, InetAddress.getLocalHost(), serverPort);

				socket.send(packet);

				System.out.println("Sent to server.");
			default:
				buffer[position] = (byte) c;
				position++;
			}

		}
	}
}