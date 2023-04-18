package co.gov.sic.pruebarafael.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.gov.sic.pruebarafael.model.Persona;
import co.gov.sic.pruebarafael.model.Usuario;
import co.gov.sic.pruebarafael.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;

	@Override
	public Usuario Authenticacion(String login, String password) {
		return repositorio.authenticacion(login, password);
	}

	

}
