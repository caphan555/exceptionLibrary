package assignmentthree.exceptionlibrary.exception;

public class ExceptionDoesNotExistException extends Exception{

	private static final long serialVersionUID = -7519597270934172178L;

	public ExceptionDoesNotExistException() {
		super();
	}
	
	public ExceptionDoesNotExistException(String message) {
		super(message);
	}
}
