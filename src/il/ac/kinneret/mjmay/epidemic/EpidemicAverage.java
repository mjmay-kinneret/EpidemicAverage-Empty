package il.ac.kinneret.mjmay.epidemic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.Vector;

/**
 * Main class for the Epidemic Average tool.  Contains the variables needed for setting up communication and threads.
 *
 * @author Michael J. May
 * @version 2024
 */
public class EpidemicAverage {

	/**
	 * How often to sync the neighbors (in seconds)
	 */
	public static int syncPeriod;
	/**
	 * The incoming listening thread
	 */
	static IncomingListener incomingListener;
	/**
	 * The Server socket (the one to listen on)
	 */
	static ServerSocket server;	

	/**
	 * Sets up the server and gets it listening
	 * @param args Command line parameters - the port and the name of the neighbors file
	 */
	public static void main(String[] args) {

		if ( args.length < 2)
		{
			System.out.println("Usage: EpidemicAverage port neighborsFilePath");
			System.exit(1);
		}

		// the parameters are the port and the neighbors file
		int myPort = Integer.parseInt(args[0]);
		String neighborsFile = args[1];

		// parse the neighbors file
		SharedValues.neighborList = ParseNeighbors.parseNeighbors(neighborsFile);

		// TODO: Start the incoming listener
		// TODO: Start the outgoing talker
		// TODO: Listen for commands from the command line to start and stop the tool.

		System.out.println("Stopped everything.  Final value is: ");
		System.out.println("Goodbye.");
	}
}
