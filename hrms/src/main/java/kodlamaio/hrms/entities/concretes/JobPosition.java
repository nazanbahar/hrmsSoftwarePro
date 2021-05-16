package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok

@Data  //getter-setter 
@Entity //Veritabanı Nesnesi
@Table(name="job_positions")  //veitabanı tablosuna kasilik
@NoArgsConstructor //parametresiz
@AllArgsConstructor //parameter constructor

public class JobPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //identity
	@Column(name="id")
	private int id;
	@Column(name="title")
	//@Column(name="title_a")
	private String title;
}
