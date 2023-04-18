package co.gov.sic.pruebarafael.service;

import co.gov.sic.pruebarafael.model.Usuario;

public interface UsuarioService {

	Usuario Authenticacion(String login, String password);

}
