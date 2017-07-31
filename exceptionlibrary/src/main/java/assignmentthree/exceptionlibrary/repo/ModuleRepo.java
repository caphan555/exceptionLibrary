package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Module;

public class ModuleRepo implements IModuleRepo{

	private List<Module> modules;
	private String moduleInfo;
	private Module foundModule;
	
	
	public ModuleRepo() {
		super();
	}

	public ModuleRepo(List<Module> modules) {
		this.modules = modules;
	}

	public String save(Module module) {
		return moduleInfo;
	}

	public Module findOne(String name) {
		return foundModule;
	}

	public List<Module> findAll() {
		return modules;
	}

}
