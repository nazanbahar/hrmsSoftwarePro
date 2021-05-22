package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}

//JpaRepository, otomatik curud operation, parametre: Entitiy türü, Integer: PrimaryKey Id veri türü
