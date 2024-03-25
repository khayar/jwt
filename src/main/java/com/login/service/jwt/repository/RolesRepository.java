package com.login.service.jwt.repository;

import com.login.service.jwt.models.ERole;
import com.login.service.jwt.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
    Optional<Roles> findByName(ERole name);
}
