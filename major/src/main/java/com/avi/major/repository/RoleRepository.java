package com.avi.major.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.avi.major.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
