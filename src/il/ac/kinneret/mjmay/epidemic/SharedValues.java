package il.ac.kinneret.mjmay.epidemic;

import java.util.Timer;
import java.util.Vector;

/**
 * Singleton shared values for the tool - neighbors list and local value.  Don't forget to use mutual exclusion for the shared
 * value to prevent concurrency problems.
 *
 * @author Michael J. May
 * @version 2024
 */
public class SharedValues {

	// TODO: Add a shared value and use mutual exclusion to protect it.

	/**
	 * The list of neighbors loaded from the file
	 */
	public static Vector<String> neighborList;

	/**
	 * The outgoing talking thread
	 */
	public static Timer outgoingTalkerTimer;
	private SharedValues() {
	}
	
	static SharedValues instance = null;
	/**
	 * Gets the singleton instance of the shared values object
	 * @return The singleton instance
	 */
	public static SharedValues getInstance()
	{
		if ( instance == null)
		{
			instance = new SharedValues();
		}
		return instance;
	}


}
