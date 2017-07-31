package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.Module;

public interface IModuleRepo {
	public String save(Module module);
	public Module findOne(String name);
	public List<Module> findAll();
}
