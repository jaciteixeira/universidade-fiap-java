package br.com.fiap.universidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.universidade.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
