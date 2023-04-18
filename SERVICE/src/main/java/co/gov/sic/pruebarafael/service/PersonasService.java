package co.gov.sic.pruebarafael.service;

import java.util.List;

import co.gov.sic.pruebarafael.model.Persona;

public interface PersonasService {

	Persona PersonaById(long id);

	Persona PostPersona(Persona p);

	Persona PutPersona(Persona p);

	Persona DeletePersona(long id);

	List<Persona> GetAllListado();

}
