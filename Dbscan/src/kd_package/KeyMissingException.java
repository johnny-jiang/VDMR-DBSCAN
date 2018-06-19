package kd_package;

public class KeyMissingException extends KDException {  /* made public by MSL */

    public KeyMissingException() {
	super("Key not found");
    }
    
    // arbitrary; every serializable class has to have one of these
    public static final long serialVersionUID = 3L;
    
}