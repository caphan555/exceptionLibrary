package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Action;

public interface IActionRepo {
	public String save(Action action);
	public Action findOne(String action);
	public List<Action> findAll();
}
