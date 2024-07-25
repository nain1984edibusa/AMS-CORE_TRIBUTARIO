package gob.mdmq.coretributario.msadministracionserversecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import gob.mdmq.coretributario.msadministracionserversecurityjwt.entity.Role;

@Repository
public interface UsuarioRepository extends JpaRepository<Role, Integer>{

	

}
