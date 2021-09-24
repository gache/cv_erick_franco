package fr.erickfranco.service.serviceInter;

import java.util.List;
import java.util.Optional;

import fr.erickfranco.service.serviceDTO.DiplomeDTO;

public interface DiplomeService {

    DiplomeDTO save(DiplomeDTO diplomeDTO);

    List<DiplomeDTO> findAllAsList();

    Optional<DiplomeDTO> findOne(Long id);

    void delete(Long id);

}
