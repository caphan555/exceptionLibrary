package assignmentthree.exceptionlibrary.test;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import assignmentthree.exceptionlibrary.pojo.Action;
import assignmentthree.exceptionlibrary.service.ILibraryService;
import assignmentthree.exceptionlibrary.utilities.SetupTesting;
import assignmentthree.exceptionlibrary.exception.EmptyInputException;
import assignmentthree.exceptionlibrary.exception.ExceptionDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ModuleDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ProjectDoesNotExistException;;

public class ExceptionLibraryTest {


	@Test
	public void testExecutionSuccess() {
		try {
			SetupTesting sup = new SetupTesting();
			List<String> recommendedActions = sup.setup("bank", "withdraw", "java.lang.ArrayIndexOutOfBounds");

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
		sup.setup("", "withdraw", "java.lang.ArrayIndexOutOfBounds");
		} catch(ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = assignmentthree.exceptionlibrary.exception.EmptyInputException.class)
	public void testExecutionEmptyModuleInput() throws EmptyInputException {
		try {
		SetupTesting sup = new SetupTesting();
		sup.setup("bank", "", "java.lang.ArrayIndexOutOfBounds");
		} catch(ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = assignmentthree.exceptionlibrary.exception.EmptyInputException.class)
	public void testExecutionEmptyExceptionInput() throws EmptyInputException {
		try{
		SetupTesting sup = new SetupTesting();
		sup.setup("bank", "withdraw", "");
		} catch(ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testExecutionNullProjectInput() {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup(null, "withdraw", "java.lang.ArrayIndexOutOfBounds");
		} catch (EmptyInputException | ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = java.lang.NullPointerException.class)
	public void testExecutionNullModuleInput() {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup("bank", null, "java.lang.ArrayIndexOutOfBounds");
		} catch (EmptyInputException | ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = java.lang.NullPointerException.class)
	public void testExecutionNullExceptionInput() {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup("bank", "withdraw", null);
		} catch (EmptyInputException | ProjectDoesNotExistException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = assignmentthree.exceptionlibrary.exception.ProjectDoesNotExistException.class)
	public void testExecutionProjectNotFound() throws ProjectDoesNotExistException {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup("funfair", "withdraw", "java.lang.ArrayIndexOutOfBounds");
		} catch (EmptyInputException | ModuleDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = assignmentthree.exceptionlibrary.exception.ModuleDoesNotExistException.class)
	public void testExecutionModuleNotFound() throws ModuleDoesNotExistException {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup("bank", "invest", "java.lang.ArrayIndexOutOfBounds");
		} catch (EmptyInputException | ProjectDoesNotExistException | ExceptionDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = assignmentthree.exceptionlibrary.exception.ExceptionDoesNotExistException.class)
	public void testExecutionExceptionNotFound() throws ExceptionDoesNotExistException {
		try {
			SetupTesting sup = new SetupTesting();
			sup.setup("bank", "withdraw", "NoSuchException");
		} catch (EmptyInputException | ProjectDoesNotExistException | ModuleDoesNotExistException e) {
			e.printStackTrace();
		}
	}
}
