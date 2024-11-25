package il.ac.kinneret.mjmay.epidemic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Thread to listen for incoming communications.  When a conversation comes in, we update the local shared value.
 *
 * @author Michael J. May
 * @version 2024
 */
public class IncomingListener extends Thread {

	/**
	 * The socket to listen on.
	 */
	ServerSocket server;

	public IncomingListener() {
		// TODO: Add argument and save it in the instance variable
	}

	@Override
	public void run() {

		// TODO: Listen for incoming conversations
	}
}
