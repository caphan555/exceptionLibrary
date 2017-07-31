package assignmentthree.exceptionlibrary.service;

import java.util.List;

import assignmentthree.exceptionlibrary.exception.EmptyInputException;
import assignmentthree.exceptionlibrary.exception.ExceptionDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ModuleDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ProjectDoesNotExistException;
import assignmentthree.exceptionlibrary.pojo.Action;


public interface ILibraryService {
	
	public List<Action> provideSuggestedActions(String project, String module, String exception) throws EmptyInputException, ProjectDoesNotExistException, ModuleDoesNotExistException, ExceptionDoesNotExistException;
	public List<String> handleAction(List<Action> actions);
}
