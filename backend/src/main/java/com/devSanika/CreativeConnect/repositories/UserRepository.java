package com.devSanika.CreativeConnect.repositories;

import com.devSanika.CreativeConnect.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

//JPA repository gives CRUD behavior
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmail(String email);

}


