package assignmentthree.exceptionlibrary.action;


import assignmentthree.exceptionlibrary.pojo.Action;

public class Log extends RecommendedAction{

	@Override
	public String executeAction(Action action) {
		return action.getDescription();
	}

}
