package assignmentthree.exceptionlibrary.exception;

public class ProjectDoesNotExistException extends Exception {
	
	private static final long serialVersionUID = -7759119253515306631L;

	public ProjectDoesNotExistException() {
		super();
	}
	
	public ProjectDoesNotExistException(String message) {
		super(message);
	}
}
