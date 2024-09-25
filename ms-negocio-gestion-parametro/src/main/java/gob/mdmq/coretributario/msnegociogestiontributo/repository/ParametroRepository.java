package gob.mdmq.coretributario.msnegociogestiontributo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import gob.mdmq.coretributario.msnegociogestiontributo.entity.ParametroEntity;

@Repository
public interface ParametroRepository extends MongoRepository<ParametroEntity, Long>{
	
}
