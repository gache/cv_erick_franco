package fr.erickfranco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Erick Franco
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "diplome")
public class Diplome {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 80, nullable = false)
	private String nomDiplome;

	@Column(length = 40, nullable = false)
	private String ecole;

	@Column(length = 30, nullable = false)
	private String ville;

	@Column(columnDefinition = "Text")
	private String description;

//	@NotNull
//	@JsonFormat(pattern = "YYYY-MM-DD", shape = JsonFormat.Shape.STRING)
	private String annee;


}
