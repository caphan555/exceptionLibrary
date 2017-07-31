package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Module;

public class ModuleRepo implements IModuleRepo{

	private List<Module> modules;
	
	
	
	public ModuleRepo() {
		super();
	}

	public ModuleRepo(List<Module> modules) {
		this.modules = modules;
	}

	public String save(Module module) {
		// TODO Auto-generated method stub
		return null;
	}

	public Module findOne(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Module> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
