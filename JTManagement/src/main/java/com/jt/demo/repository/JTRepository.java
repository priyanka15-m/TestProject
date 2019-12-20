package com.jt.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jt.demo.pojo.JtianBookIssue;

@Repository("jtRepo")
public interface JTRepository extends CrudRepository<JtianBookIssue, Integer>{

//	public JtianBookIssue findById(studentid);
	
}
