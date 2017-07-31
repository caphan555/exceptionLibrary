package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.PossibleException;

public class PossibleExceptionRepo implements IExceptionRepo{
	
	private List<PossibleException> exceptions;
	
	
	public PossibleExceptionRepo() {
		super();
	}

	public PossibleExceptionRepo(List<PossibleException> exceptions) {
		this.exceptions = exceptions;
	}

	public String save(PossibleException exception) {
		// TODO Auto-generated method stub
		return null;
	}

	public PossibleException findOne(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<PossibleException> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
