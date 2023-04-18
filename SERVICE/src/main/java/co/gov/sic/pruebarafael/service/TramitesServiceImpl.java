package co.gov.sic.pruebarafael.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.gov.sic.pruebarafael.model.Tramite;
import co.gov.sic.pruebarafael.repository.TramiteRepository;

@Service
public class TramitesServiceImpl implements TramitesService {

	@Autowired
	private TramiteRepository repositorio;

	@Override
	public Tramite TramiteById(long id) {

		if (repositorio.findById(id).isPresent()) {
			return repositorio.findById(id).get();
		} else {
			return new Tramite();
		}
	}

	@Override
	public Tramite PostTramite(Tramite p) {
		return repositorio.save(p);
	}

	@Override
	public Tramite PutTramite(Tramite p) {
		return repositorio.save(p);
	}

	@Override
	public Tramite DeleteTramite(long id) {
		Tramite tramite = repositorio.findById(id).get();
		if (tramite != null) {
			repositorio.delete(tramite);
		}
		return tramite;

	}

	@Override
	public List<Tramite> GetAllListado() {
		return repositorio.findAll();
	}

}
