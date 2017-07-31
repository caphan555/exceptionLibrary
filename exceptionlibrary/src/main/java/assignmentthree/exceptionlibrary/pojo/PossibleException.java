package assignmentthree.exceptionlibrary.pojo;

import java.util.List;

public class PossibleException {
	private String name;
	private List<Action> actions;
	
	public PossibleException(String name, List<Action> actions) {
		this.name = name;
		this.actions = actions;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Action> getActions() {
		return actions;
	}
	
	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
}
