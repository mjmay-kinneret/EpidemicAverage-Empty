package il.ac.kinneret.mjmay.epidemic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Vector;

public class ParseNeighbors {
	
	/**
	 * Parses the neighbors file and loads up the list into a Vector
	 * @param fileName The neighbors file
	 * @return A Vector with the neighbors loaded up as Strings
	 */
	public static Vector<String> parseNeighbors (String fileName)
	{		
		Vector<String> neighbors = new Vector<>();
		
		try (BufferedReader brIn = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))){
			// open the file for reading
			// read it in line by line
			String line;
			while ( (line = brIn.readLine()) != null)
			{
				// see if the line has an IP address and port in it
				String[] parts = line.split(":");
				if ( parts.length >= 2)
				{	
					try {
					// try to make an IP address and port out of the parts
					InetAddress add = InetAddress.getByName(parts[0].trim());
					int port = Integer.parseInt(parts[1].trim());
					neighbors.addElement(add.toString().substring(1) + ":" + Integer.toString(port));
					}
					catch (UnknownHostException | NumberFormatException | SecurityException ex)
					{
						// something went wrong with the parsing and this isn't an address
						System.out.println("Error parsing address: " + parts[0] + " with port " + parts[1]);
					}
				}
			}
			// done reading the file, we have the neighbors			
			brIn.close();			
		} catch (FileNotFoundException e) {
			// can't get the file of neighbors
			System.out.println("Can't find neighbors file: " + fileName + ": " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error reading neighbors file: " + fileName + ": " + e.getMessage());
		}
		System.out.println("Loaded " + neighbors.size() + " neighbors");
		return neighbors;		
	}

}
