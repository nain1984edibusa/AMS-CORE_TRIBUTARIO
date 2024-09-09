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
	  
//	  @Query(value = "Select * from IncripcionVta p where p.numeroRuc = ?1" , nativeQuery = true) 
//	  List<InscripcionVtaEntity> findByNumeroRuc(@Param("numeroRuc") String numeroRuc);
	  
	  
	  @Query("SELECT u FROM IncripcionVta u WHERE u.numeroRuc = ?1")
	  List<InscripcionVtaEntity> findByNumeroRuc(String numeroRuc);
	  
	  
	  
//	  @Query("Select * from IncripcionVta p where p.numeroRuc = :numeroRuc") 
//	  List<InscripcionVtaEntity> findByNumeroRuc(@Param("numeroRuc") String numeroRuc);

}
