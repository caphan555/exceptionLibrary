package assignmentthree.exceptionlibrary.repo;

import java.util.List;

import assignmentthree.exceptionlibrary.pojo.PossibleException;

public class PossibleExceptionRepo implements IExceptionRepo{
	
	private List<PossibleException> exceptions;
	private String exceptionInfo;
	private PossibleException foundException;
	
	public PossibleExceptionRepo() {
		super();
	}

	public PossibleExceptionRepo(List<PossibleException> exceptions) {
		this.exceptions = exceptions;
	}

	public String save(PossibleException exception) {
		return exceptionInfo;
	}

	public PossibleException findOne(String name) {
		return foundException;
	}

	public List<PossibleException> findAll() {
		return exceptions;
	}

}
