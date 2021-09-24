package fr.erickfranco.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.erickfranco.service.serviceInter.DiplomeService;
import fr.erickfranco.service.serviceDTO.DiplomeDTO;

@RestController
@RequestMapping("/api")
public class DiplomeController {

	private final DiplomeService diplomeService;

	public DiplomeController(DiplomeService diplomeService) {
		this.diplomeService = diplomeService;
	}

	@GetMapping("diplome/all")
	public ResponseEntity<List<DiplomeDTO>> getAll() {
		List<DiplomeDTO> diplomeList = diplomeService.findAllAsList();
		return ResponseEntity.ok().body(diplomeList);
	}

	@PostMapping("/diplome")
	public ResponseEntity<DiplomeDTO> createDiplome(@Valid @RequestBody DiplomeDTO diplomeDTO)
			throws URISyntaxException {
		DiplomeDTO newDiplome = diplomeService.save(diplomeDTO);
		return ResponseEntity.created(new URI("api/diplome" + newDiplome.getId())).body(newDiplome);
	}

	@GetMapping("/diplome")
	public ResponseEntity<Optional<DiplomeDTO>> getId(@PathVariable Long id) {
		Optional<DiplomeDTO> diplomeId = diplomeService.findOne(id);
		return ResponseEntity.status(HttpStatus.OK).body(diplomeId);
	}

	@DeleteMapping("/diplome/{id}")
	public ResponseEntity<Void> deleteDiplome(@PathVariable Long id) throws URISyntaxException {
		try {
			diplomeService.delete(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}

	}

}
