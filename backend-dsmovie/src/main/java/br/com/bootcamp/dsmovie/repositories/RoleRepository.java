package br.com.bootcamp.dsmovie.repositories;

import br.com.bootcamp.dsmovie.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
