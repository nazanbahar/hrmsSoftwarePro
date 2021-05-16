package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	//injection
	private JobPositionDao jobPositionDao;
	
	
	@Autowired //bizim yerimize new liyor. Çok önemli
	public JobPositionManager(JobPositionDao jobPositionDao) { //constructor
		super();
		this.jobPositionDao = jobPositionDao;
	}



	@Override
	public List<JobPosition> getAll() {
		//Dao çağır findAll() //jparepostiory'de gelir.
		
		return jobPositionDao.findAll(); 
	}

	
}
// Business Database'e git findAll() çalıştır.


