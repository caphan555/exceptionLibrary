package assignmentthree.exceptionlibrary.test;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import assignmentthree.exceptionlibrary.utilities.SetupTesting;
import assignmentthree.exceptionlibrary.exception.EmptyInputException;
import assignmentthree.exceptionlibrary.exception.ExceptionDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ModuleDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ProjectDoesNotExistException;;

public class ExceptionLibraryTest {
	
	private static final String MODULE = "withdraw";
	private static final String PROJECT = "bank";
	private static final String EXCEPTION = "java.lang.ArrayIndexOutOfBounds";

	@Test
	public void testExecutionSuccess() {
		try {
			SetupTesting sup = new SetupTesting();
			List<String> recommendedActions = sup.setup(PROJECT, MODULE, EXCEPTION);

			assertEquals("Log to info.txt with encryption to the text file ", recommendedActions.get(0));
			assertEquals("Email to jen@gmail.com ", recommendedActions.get(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expected = assignmentthree.exceptionlibrary.exception.EmptyInputException.class)
	public void testExecutionEmptyProjectInput() throws EmptyInputException {
		try{
		SetupTesting sup = new SetupTesting();
		sup.setup("", MODULE, EXCEPTION);
		} catch(ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = assignmentthree.exceptionlibrary.exception.EmptyInputException.class)
	public void testExecutionEmptyModuleInput() throws EmptyInputException {
		try {
		SetupTesting sup = new SetupTesting();
		sup.setup(PROJECT, "", EXCEPTION);
		} catch(ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = assignmentthree.exceptionlibrary.exception.EmptyInputException.class)
	public void testExecutionEmptyExceptionInput() throws EmptyInputException {
		try{
		SetupTesting sup = new SetupTesting();
		sup.setup(PROJECT, MODULE, "");
		} catch(ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testExecutionNullProjectInput() {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup(null, MODULE, EXCEPTION);
		} catch (EmptyInputException | ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = java.lang.NullPointerException.class)
	public void testExecutionNullModuleInput() {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup(PROJECT, null, EXCEPTION);
		} catch (EmptyInputException | ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = java.lang.NullPointerException.class)
	public void testExecutionNullExceptionInput() {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup(PROJECT, MODULE, null);
		} catch (EmptyInputException | ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = assignmentthree.exceptionlibrary.exception.ProjectDoesNotExistException.class)
	public void testExecutionProjectNotFound() throws ProjectDoesNotExistException {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup("funfair", MODULE, EXCEPTION);
		} catch (EmptyInputException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = assignmentthree.exceptionlibrary.exception.ModuleDoesNotExistException.class)
	public void testExecutionModuleNotFound() throws ModuleDoesNotExistException {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup(PROJECT, "invest", EXCEPTION);
		} catch (EmptyInputException | ProjectDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = assignmentthree.exceptionlibrary.exception.ExceptionDoesNotExistException.class)
	public void testExecutionExceptionNotFound() throws ExceptionDoesNotExistException {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup(PROJECT, MODULE, "NoSuchException");
		} catch (EmptyInputException | ProjectDoesNotExistException | ModuleDoesNotExistException e) {
			e.printStackTrace();
		}
	}
}
