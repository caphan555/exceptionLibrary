package assignmentthree.exceptionlibrary.exception;

public class EmptyInputException extends Exception {
	
	private static final long serialVersionUID = 8347130801191078836L;

	public EmptyInputException() {
		super();
	}
	
	public EmptyInputException(String message) {
		super(message);
	}
}
