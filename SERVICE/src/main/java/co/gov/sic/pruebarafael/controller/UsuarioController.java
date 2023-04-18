package co.gov.sic.pruebarafael.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.gov.sic.pruebarafael.model.Usuario;
import co.gov.sic.pruebarafael.model.dto.AutenticacionDTO;
import co.gov.sic.pruebarafael.service.UsuarioService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioService serviceUsuario;

	@PostMapping("/autenticacion")
	public ResponseEntity<Usuario> getAutenticacionUsuario(@RequestBody AutenticacionDTO autenticacion) {
		try {
			Usuario usuario = new Usuario();

			usuario = serviceUsuario.Authenticacion(autenticacion.getLogin(), autenticacion.getPassword());

			if (usuario != null) {
				return new ResponseEntity<>(usuario, HttpStatus.OK);
			}

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
