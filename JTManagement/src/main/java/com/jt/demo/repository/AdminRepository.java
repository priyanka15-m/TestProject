package com.jt.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jt.demo.pojo.AdminPojo;

@Repository("adminRepo")
public interface AdminRepository extends CrudRepository<AdminPojo, Integer> {

	public AdminPojo findByNameAndPassword(String name,String password);
}
