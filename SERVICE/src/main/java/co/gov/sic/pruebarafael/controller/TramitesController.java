package co.gov.sic.pruebarafael.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.gov.sic.pruebarafael.model.Tramite;
import co.gov.sic.pruebarafael.service.TramitesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TramitesController {

	@Autowired
	TramitesService serviceTramites;

	@GetMapping("/tramites")
	public ResponseEntity<List<Tramite>> getAllTramites() {
		try {
			List<Tramite> tramites = new ArrayList<Tramite>();

			tramites = serviceTramites.GetAllListado();

			if (tramites.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tramites, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/tramites/{id}")
	public ResponseEntity<Tramite> getTramiteById(@PathVariable("id") long id) {
		try {
			Tramite tramite = new Tramite();

			tramite = serviceTramites.TramiteById(id);

			if (tramite != null) {
				return new ResponseEntity<>(tramite, HttpStatus.OK);
			}

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/tramites")
	public ResponseEntity<Tramite> PostTramite(@RequestBody Tramite tramiteIn) {
		try {
			Tramite tramite = new Tramite();

			tramite = serviceTramites.PostTramite(tramiteIn);

			if (tramite != null) {
				return new ResponseEntity<>(tramite, HttpStatus.OK);
			}

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/tramites")
	public ResponseEntity<Tramite> PutTramite(@RequestBody Tramite tramiteIn) {
		try {
			Tramite tramite = new Tramite();

			tramite = serviceTramites.PutTramite(tramiteIn);

			if (tramite != null) {
				return new ResponseEntity<>(tramite, HttpStatus.OK);
			}

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
