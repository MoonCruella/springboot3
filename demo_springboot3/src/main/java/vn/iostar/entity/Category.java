package vn.iostar.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "categories")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "categoryname", columnDefinition = "varchar(50)")
	@NotEmpty(message = "Khong duoc bo trong")
	private String name;
	
	@Column(name = "images",columnDefinition = "varchar(500)")
	private String images;
	
	
	private int status;
	
	
	

}
