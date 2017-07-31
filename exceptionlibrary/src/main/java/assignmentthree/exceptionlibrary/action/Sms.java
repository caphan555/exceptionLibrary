package assignmentthree.exceptionlibrary.action;


import assignmentthree.exceptionlibrary.pojo.Action;

public class Sms extends RecommendedAction{

	@Override
	public String executeAction(Action action) {
		return action.getDescription();
	}

}
