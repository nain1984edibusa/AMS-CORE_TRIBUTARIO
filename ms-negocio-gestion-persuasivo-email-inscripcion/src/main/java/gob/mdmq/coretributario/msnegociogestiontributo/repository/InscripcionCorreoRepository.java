package gob.mdmq.coretributario.msnegociogestiontributo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.InscripcionCorreoEntity;

@Repository
public interface InscripcionCorreoRepository extends JpaRepository<InscripcionCorreoEntity, String>{

	//JPQL
	  
	  @Query("Select p from IncripcionCorreosVta p where p.numeroRuc like upper(:numeroRuc)"
	  ) List<InscripcionCorreoEntity> findByNumeroRuc(@Param("numeroRuc")
	  String numeroRuc);

}
