package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	//injection
	private JobTitleDao jobTitleDao;
	
	
	@Autowired //bizim yerimize new liyor. Çok önemli
	public JobTitleManager(JobTitleDao jobTitleDao) { //constructor
		super();
		this.jobTitleDao = jobTitleDao;
	}



	@Override
	public List<JobTitle> getAll() {
		//Dao çağır findAll() //jparepostiory'de gelir.
		
		return jobTitleDao.findAll(); 
	}

	
}
// Business Database'e git findAll() çalıştır.


