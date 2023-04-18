package co.gov.sic.pruebarafael.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.gov.sic.pruebarafael.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query(value = "SELECT u.id as id,  u.login as login, u.password as password, u.idPersona as idPersona "
			+ "FROM usuario u " + "Where u.login= :login and u.password = :password", nativeQuery = true)

	Usuario authenticacion(@Param("login") String login, @Param("password") String password);
}
