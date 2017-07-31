package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Action;

public class ActionRepo implements IActionRepo{
	
	private List<Action> actions;
	
	
	
	public ActionRepo() {
		super();
	}

	public ActionRepo(List<Action> actions) {
		this.actions = actions;
	}

	public String save(Action action) {
		// TODO Auto-generated method stub
		return null;
	}

	public Action findOne(String action) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Action> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
