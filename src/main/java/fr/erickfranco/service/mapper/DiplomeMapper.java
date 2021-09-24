package fr.erickfranco.service.mapper;

import org.mapstruct.Mapper;

import fr.erickfranco.model.Diplome;
import fr.erickfranco.service.serviceDTO.DiplomeDTO;

@Mapper(componentModel = "spring")
public interface DiplomeMapper  {

	DiplomeDTO ConvertDiplomeDTOToDiplome(Diplome diplome);

	Diplome ConvertDiplomeToDiplomeDTO(DiplomeDTO diplomeDTO);


}
