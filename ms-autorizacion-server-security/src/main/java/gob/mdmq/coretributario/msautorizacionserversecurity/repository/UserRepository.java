package gob.mdmq.coretributario.msautorizacionserversecurity.repository;

//import com.zair.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gob.mdmq.coretributario.msautorizacionserversecurity.entity.User;

import java.util.Optional;

/**
 * Repositorio de datos para la entidad User.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
