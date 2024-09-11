package gob.mdmq.coretributario.msnegociogestiontributo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.InscripcionVtaEntity;

@Repository
public interface InscripcionVtaRepository extends JpaRepository<InscripcionVtaEntity, String>{

	//JPQL
	  @Query("SELECT u FROM IncripcionVta u WHERE u.numeroRuc = ?1")
	  List<InscripcionVtaEntity> findByNumeroRuc(String numeroRuc);
	
//	 @Query("Select p from IncripcionVta p where p.numeroRuc = :numeroRuc") 
//	  List<InscripcionVtaEntity> findByNumeroRuc(@Param("numeroRuc") String numeroRuc);
	
	//Query nativa
//	  @Query(value = "Select * from InscripcionVta p where p.numeroRuc = ?1" , nativeQuery = true) 
//	  List<InscripcionVtaEntity> findByNumeroRuc(String numeroRuc);
	  
	  
	  @Query("SELECT u FROM IncripcionVta u WHERE u.anio = ?1 and u.obligado = ?2 and u.personaSociedad =?3")
	  List<InscripcionVtaEntity> findByAnioObligadoPersonaSociedad(Short anio, String obligado, String personaSociedad);
	  
}
