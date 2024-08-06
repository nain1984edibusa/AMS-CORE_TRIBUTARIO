package com.mdmq.coretributario.ms_autenticacion_server.repository;

import com.mdmq.coretributario.ms_autenticacion_server.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findUserEntityByUsername(String username);

}

