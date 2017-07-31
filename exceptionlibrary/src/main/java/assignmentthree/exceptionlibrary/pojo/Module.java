package assignmentthree.exceptionlibrary.pojo;

import java.util.List;

public class Module {
	private String name;
	private List<PossibleException> possibleExceptions;
	
	public Module(String name, List<PossibleException> possibleExceptions) {
		this.name = name;
		this.possibleExceptions = possibleExceptions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PossibleException> getExceptions() {
		return possibleExceptions;
	}

	public void setExceptions(List<PossibleException> possibleExceptions) {
		this.possibleExceptions = possibleExceptions;
	}
}
