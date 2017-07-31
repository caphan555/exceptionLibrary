package assignmentthree.exceptionlibrary.utilities;

import java.util.List;

import assignmentthree.exceptionlibrary.App;
import assignmentthree.exceptionlibrary.exception.EmptyInputException;
import assignmentthree.exceptionlibrary.exception.ExceptionDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ModuleDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ProjectDoesNotExistException;
import assignmentthree.exceptionlibrary.pojo.Action;
import assignmentthree.exceptionlibrary.service.ILibraryService;

public class SetupTesting {
	
	public List<String> setup(String project, String module, String exception) throws EmptyInputException, ProjectDoesNotExistException, ModuleDoesNotExistException, ExceptionDoesNotExistException{
		App app = new App();
		
		ILibraryService ls = app.setupLibrary();
		List<Action> savedActions = app.provideSolutions(ls, project, module, exception);
		return app.recommendActions(ls, savedActions);
	}
}
