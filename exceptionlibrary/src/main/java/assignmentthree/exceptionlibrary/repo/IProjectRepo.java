package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Project;

public interface IProjectRepo {
	public String save(Project project);
	public Project findOne(String name);
	public List<Project> findAll();
}
