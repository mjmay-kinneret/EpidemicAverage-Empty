package il.ac.kinneret.mjmay.epidemic;

import java.util.Timer;
import java.util.Vector;

public class SharedValues {

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
