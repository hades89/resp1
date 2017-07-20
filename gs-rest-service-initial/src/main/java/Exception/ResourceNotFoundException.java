package Exception;

public class ResourceNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2210829348258516061L;

	public ResourceNotFoundException(String customMessage) {
		super(customMessage);
	}
}
