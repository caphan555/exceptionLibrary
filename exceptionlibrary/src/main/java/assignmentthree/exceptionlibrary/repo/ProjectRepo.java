package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Project;

public class ProjectRepo implements IProjectRepo {

	private List<Project> projects;
	
	
	
	public ProjectRepo() {
		super();
	}

	public ProjectRepo(List<Project> projects) {
		this.projects = projects;
	}

	public String save(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	public Project findOne(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
