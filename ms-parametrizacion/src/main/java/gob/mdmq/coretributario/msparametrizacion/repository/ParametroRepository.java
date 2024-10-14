package gob.mdmq.coretributario.msparametrizacion.repository;

import gob.mdmq.coretributario.msparametrizacion.entity.ParametroEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametroRepository extends MongoRepository<ParametroEntity, Integer> {
}
