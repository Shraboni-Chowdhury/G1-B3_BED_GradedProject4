package com.greatlearning.employeeManagementApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeeManagementApp.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
