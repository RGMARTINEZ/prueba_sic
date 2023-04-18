package co.gov.sic.pruebarafael.service;

import java.util.List;

import co.gov.sic.pruebarafael.model.Tramite;

public interface TramitesService {

	Tramite TramiteById(long id);

	Tramite PostTramite(Tramite p);

	Tramite PutTramite(Tramite p);

	Tramite DeleteTramite(long id);

	List<Tramite> GetAllListado();

}
