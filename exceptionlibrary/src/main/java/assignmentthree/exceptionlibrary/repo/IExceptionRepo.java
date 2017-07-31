package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.PossibleException;

public interface IExceptionRepo {
	public String save(PossibleException exception);
	public PossibleException findOne(String name);
	public List<PossibleException> findAll();
}
