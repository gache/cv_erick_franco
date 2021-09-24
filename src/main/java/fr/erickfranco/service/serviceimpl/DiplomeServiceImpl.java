package fr.erickfranco.service.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import fr.erickfranco.service.mapper.DiplomeMapper;
import fr.erickfranco.model.Diplome;
import fr.erickfranco.repositories.DiplomeRepository;
import fr.erickfranco.service.serviceInter.DiplomeService;
import fr.erickfranco.service.serviceDTO.DiplomeDTO;

@Service
public class DiplomeServiceImpl implements DiplomeService {

	private final DiplomeMapper diplomeMapper;
	private final DiplomeRepository diplomeRepo;

	public DiplomeServiceImpl(DiplomeMapper diplomeMapper, DiplomeRepository diplomeRepo) {
		this.diplomeMapper = diplomeMapper;
		this.diplomeRepo = diplomeRepo;
	}

	@Override
	public DiplomeDTO save(DiplomeDTO diplomeDTO) {
		Diplome diplome = diplomeMapper.ConvertDiplomeToDiplomeDTO(diplomeDTO);
		diplome = diplomeRepo.save(diplome);
		return diplomeMapper.ConvertDiplomeDTOToDiplome(diplome);
	}

	@Override
	public List<DiplomeDTO> findAllAsList() {
		return diplomeRepo.findAll().stream().map(diplomeMapper::ConvertDiplomeDTOToDiplome).collect(Collectors.toList());
	}

	@Override
	public Optional<DiplomeDTO> findOne(Long id) {
		return diplomeRepo.findById(id).map(diplomeMapper::ConvertDiplomeDTOToDiplome);
	}

	@Override
	public void delete(Long id) {
		diplomeRepo.deleteById(id);

	}

}
