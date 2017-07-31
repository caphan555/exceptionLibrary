package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Project;

public class ProjectRepo implements IProjectRepo {

	private List<Project> projects;
	private String projectInfo;
	private Project foundProject;
	
	
	public ProjectRepo() {
		super();
	}

	public ProjectRepo(List<Project> projects) {
		this.projects = projects;
	}

	public String save(Project project) {
		return projectInfo;
	}

	public Project findOne(String name) {
		return foundProject;
	}

	public List<Project> findAll() {
		return projects;
	}

}
