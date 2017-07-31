package assignmentthree.exceptionlibrary.action;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Action;

public class Call extends RecommendedAction{

	@Override
	public String executeAction(Action action) {
		
		return action.getDescription();
	}

}
