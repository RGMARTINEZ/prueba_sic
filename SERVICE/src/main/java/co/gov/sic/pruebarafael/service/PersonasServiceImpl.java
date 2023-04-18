package co.gov.sic.pruebarafael.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.gov.sic.pruebarafael.model.Persona;
import co.gov.sic.pruebarafael.repository.PersonaRepository;

@Service
public class PersonasServiceImpl implements PersonasService {

	@Autowired
	private PersonaRepository repositorio;

	@Override
	public Persona PersonaById(long id) {
		if (repositorio.findById(id).isPresent()) {
			return repositorio.findById(id).get();
		} else {
			return new Persona();
		}
	}

	@Override
	public Persona PostPersona(Persona p) {
		return repositorio.save(p);
	}

	@Override
	public Persona PutPersona(Persona p) {
		return repositorio.save(p);
	}

	@Override
	public Persona DeletePersona(long id) {
		Persona persona = repositorio.findById(id).get();
		if (persona != null) {
			repositorio.delete(persona);
		}
		return persona;

	}

	@Override
	public List<Persona> GetAllListado() {
		return repositorio.findAll();
	}

}
