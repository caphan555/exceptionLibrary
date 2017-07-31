package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Action;

public class ActionRepo implements IActionRepo{
	
	private List<Action> actions;
	private String actionInfo;
	private Action foundAction;
	
	
	public ActionRepo() {
		super();
	}

	public ActionRepo(List<Action> actions) {
		this.actions = actions;
	}

	public String save(Action action) {
		return actionInfo;
	}

	public Action findOne(String action) {
		return foundAction;
	}

	public List<Action> findAll() {
		return actions;
	}

}
