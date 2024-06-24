package gob.mdmq.coretributario.msnegociogestiontributo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.PeriodoEntity;

@Repository
public interface PeriodoRepository extends JpaRepository<PeriodoEntity, Long>{

	
	//JPQL
	  
	  @Query("Select r from Periodo r where r.periodoId = 1 ")
		List<PeriodoEntity> findAllCustom();
	  
		/*
		 * @Query("Select p from Tributo p where upper(p.razonSocial) like upper(:razonSocial) and p.estado='1'"
		 * ) List<TributoEntity> findByLikeRazonSocial(@Param("razonSocial") String
		 * razonSocial);
		 */
	  
	  //SQL
	  
	  @Modifying
	  
	  @Query(nativeQuery = true, value =
	  "update tbl_cliente set estado='0' where cliente_id=:id") void
	  deleteCustom(@Param("id") Long id);
	 
	
	
	// Agregates(DTO, Optimizacion de consultas)
}
