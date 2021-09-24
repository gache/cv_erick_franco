package fr.erickfranco.service.serviceDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DiplomeDTO {
    private Long id;
    private String nomDiplome;
    private String ecole;
    private String ville;
    private String description;
    private String annee;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomDiplome() {
		return nomDiplome;
	}
	public void setNomDiplome(String nomDiplome) {
		this.nomDiplome = nomDiplome;
	}
	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
    
    

}
