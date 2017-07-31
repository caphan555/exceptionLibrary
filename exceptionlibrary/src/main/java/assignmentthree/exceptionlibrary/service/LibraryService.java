package assignmentthree.exceptionlibrary.service;

import java.util.ArrayList;
import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Action;
import assignmentthree.exceptionlibrary.pojo.Module;
import assignmentthree.exceptionlibrary.pojo.PossibleException;
import assignmentthree.exceptionlibrary.pojo.Project;
import assignmentthree.exceptionlibrary.action.RecommendedAction;
import assignmentthree.exceptionlibrary.exception.EmptyInputException;
import assignmentthree.exceptionlibrary.exception.ExceptionDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ModuleDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ProjectDoesNotExistException;

public class LibraryService implements ILibraryService {
	
	List<Project> projects;
	
	public LibraryService(List<Project> projects) {
		this.projects = projects;
	}

	public List<Action> provideSuggestedActions(String project, String module, String exception) 
			throws EmptyInputException, ProjectDoesNotExistException, ModuleDoesNotExistException,
			ExceptionDoesNotExistException{
		if(project == null || module == null || exception == null) {
			throw new NullPointerException();
		}
		if(("").equals(project) || ("").equals(module) || ("").equals(exception)) {
			throw new EmptyInputException();
		}
		
		int projectPresence = 0;
		int modulePresence = 0;
		int exceptionPresence = 0;
		for(Project p: projects) {
			if(p.getName().equals(project)) {
				projectPresence = 1;
				for(Module m: p.getModules()) {
					if(m.getName().equals(module)) {
						modulePresence = 1;
						for(PossibleException e:m.getExceptions()) {
							if(e.getName().equals(exception)) {
								exceptionPresence = 1;
								return e.getActions();
							}
						}
					}
				}
			}
		}
		
		if(projectPresence == 0) {
			throw new ProjectDoesNotExistException();
		} else if(modulePresence == 0) {
			throw new ModuleDoesNotExistException();
		} else if(exceptionPresence == 0) {
			throw new ExceptionDoesNotExistException();
		}
		
		return new ArrayList<>();
	}

	public List<String> handleAction(List<Action> actions) {
		List<String> recommendedActions = new ArrayList<>();
		for(Action a: actions) {
			String actionDescription = a.getDescription();
			String[] actionBreakdown = actionDescription.split(" ");
			
			try {
				String className = "assignmentthree.exceptionlibrary.action.";
				className += actionBreakdown[0];
				Class c = Class.forName(className);
				Object o = c.newInstance();
				RecommendedAction executingAction = (RecommendedAction) o;
				
				String suggestion = executingAction.executeAction(a);
				recommendedActions.add(suggestion);
				
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {

				e.printStackTrace();
			} 
		}
		return recommendedActions;
	}
}
