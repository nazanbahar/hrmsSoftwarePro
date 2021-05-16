package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}

//JpaRepository, otomatik curud operation, parametre: Entitiy türü, Integer: PrimaryKey Id veri türü
