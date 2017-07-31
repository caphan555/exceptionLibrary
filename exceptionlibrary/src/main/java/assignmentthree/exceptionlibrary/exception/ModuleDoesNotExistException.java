package assignmentthree.exceptionlibrary.exception;

public class ModuleDoesNotExistException extends Exception{

	private static final long serialVersionUID = -4907021079532452513L;

	public ModuleDoesNotExistException() {
		super();
	}
	
	public ModuleDoesNotExistException(String message) {
		super(message);
	}
}
