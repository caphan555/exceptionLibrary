package assignmentthree.exceptionlibrary.action;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Action;

public class Email extends RecommendedAction{

	@Override
	public String executeAction(Action action) {
		return action.getDescription();
	}

}
