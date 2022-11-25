package kodlamaio.business;


import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.IInstructorDao;
import kodlamaio.entities.Instructor;

public class InstructorManager {
	private Logger[] loggers;
	private IInstructorDao iinstructorDao;
	
	public InstructorManager(IInstructorDao iinstructorDao, Logger[] loggers) 
	{	
		this.iinstructorDao = iinstructorDao;
		this.loggers = loggers;
	
	}

	
public void add(Instructor instructor) {
	iinstructorDao.add(instructor);
	for(Logger logger: loggers)
		 {logger.log();}}
	
public void update(Instructor instructor) {
	iinstructorDao.update(instructor);
	for(Logger logger: loggers)
		 {logger.log();}}

public void delete(Instructor instructor) {
	iinstructorDao.delete(instructor);
	for(Logger logger: loggers)
		 {logger.log();}}




}

