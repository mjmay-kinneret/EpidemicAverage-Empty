package il.ac.kinneret.mjmay.epidemic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Random;
import java.util.TimerTask;
import java.util.Vector;

/**
 * Class for initiating an outgoing communication session.  The local shared value will be updated after the conversation.
 * @author Michael J. May
 * @version 2024
 */
public class OutgoingTalker extends TimerTask {

	/**
	 * Builds an outgoing talker task
	 */
	public OutgoingTalker() {
	}

	/**
	 * Runs the task of choosing a random neighbor, starting a conversation with it,
	 * sending it the current value, getting the neighbor's current value, and then
	 * updating our current value accordingly.
	 */
	@Override
	public void run() {
	}
}
