package co.gov.sic.pruebarafael.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gov.sic.pruebarafael.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
